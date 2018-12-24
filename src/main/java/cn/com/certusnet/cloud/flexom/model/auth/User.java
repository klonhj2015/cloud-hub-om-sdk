/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.cloud.flexom.model.auth;

import cn.com.certusnet.cloud.flexom.Buildable;
import cn.com.certusnet.cloud.flexom.ModelEntity;
import cn.com.certusnet.cloud.flexom.model.auth.builder.UserBuilder;

/**   
 * @ClassName: User   
 * @Description: TODO
 * @author zhuhq  
 * @date 2018年12月20日 下午8:11:49      
 */
public interface User extends ModelEntity,Buildable<UserBuilder>
{
    String getName();
    
    String getPassword();
    
    String getSig();
    
    boolean getAdmin();
    
   
}
