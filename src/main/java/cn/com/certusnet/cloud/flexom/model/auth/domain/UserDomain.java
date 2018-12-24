/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.cloud.flexom.model.auth.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import cn.com.certusnet.cloud.flexom.model.auth.User;
import cn.com.certusnet.cloud.flexom.model.auth.builder.UserBuilder;

/**   
 * @ClassName: UserDomain   
 * @Description: TODO
 * @author zhuhq  
 * @date 2018年12月20日 下午8:40:45      
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class UserDomain implements User
{
    private static final long serialVersionUID = 1L;
    
    private String name;
    
    private String password;
    
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String sig;
    
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private boolean admin;

        
    /**   
     * @Title: toBuilder   
     * @author zhuhq
     * @Description:TODO     
     * @return    
     * @date 2018年12月20日 下午8:40:55 
     * @see cn.com.certusnet.cloud.flexom.Buildable#toBuilder()    
     */    
    @Override
    public UserBuilder toBuilder()
    {
        // TODO Auto-generated method stub
        return new UserConcreteBuilder(this);
    }

        
    /**   
     * @Title: getName   
     * @author zhuhq
     * @Description:TODO     
     * @return    
     * @date 2018年12月20日 下午8:40:55 
     * @see cn.com.certusnet.cloud.flexom.model.auth.User#getName()    
     */    
    @Override
    public String getName()
    {
        // TODO Auto-generated method stub
        return name;
    }

        
    /**   
     * @Title: getPassword   
     * @author zhuhq
     * @Description:TODO     
     * @return    
     * @date 2018年12月20日 下午8:40:55 
     * @see cn.com.certusnet.cloud.flexom.model.auth.User#getPassword()    
     */    
    @Override
    public String getPassword()
    {
        // TODO Auto-generated method stub
        return password;
    }

        
    /**   
     * @Title: getSig   
     * @author zhuhq
     * @Description:TODO     
     * @return    
     * @date 2018年12月20日 下午8:40:55 
     * @see cn.com.certusnet.cloud.flexom.model.auth.User#getSig()    
     */    
    @Override
    public String getSig()
    {
        // TODO Auto-generated method stub
        return sig;
    }

        
    /**   
     * @Title: getAdmin   
     * @author zhuhq
     * @Description:TODO     
     * @return    
     * @date 2018年12月20日 下午8:40:55 
     * @see cn.com.certusnet.cloud.flexom.model.auth.User#getAdmin()    
     */    
    @Override
    public boolean getAdmin()
    {
        // TODO Auto-generated method stub
        return admin;
    }
    
    public static UserBuilder builder() {
        return new UserConcreteBuilder();
    }
    
    public static class UserConcreteBuilder implements UserBuilder {

        private UserDomain u;
        
        
        /**   
         * @Description constructors         
         *
         */
        UserConcreteBuilder()
        {
            // TODO Auto-generated constructor stub
            this(new UserDomain());
        }
        
        UserConcreteBuilder(UserDomain user) {
            this.u = user;
        }
        
        /**   
         * @Title: build   
         * @author zhuhq
         * @Description:TODO     
         * @return    
         * @date 2018年12月20日 下午8:44:01 
         * @see cn.com.certusnet.cloud.flexom.Buildable.Builder#build()    
         */    
        @Override
        public User build()
        {
            // TODO Auto-generated method stub
            return u;
        }

            
        /**   
         * @Title: from   
         * @author zhuhq
         * @Description:TODO     
         * @param in
         * @return    
         * @date 2018年12月20日 下午8:44:01 
         * @see cn.com.certusnet.cloud.flexom.Buildable.Builder#from(cn.com.certusnet.cloud.flexom.Buildable)    
         */    
        @Override
        public UserBuilder from(User in)
        {
            // TODO Auto-generated method stub
            u = (UserDomain) in;
            return this;
        }

            
        /**   
         * @Title: name   
         * @author zhuhq
         * @Description:TODO     
         * @param name
         * @return    
         * @date 2018年12月20日 下午8:44:01 
         * @see cn.com.certusnet.cloud.flexom.model.auth.builder.UserBuilder#name(java.lang.String)    
         */    
        @Override
        public UserBuilder name(String name)
        {
            // TODO Auto-generated method stub
            u.name = name;
            return this;
        }

            
        /**   
         * @Title: password   
         * @author zhuhq
         * @Description:TODO     
         * @param password
         * @return    
         * @date 2018年12月20日 下午8:44:01 
         * @see cn.com.certusnet.cloud.flexom.model.auth.builder.UserBuilder#password(java.lang.String)    
         */    
        @Override
        public UserBuilder password(String password)
        {
            // TODO Auto-generated method stub
            u.password = password;
            return this;
        }

            
        /**   
         * @Title: sig   
         * @author zhuhq
         * @Description:TODO     
         * @param sig
         * @return    
         * @date 2018年12月20日 下午8:44:01 
         * @see cn.com.certusnet.cloud.flexom.model.auth.builder.UserBuilder#sig(java.lang.String)    
         */    
        @Override
        public UserBuilder sig(String sig)
        {
            // TODO Auto-generated method stub
            u.sig = sig;
            return this;
        }

            
        /**   
         * @Title: admin   
         * @author zhuhq
         * @Description:TODO     
         * @param admin
         * @return    
         * @date 2018年12月20日 下午8:44:01 
         * @see cn.com.certusnet.cloud.flexom.model.auth.builder.UserBuilder#admin(boolean)    
         */    
        @Override
        public UserBuilder admin(boolean admin)
        {
            // TODO Auto-generated method stub
            u.admin = admin;
            return this;
        }
        
    }

  
}
