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
import cn.com.certusnet.cloud.flexom.client.service.HostGroupService;
import cn.com.certusnet.cloud.flexom.model.hostgroup.HostGroup;
import cn.com.certusnet.cloud.flexom.model.hostgroup.domain.HostGroupDomain;

/**   
 * @ClassName: HostGroupServiceImpl   
 * @Description: TODO
 * @author zhuhq  
 * @date 2018年12月24日 下午10:09:59      
 */
public class HostGroupServiceImpl extends BaseServiceCommon implements HostGroupService
{
    
    private String LOCATION = "/hostgroup";
        
        
    /**   
     * @Description constructors      
     * @param api   
     *
     */    
    public HostGroupServiceImpl(BaseApi api)
    {
        super(api);
        setUri(LOCATION);
        // TODO Auto-generated constructor stub
    }

    /**   
     * @Title: list   
     * @author zhuhq
     * @Description:TODO     
     * @param params
     * @return    
     * @date 2018年12月24日 下午10:10:42 
     * @see cn.com.certusnet.cloud.flexom.client.BaseService#list(java.util.Map)    
     */    
    @SuppressWarnings("unchecked")
    @Override
    public List<? extends HostGroup> list(Map<String, Object> params)
    {
        // TODO Auto-generated method stub
        return (List<? extends HostGroup>) super.doList(HostGroupDomain.class, params);
    }

}
