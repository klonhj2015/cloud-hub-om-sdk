/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.cloud.flexom.model.hostgroup;

import cn.com.certusnet.cloud.flexom.Buildable;
import cn.com.certusnet.cloud.flexom.ModelEntity;
import cn.com.certusnet.cloud.flexom.model.hostgroup.builder.HostGroupBuilder;

/**   
 * @ClassName: HostGroup   
 * @Description: TODO
 * @author zhuhq  
 * @date 2018年12月24日 下午9:54:46      
 */
public interface HostGroup extends ModelEntity, Buildable<HostGroupBuilder>
{
    
    int getId();
    
    String getGrpName();
    
    String getCreateUser();
}
