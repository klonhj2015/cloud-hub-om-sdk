/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.cloud.flexom.client.service.impl;

import java.util.List;
import java.util.Map;

import cn.com.certusnet.cloud.flexom.client.BaseApi;
import cn.com.certusnet.cloud.flexom.client.BaseServiceCommon;
import cn.com.certusnet.cloud.flexom.client.service.EndpointCounterService;
import cn.com.certusnet.cloud.flexom.model.graph.EndpointCounter;
import cn.com.certusnet.cloud.flexom.model.graph.domain.EndpointCounterDomain;

/**   
 * @ClassName: EndpointCounterServiceImpl   
 * @Description: TODO
 * @author zhuhq  
 * @date 2018年12月24日 下午9:43:18      
 */
public class EndpointCounterServiceImpl extends BaseServiceCommon implements EndpointCounterService
{
    private String LOCATION = "/graph/endpoint_counter";
        
        
    /**   
     * @Description constructors      
     * @param api   
     *
     */    
    public EndpointCounterServiceImpl(BaseApi api)
    {
        super(api);
        super.setUri(LOCATION);
        // TODO Auto-generated constructor stub
    }

    /**   
     * @Title: list   
     * @author zhuhq
     * @Description:TODO     
     * @param params
     * @return    
     * @date 2018年12月24日 下午9:44:02 
     * @see cn.com.certusnet.cloud.flexom.client.BaseService#list(java.util.Map)    
     */    
    @SuppressWarnings("unchecked")
    @Override
    public List<? extends EndpointCounter> list(Map<String, Object> params)
    {
        // TODO Auto-generated method stub
        return (List<? extends EndpointCounter>) super.doList(EndpointCounterDomain.class, params);
    }

}
