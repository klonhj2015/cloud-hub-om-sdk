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

/**   
 * @ClassName: BaseApi   
 * @Description: TODO
 * @author zhuhq  
 * @date 2018年12月24日 下午6:52:35      
 */
public interface BaseApi
{
    
    
    public BaseApi credentials(String name, String password);
    
    public BaseApi authenticate();
    
    public UserService user();
    
    public EndpointService endpoint();
    
    public EndpointCounterService endpoint_counter();
    
    public HostGroupService hostgroup();
   
    
    
}
