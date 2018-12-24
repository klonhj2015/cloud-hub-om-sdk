/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.cloud.flexom.client.service.impl;


import java.util.List;
import java.util.Map;

import cn.com.certusnet.cloud.flexom.ModelEntity;
import cn.com.certusnet.cloud.flexom.client.BaseApi;
import cn.com.certusnet.cloud.flexom.client.BaseServiceCommon;
import cn.com.certusnet.cloud.flexom.client.HttpUtils;
import cn.com.certusnet.cloud.flexom.client.service.UserService;
import cn.com.certusnet.cloud.flexom.model.auth.User;
import cn.com.certusnet.cloud.flexom.model.auth.domain.UserDomain;

/**   
 * @ClassName: UserServiceImpl   
 * @Description: TODO
 * @author zhuhq  
 * @date 2018年12月24日 下午7:11:51      
 */
public class UserServiceImpl extends BaseServiceCommon implements UserService
{

        


        
    /**   
     * @Description constructors      
     * @param api   
     *
     */    
    public UserServiceImpl(BaseApi api)
    {
        super(api);
        // TODO Auto-generated constructor stub
    }

    /**   
     * @Title: login   
     * @author zhuhq
     * @Description:TODO     
     * @return    
     * @date 2018年12月24日 下午7:11:58 
     * @see cn.com.certusnet.cloud.flexom.client.service.UserService#login()    
     */    
    @Override
    public UserDomain login(User user)
    {
        // TODO Auto-generated method stub
        String LOGIN = "/user/login";
        super.setUri(LOGIN);
        try
        {
            return (UserDomain) super.doPost(UserDomain.class, HttpUtils.objectToJsonPretty(user), null);
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

        
    /**   
     * @Title: list   
     * @author zhuhq
     * @Description:TODO     
     * @param clz
     * @param params
     * @return    
     * @date 2018年12月24日 下午9:20:50 
     * @see cn.com.certusnet.cloud.flexom.client.BaseService#list(java.lang.Class, java.util.Map)    
     */    
    @Override
    public List<? extends ModelEntity> list(Map<String, Object> params)
    {
        // TODO Auto-generated method stub
        return null;
    }
    

}
