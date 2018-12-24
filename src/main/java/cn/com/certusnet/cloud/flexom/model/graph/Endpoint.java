/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.cloud.flexom.model.graph;

import cn.com.certusnet.cloud.flexom.Buildable;
import cn.com.certusnet.cloud.flexom.ModelEntity;
import cn.com.certusnet.cloud.flexom.model.graph.builder.EndpointBuilder;

/**   
 * @ClassName: Endpoint   
 * @Description: TODO
 * @author zhuhq  
 * @date 2018年12月21日 下午2:02:26      
 */
public interface Endpoint extends ModelEntity, Buildable<EndpointBuilder>
{
 
    String getEndpoint();
    
    int getId();
}
