/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.cloud.flexom.client;

import cn.com.certusnet.cloud.flexom.client.service.EndpointCounterService;
import cn.com.certusnet.cloud.flexom.client.service.EndpointService;
import cn.com.certusnet.cloud.flexom.client.service.HostGroupService;
import cn.com.certusnet.cloud.flexom.client.service.UserService;
import cn.com.certusnet.cloud.flexom.client.service.impl.EndpointCounterServiceImpl;
import cn.com.certusnet.cloud.flexom.client.service.impl.EndpointServiceImpl;
import cn.com.certusnet.cloud.flexom.client.service.impl.HostGroupServiceImpl;
import cn.com.certusnet.cloud.flexom.client.service.impl.UserServiceImpl;

/**   
 * @ClassName: BaseApiRouter   
 * @Description: TODO
 * @author zhuhq  
 * @date 2018年12月24日 下午7:52:40      
 */
public class BaseApiRouter
{
    public static UserService userService(BaseApi api) {
        return new UserServiceImpl(api);
    }
    
    public static EndpointService endpointService(BaseApi api) {
        return new EndpointServiceImpl(api);
    }
    
    public static EndpointCounterService endpointCounterService(BaseApi api) {
        return new EndpointCounterServiceImpl(api);
    }
    
    public static HostGroupService hostgroupService(BaseApi api) {
        return new HostGroupServiceImpl(api);
    }
}
