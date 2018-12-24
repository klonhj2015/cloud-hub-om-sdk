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
import cn.com.certusnet.cloud.flexom.client.service.EndpointService;
import cn.com.certusnet.cloud.flexom.model.graph.Endpoint;
import cn.com.certusnet.cloud.flexom.model.graph.domain.EndpointDomain;

/**   
 * @ClassName: EndpointServiceImpl   
 * @Description: TODO
 * @author zhuhq  
 * @date 2018年12月24日 下午9:13:47      
 */
public class EndpointServiceImpl extends BaseServiceCommon implements EndpointService
{

    private String LOCATION = "/graph/endpoint"; 
    
    /**   
     * @Description constructors      
     * @param api   
     *
     */    
    public EndpointServiceImpl(BaseApi api)
    {
        super(api);
        super.setUri(LOCATION);
        // TODO Auto-generated constructor stub
    }

        
    /**   
     * @Title: list   
     * @author zhuhq
     * @Description:TODO     
     * @param clz
     * @param params
     * @return    
     * @date 2018年12月24日 下午9:21:10 
     * @see cn.com.certusnet.cloud.flexom.client.BaseService#list(java.lang.Class, java.util.Map)    
     */    
    @SuppressWarnings("unchecked")
    @Override
    public List<? extends Endpoint> list(Map<String, Object> params)
    {
        // TODO Auto-generated method stub
        return (List<? extends Endpoint>) super.doList(EndpointDomain.class, params);
    }

}
