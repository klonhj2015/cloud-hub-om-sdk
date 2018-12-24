/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.cloud.flexom.model.graph.builder;

import cn.com.certusnet.cloud.flexom.Buildable.Builder;
import cn.com.certusnet.cloud.flexom.model.graph.EndpointCounter;

/**   
 * @ClassName: EndpointCounterBuilder   
 * @Description: TODO
 * @author zhuhq  
 * @date 2018年12月24日 下午4:14:32      
 */
public interface EndpointCounterBuilder extends Builder<EndpointCounterBuilder, EndpointCounter>
{
    public EndpointCounterBuilder count(String count);
    
    public EndpointCounterBuilder endpointId(int endpointId);
    
    public EndpointCounterBuilder step(int step);
    
    public EndpointCounterBuilder type(String type);
}
