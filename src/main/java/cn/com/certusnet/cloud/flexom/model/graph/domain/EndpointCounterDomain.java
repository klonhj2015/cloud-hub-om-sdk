/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.cloud.flexom.model.graph.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.com.certusnet.cloud.flexom.model.graph.EndpointCounter;
import cn.com.certusnet.cloud.flexom.model.graph.builder.EndpointCounterBuilder;

/**   
 * @ClassName: EndpointCountDomain   
 * @Description: TODO
 * @author zhuhq  
 * @date 2018年12月24日 下午4:10:36      
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class EndpointCounterDomain implements EndpointCounter
{

        
        
    /**    
     * @Fields serialVersionUID : TODO
     */    
    private static final long serialVersionUID = 1L;
    
    private String counter;
    
    @JsonProperty("endpoint_id")
    private int endpointId;
    
    private int step;
    
    private String type;
    
    public static EndpointCounterConcreteBuilder builder() {
        return new EndpointCounterConcreteBuilder();
    }

        
    
    public static class EndpointCounterConcreteBuilder implements EndpointCounterBuilder{

        private EndpointCounterDomain ecd;
        
        EndpointCounterConcreteBuilder() {
            this(new EndpointCounterDomain());
        }
        
        EndpointCounterConcreteBuilder(EndpointCounterDomain ecd) {
            this.ecd = ecd;
        }
        /**   
         * @Title: build   
         * @author zhuhq
         * @Description:TODO     
         * @return    
         * @date 2018年12月24日 下午4:24:20 
         * @see cn.com.certusnet.cloud.flexom.Buildable.Builder#build()    
         */    
        @Override
        public EndpointCounter build()
        {
            // TODO Auto-generated method stub
            return ecd;
        }

            
        /**   
         * @Title: from   
         * @author zhuhq
         * @Description:TODO     
         * @param in
         * @return    
         * @date 2018年12月24日 下午4:24:20 
         * @see cn.com.certusnet.cloud.flexom.Buildable.Builder#from(cn.com.certusnet.cloud.flexom.Buildable)    
         */    
        @Override
        public EndpointCounterBuilder from(EndpointCounter in)
        {
            // TODO Auto-generated method stub
            ecd = (EndpointCounterDomain) in;
            return this;
        }

            
        /**   
         * @Title: count   
         * @author zhuhq
         * @Description:TODO     
         * @param count
         * @return    
         * @date 2018年12月24日 下午4:24:20 
         * @see cn.com.certusnet.cloud.flexom.model.graph.builder.EndpointCounterBuilder#count(java.lang.String)    
         */    
        @Override
        public EndpointCounterBuilder count(String count)
        {
            // TODO Auto-generated method stub
            ecd.counter = count;
            return this;
        }

            
        /**   
         * @Title: endpointId   
         * @author zhuhq
         * @Description:TODO     
         * @param endpointId
         * @return    
         * @date 2018年12月24日 下午4:24:20 
         * @see cn.com.certusnet.cloud.flexom.model.graph.builder.EndpointCounterBuilder#endpointId(int)    
         */    
        @Override
        public EndpointCounterBuilder endpointId(int endpointId)
        {
            // TODO Auto-generated method stub
            ecd.endpointId = endpointId;
            return this;
        }

            
        /**   
         * @Title: step   
         * @author zhuhq
         * @Description:TODO     
         * @param step
         * @return    
         * @date 2018年12月24日 下午4:24:20 
         * @see cn.com.certusnet.cloud.flexom.model.graph.builder.EndpointCounterBuilder#step(int)    
         */    
        @Override
        public EndpointCounterBuilder step(int step)
        {
            // TODO Auto-generated method stub
            ecd.step = step;
            return this;
        }

            
        /**   
         * @Title: type   
         * @author zhuhq
         * @Description:TODO     
         * @param type
         * @return    
         * @date 2018年12月24日 下午4:24:20 
         * @see cn.com.certusnet.cloud.flexom.model.graph.builder.EndpointCounterBuilder#type(java.lang.String)    
         */    
        @Override
        public EndpointCounterBuilder type(String type)
        {
            // TODO Auto-generated method stub
            ecd.type = type;
            return this;
        }
        
    }

        
    /**   
     * @Title: toBuilder   
     * @author zhuhq
     * @Description:TODO     
     * @return    
     * @date 2018年12月24日 下午4:22:35 
     * @see cn.com.certusnet.cloud.flexom.Buildable#toBuilder()    
     */    
    @Override
    public EndpointCounterBuilder toBuilder()
    {
        // TODO Auto-generated method stub
        return new EndpointCounterConcreteBuilder(this);
    }

        
    /**   
     * @Title: getCounter   
     * @author zhuhq
     * @Description:TODO     
     * @return    
     * @date 2018年12月24日 下午4:22:35 
     * @see cn.com.certusnet.cloud.flexom.model.graph.EndpointCounter#getCounter()    
     */    
    @Override
    public String getCounter()
    {
        // TODO Auto-generated method stub
        return counter;
    }

        
    /**   
     * @Title: getEndpointId   
     * @author zhuhq
     * @Description:TODO     
     * @return    
     * @date 2018年12月24日 下午4:22:35 
     * @see cn.com.certusnet.cloud.flexom.model.graph.EndpointCounter#getEndpointId()    
     */    
    @Override
    public int getEndpointId()
    {
        // TODO Auto-generated method stub
        return endpointId;
    }

        
    /**   
     * @Title: getStep   
     * @author zhuhq
     * @Description:TODO     
     * @return    
     * @date 2018年12月24日 下午4:22:35 
     * @see cn.com.certusnet.cloud.flexom.model.graph.EndpointCounter#getStep()    
     */    
    @Override
    public int getStep()
    {
        // TODO Auto-generated method stub
        return step;
    }

        
    /**   
     * @Title: getType   
     * @author zhuhq
     * @Description:TODO     
     * @return    
     * @date 2018年12月24日 下午4:22:35 
     * @see cn.com.certusnet.cloud.flexom.model.graph.EndpointCounter#getType()    
     */    
    @Override
    public String getType()
    {
        // TODO Auto-generated method stub
        return type;
    }
    
    
   

}
