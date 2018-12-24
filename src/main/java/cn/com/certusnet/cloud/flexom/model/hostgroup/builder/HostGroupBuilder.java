/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.cloud.flexom.model.hostgroup.builder;

import cn.com.certusnet.cloud.flexom.Buildable.Builder;
import cn.com.certusnet.cloud.flexom.model.hostgroup.HostGroup;

/**   
 * @ClassName: HostGroupBuilder   
 * @Description: TODO
 * @author zhuhq  
 * @date 2018年12月24日 下午9:55:52      
 */
public interface HostGroupBuilder extends Builder<HostGroupBuilder, HostGroup>
{
    HostGroupBuilder id(int id);
    
    HostGroupBuilder grpName(String grpname);
    
    HostGroupBuilder createUser(String createUser);
}
