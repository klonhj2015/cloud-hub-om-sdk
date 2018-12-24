/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.cloud.flexom.model.graph.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import cn.com.certusnet.cloud.flexom.model.graph.Endpoint;
import cn.com.certusnet.cloud.flexom.model.graph.builder.EndpointBuilder;

/**   
 * @ClassName: EndpointDomain   
 * @Description: TODO
 * @author zhuhq  
 * @date 2018年12月21日 下午2:08:27      
 */

@JsonIgnoreProperties(ignoreUnknown=true)
public class EndpointDomain implements Endpoint
{

        
        
    /**    
     * @Fields serialVersionUID : TODO
     */    
    private static final long serialVersionUID = 1L;
    
    
    
    private String endpoint;
    
    private int id;


    public static EndpointBuilder builder() {
        return new EndpointConcreteBuilder();
    }
    
        
    /**   
     * @Title: getEndpoint   
     * @author zhuhq
     * @Description:TODO     
     * @return    
     * @date 2018年12月21日 下午2:08:43 
     * @see cn.com.certusnet.cloud.flexom.model.graph.Endpoint#getEndpoint()    
     */    
    @Override
    public String getEndpoint()
    {
        // TODO Auto-generated method stub
        return endpoint;
    }

        
    /**   
     * @Title: getId   
     * @author zhuhq
     * @Description:TODO     
     * @return    
     * @date 2018年12月21日 下午2:08:43 
     * @see cn.com.certusnet.cloud.flexom.model.graph.Endpoint#getId()    
     */    
    @Override
    public int getId()
    {
        // TODO Auto-generated method stub
        return id;
    }
    
    public static class EndpointConcreteBuilder implements EndpointBuilder {
        
        private EndpointDomain ed ;
        
        
        EndpointConcreteBuilder()
        {
            // TODO Auto-generated constructor stub
            this(new EndpointDomain());
        }
        
        EndpointConcreteBuilder(EndpointDomain ed) {
            this.ed = ed;
        }
        
        

            
        /**   
         * @Title: build   
         * @author zhuhq
         * @Description:TODO     
         * @return    
         * @date 2018年12月21日 下午2:09:49 
         * @see cn.com.certusnet.cloud.flexom.Buildable.Builder#build()    
         */    
        @Override
        public Endpoint build()
        {
            // TODO Auto-generated method stub
            return ed;
        }

            
        /**   
         * @Title: from   
         * @author zhuhq
         * @Description:TODO     
         * @param in
         * @return    
         * @date 2018年12月21日 下午2:09:50 
         * @see cn.com.certusnet.cloud.flexom.Buildable.Builder#from(cn.com.certusnet.cloud.flexom.Buildable)    
         */    
        @Override
        public EndpointBuilder from(Endpoint in)
        {
            // TODO Auto-generated method stub
            ed = (EndpointDomain) in;
            return this;
        }

            
        /**   
         * @Title: endpoint   
         * @author zhuhq
         * @Description:TODO     
         * @return    
         * @date 2018年12月21日 下午2:09:50 
         * @see cn.com.certusnet.cloud.flexom.model.graph.builder.EndpointBuilder#endpoint()    
         */    
        @Override
        public EndpointBuilder endpoint(String endpoint)
        {
            // TODO Auto-generated method stub
            ed.endpoint = endpoint;
            return this;
        }

            
        /**   
         * @Title: id   
         * @author zhuhq
         * @Description:TODO     
         * @return    
         * @date 2018年12月21日 下午2:09:50 
         * @see cn.com.certusnet.cloud.flexom.model.graph.builder.EndpointBuilder#id()    
         */    
        @Override
        public EndpointBuilder id(int id)
        {
            // TODO Auto-generated method stub
            ed.id = id;
            return this;
        }
        
    }

        
    /**   
     * @Title: toBuilder   
     * @author zhuhq
     * @Description:TODO     
     * @return    
     * @date 2018年12月21日 下午2:17:26 
     * @see cn.com.certusnet.cloud.flexom.Buildable#toBuilder()    
     */    
    @Override
    public EndpointBuilder toBuilder()
    {
        // TODO Auto-generated method stub
        return new EndpointConcreteBuilder(this);
    }




        
    /**   
     * @Title: uri   
     * @author zhuhq
     * @Description:TODO     
     * @return    
     * @date 2018年12月24日 下午2:18:20 
     * @see cn.com.certusnet.cloud.flexom.ModelEntity#uri()    
     */    
}
