/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.cloud.flexom.client;

import cn.com.certusnet.cloud.flexom.client.service.EndpointCounterService;
import cn.com.certusnet.cloud.flexom.client.service.EndpointService;
import cn.com.certusnet.cloud.flexom.client.service.HostGroupService;
import cn.com.certusnet.cloud.flexom.client.service.UserService;
import cn.com.certusnet.cloud.flexom.model.Builders;
import cn.com.certusnet.cloud.flexom.model.auth.User;
import cn.com.certusnet.cloud.flexom.model.auth.domain.UserDomain;

/**   
 * @ClassName: BaseApiV1   
 * @Description: TODO
 * @author zhuhq  
 * @date 2018年12月24日 下午6:59:04      
 */
public class BaseApiV1 extends BaseApiRouter implements BaseApi
{
    private String hostname;
    private int port;
    
    private String username;
    private String password;
    
    private UserDomain userDomain;
    
    private String version = "/api/v1";
    
    public BaseApiV1(String hostname, int port) {
        this.hostname = hostname;
        this.port = port;
    }

        
    /**   
     * @Title: credentials   
     * @author zhuhq
     * @Description:TODO     
     * @param name
     * @param password
     * @return    
     * @date 2018年12月24日 下午7:03:43 
     * @see cn.com.certusnet.cloud.flexom.client.BaseApi#credentials(java.lang.String, java.lang.String)    
     */    
    @Override
    public BaseApi credentials(String name, String password)
    {
        // TODO Auto-generated method stub
        this.username = name;
        this.password = password;
        return this;
    }


        
    /**   
     * @Title: authenticate   
     * @author zhuhq
     * @Description:TODO     
     * @return    
     * @date 2018年12月24日 下午7:06:28 
     * @see cn.com.certusnet.cloud.flexom.client.BaseApi#authenticate()    
     */    
    @Override
    public BaseApi authenticate()
    {
        // TODO Auto-generated method stub
        User user = Builders.user().name(this.username).password(this.password).build();
        this.userDomain = this.user().login(user);
        return this;
    }


        
    /**   
     * @Title: user   
     * @author zhuhq
     * @Description:TODO     
     * @return    
     * @date 2018年12月24日 下午8:16:01 
     * @see cn.com.certusnet.cloud.flexom.client.BaseApi#user()    
     */    
    @Override
    public UserService user()
    {
        // TODO Auto-generated method stub
        return super.userService(this);
    }
    
    /**   
     * @Title: endpoint   
     * @author zhuhq
     * @Description:TODO     
     * @return    
     * @date 2018年12月24日 下午9:36:14 
     * @see cn.com.certusnet.cloud.flexom.client.BaseApi#endpoint()    
     */    
    @Override
    public EndpointService endpoint()
    {
        // TODO Auto-generated method stub
        return super.endpointService(this);
    }
    
    /**   
     * @Title: endpoint_counter   
     * @author zhuhq
     * @Description:TODO     
     * @return    
     * @date 2018年12月24日 下午9:47:36 
     * @see cn.com.certusnet.cloud.flexom.client.BaseApi#endpoint_counter()    
     */    
    @Override
    public EndpointCounterService endpoint_counter()
    {
        // TODO Auto-generated method stub
        return super.endpointCounterService(this);
    }

    /**   
     * @Title: hostgroup   
     * @author zhuhq
     * @Description:TODO     
     * @return    
     * @date 2018年12月24日 下午10:13:36 
     * @see cn.com.certusnet.cloud.flexom.client.BaseApi#hostgroup()    
     */    
    @Override
    public HostGroupService hostgroup()
    {
        // TODO Auto-generated method stub
        return super.hostgroupService(this);
    }
    


    
    /**   
     * @return the hostname   
     */
    public String getHostname()
    {
        return hostname;
    }


    
    /**   
     * @return the port   
     */
    public int getPort()
    {
        return port;
    }


    
    /**   
     * @return the username   
     */
    public String getUsername()
    {
        return username;
    }


    
    /**   
     * @return the password   
     */
    public String getPassword()
    {
        return password;
    }


    
    /**   
     * @return the user   
     */
    public UserDomain getUserDomain()
    {
        return userDomain;
    }


    
    /**   
     * @return the version   
     */
    public String getVersion()
    {
        return version;
    }




}
