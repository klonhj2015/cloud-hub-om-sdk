/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.cloud.flexom.client;

import java.util.List;
import java.util.Map;

import cn.com.certusnet.cloud.flexom.ModelEntity;

/**   
 * @ClassName: BaseService   
 * @Description: TODO
 * @author zhuhq  
 * @date 2018年12月24日 下午9:16:10      
 */
public interface BaseService
{
    public List<? extends ModelEntity> list(Map<String, Object> params);
}
