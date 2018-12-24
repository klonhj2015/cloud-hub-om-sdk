/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.cloud.flexom.model.graph.builder;

import cn.com.certusnet.cloud.flexom.Buildable.Builder;
import cn.com.certusnet.cloud.flexom.model.graph.Endpoint;

/**   
 * @ClassName: EndpointBuilder   
 * @Description: TODO
 * @author zhuhq  
 * @date 2018年12月21日 下午2:06:41      
 */
public interface EndpointBuilder extends Builder<EndpointBuilder, Endpoint>
{
    EndpointBuilder endpoint(String endpoint);
    
    EndpointBuilder id(int id);
}
