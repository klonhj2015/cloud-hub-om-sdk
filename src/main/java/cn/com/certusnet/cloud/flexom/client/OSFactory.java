/*
 * Copyright © 2017 CertusNet, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.cloud.flexom.client;

import java.lang.reflect.Constructor;

import org.apache.log4j.Logger;


/**   
 * @ClassName: OSFactory   
 * @Description: TODO
 * @author zhuhq  
 * @date 2018年12月24日 下午6:58:30      
 */
public class OSFactory
{
    private static final Logger s_logger =
            Logger.getLogger(OSFactory.class);

    static private OSFactory _singleton;
    private Class<? extends BaseApi> _cls;

    private OSFactory() {
    _cls = BaseApiV1.class;
    }

    private Constructor<? extends BaseApi> getConstructor() throws NoSuchMethodException {
        return _cls.getConstructor(String.class, Integer.TYPE);
    }
    
    private static synchronized OSFactory getInstance() {
        if (_singleton == null) {
            _singleton = new OSFactory();
        }
        return _singleton;
    }
    
    /**
     * Create an ApiConnector object.
     * @param hostname name or IP address of contrail VNC api server.
     * @port  api server port.
     * @return ApiConnector implementation.
     */
    public static BaseApi build(String hostname, int port) {
        OSFactory factory = getInstance();
        try {
            Constructor<? extends BaseApi> constructor = factory.getConstructor();
            return constructor.newInstance(hostname, port);
        } catch (Exception ex) {
            s_logger.error("Unable to create object", ex);
        }
        return null;
    }
    
    public static void setImplementation(Class<? extends BaseApi> cls) {
        OSFactory factory = getInstance();
        factory._cls = cls;
    }
}
