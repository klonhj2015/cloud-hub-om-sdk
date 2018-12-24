/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.cloud.flexom.model.auth.builder;

import cn.com.certusnet.cloud.flexom.Buildable.Builder;
import cn.com.certusnet.cloud.flexom.model.auth.User;

/**   
 * @ClassName: ModelBuilder   
 * @Description: TODO
 * @author zhuhq  
 * @date 2018年12月20日 下午8:16:02      
 */
public interface UserBuilder extends Builder<UserBuilder, User>
{
    UserBuilder name(String name);
    
    UserBuilder password(String password);
    
    UserBuilder sig(String sig);
    
    UserBuilder admin(boolean admin);
}
