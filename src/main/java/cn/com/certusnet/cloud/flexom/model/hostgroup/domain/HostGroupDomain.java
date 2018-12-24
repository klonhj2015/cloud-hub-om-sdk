/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.cloud.flexom.model.hostgroup.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.com.certusnet.cloud.flexom.model.hostgroup.HostGroup;
import cn.com.certusnet.cloud.flexom.model.hostgroup.builder.HostGroupBuilder;

/**   
 * @ClassName: HostGroupDomain   
 * @Description: TODO
 * @author zhuhq  
 * @date 2018年12月24日 下午9:59:22      
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class HostGroupDomain implements HostGroup
{

        
        
    /**    
     * @Fields serialVersionUID : TODO
     */    
    private static final long serialVersionUID = 1L;
    
    private int id;
    
    @JsonProperty("grp_name")
    private String grpname;
    
    @JsonProperty("create_user")
    private String createuser;

    public static HostGroupBuilder builder() {
        return new HostGroupConcreteBuilder();
    }

    /**   
     * @Title: toBuilder   
     * @author zhuhq
     * @Description:TODO     
     * @return    
     * @date 2018年12月24日 下午9:59:56 
     * @see cn.com.certusnet.cloud.flexom.Buildable#toBuilder()    
     */    
    @Override
    public HostGroupBuilder toBuilder()
    {
        // TODO Auto-generated method stub
        return new HostGroupConcreteBuilder(this);
    }

        
    /**   
     * @Title: getId   
     * @author zhuhq
     * @Description:TODO     
     * @return    
     * @date 2018年12月24日 下午9:59:56 
     * @see cn.com.certusnet.cloud.flexom.model.hostgroup.HostGroup#getId()    
     */    
    @Override
    public int getId()
    {
        // TODO Auto-generated method stub
        return id;
    }

        
    /**   
     * @Title: getGrpName   
     * @author zhuhq
     * @Description:TODO     
     * @return    
     * @date 2018年12月24日 下午9:59:56 
     * @see cn.com.certusnet.cloud.flexom.model.hostgroup.HostGroup#getGrpName()    
     */    
    @Override
    public String getGrpName()
    {
        // TODO Auto-generated method stub
        return grpname;
    }

        
    /**   
     * @Title: getCreateUser   
     * @author zhuhq
     * @Description:TODO     
     * @return    
     * @date 2018年12月24日 下午9:59:56 
     * @see cn.com.certusnet.cloud.flexom.model.hostgroup.HostGroup#getCreateUser()    
     */    
    @Override
    public String getCreateUser()
    {
        // TODO Auto-generated method stub
        return createuser;
    }
    
    public static class HostGroupConcreteBuilder implements HostGroupBuilder{
        
        private HostGroupDomain hgd;
        
        HostGroupConcreteBuilder() {
            this(new HostGroupDomain());
        }
        
        HostGroupConcreteBuilder(HostGroupDomain hgd) {
            this.hgd = hgd;
        }

            
        /**   
         * @Title: build   
         * @author zhuhq
         * @Description:TODO     
         * @return    
         * @date 2018年12月24日 下午10:00:52 
         * @see cn.com.certusnet.cloud.flexom.Buildable.Builder#build()    
         */    
        @Override
        public HostGroup build()
        {
            // TODO Auto-generated method stub
            return hgd;
        }

            
        /**   
         * @Title: from   
         * @author zhuhq
         * @Description:TODO     
         * @param in
         * @return    
         * @date 2018年12月24日 下午10:00:52 
         * @see cn.com.certusnet.cloud.flexom.Buildable.Builder#from(cn.com.certusnet.cloud.flexom.Buildable)    
         */    
        @Override
        public HostGroupBuilder from(HostGroup in)
        {
            // TODO Auto-generated method stub
            hgd = (HostGroupDomain) in;
            return this;
        }

            
        /**   
         * @Title: id   
         * @author zhuhq
         * @Description:TODO     
         * @param id
         * @return    
         * @date 2018年12月24日 下午10:00:52 
         * @see cn.com.certusnet.cloud.flexom.model.hostgroup.builder.HostGroupBuilder#id(int)    
         */    
        @Override
        public HostGroupBuilder id(int id)
        {
            // TODO Auto-generated method stub
            hgd.id =  id;
            return this;
        }

            
        /**   
         * @Title: grpName   
         * @author zhuhq
         * @Description:TODO     
         * @param grpname
         * @return    
         * @date 2018年12月24日 下午10:00:52 
         * @see cn.com.certusnet.cloud.flexom.model.hostgroup.builder.HostGroupBuilder#grpName(java.lang.String)    
         */    
        @Override
        public HostGroupBuilder grpName(String grpname)
        {
            // TODO Auto-generated method stub
            hgd.grpname = grpname;
            return this;
        }

            
        /**   
         * @Title: createUser   
         * @author zhuhq
         * @Description:TODO     
         * @param username
         * @return    
         * @date 2018年12月24日 下午10:00:52 
         * @see cn.com.certusnet.cloud.flexom.model.hostgroup.builder.HostGroupBuilder#createUser(java.lang.String)    
         */    
        @Override
        public HostGroupBuilder createUser(String createUser)
        {
            // TODO Auto-generated method stub
            hgd.createuser = createUser;
            return this;
        }
        
    }

    




}
