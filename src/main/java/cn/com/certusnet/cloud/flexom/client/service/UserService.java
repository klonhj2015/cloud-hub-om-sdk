/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.cloud.flexom.client.service;

import cn.com.certusnet.cloud.flexom.client.BaseService;
import cn.com.certusnet.cloud.flexom.model.auth.User;
import cn.com.certusnet.cloud.flexom.model.auth.domain.UserDomain;

/**   
 * @ClassName: UserService   
 * @Description: TODO
 * @author zhuhq  
 * @date 2018年12月24日 下午7:07:29      
 */
public interface UserService extends BaseService
{
    
    public UserDomain login(User user);
    

}
