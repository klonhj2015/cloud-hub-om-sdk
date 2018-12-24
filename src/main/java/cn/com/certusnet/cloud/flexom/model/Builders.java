/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.cloud.flexom.model;

import cn.com.certusnet.cloud.flexom.model.auth.builder.UserBuilder;
import cn.com.certusnet.cloud.flexom.model.auth.domain.UserDomain;
import cn.com.certusnet.cloud.flexom.model.graph.builder.EndpointBuilder;
import cn.com.certusnet.cloud.flexom.model.graph.builder.EndpointCounterBuilder;
import cn.com.certusnet.cloud.flexom.model.graph.domain.EndpointCounterDomain;
import cn.com.certusnet.cloud.flexom.model.graph.domain.EndpointDomain;

/**   
 * @ClassName: Builders   
 * @Description: TODO
 * @author zhuhq  
 * @date 2018年12月20日 下午8:38:04      
 */
public class Builders
{
    public static UserBuilder user() {
        return UserDomain.builder();
    }
    
    public static EndpointBuilder endpoint() {
        return EndpointDomain.builder();
    }
    
    public static EndpointCounterBuilder endpointcounter() {
        return EndpointCounterDomain.builder();
    }
    
    
}
