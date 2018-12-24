/*
 * Copyright © 2017 CertusNet, Inc. and others. All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 */
package cn.com.certusnet.cloud.flexom.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.Consts;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import cn.com.certusnet.cloud.flexom.ModelEntity;

/**
 * @ClassName: BaseServiceCommon
 * @Description: TODO
 * @author zhuhq
 * @date 2018年12月24日 下午7:55:53
 */
public class BaseServiceCommon
{
    private BaseApiV1 apiV1;

    private String uri;

    public BaseServiceCommon(BaseApi api)
    {
        this.apiV1 = (BaseApiV1) api;
    }

    public ModelEntity doPost(Class<? extends ModelEntity> entity, String params, Map<String, String> header)
    {
        String response = HttpUtils.httpPost(this.urlGen(uri), params, header);
        return this.jsonToObject(response, entity);
    }

    public List<? extends ModelEntity> doList(Class<? extends ModelEntity> clz, Map<String, Object> params)
    {
        // TODO Auto-generated method stub
        List<? extends ModelEntity> data = new ArrayList<>();
        
        try
        {
            Map<String, String> headers = this.initHeader();
            String paramStr = this.paramsUrl(params);
            String url = this.urlGen(uri);

            if (!paramStr.equals(""))
            {
                url = url + "?" + paramStr;
            }

            String response = HttpUtils.httpGet(url, headers);

            data = (List<? extends ModelEntity>) this.jsonToObjects(response, clz);

        }
        catch (ParseException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return data;
    }

    public void setUri(String uri)
    {
        this.uri = uri;
    }

    private String urlGen(String uri)
    {
        String url = "http://" + apiV1.getHostname() + ":" + apiV1.getPort() + apiV1.getVersion() + uri;

        return url;
    }

    private String paramsUrl(Map<String, Object> paramsMap) throws ParseException, IOException
    {
        String paramsStr = "";
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        for (String key : paramsMap.keySet())
        {
            params.add(new BasicNameValuePair(key, paramsMap.get(key).toString()));
        }

        paramsStr = EntityUtils.toString(new UrlEncodedFormEntity(params, Consts.UTF_8));

        return paramsStr;
    }

    private Map<String, String> initHeader() throws JsonProcessingException
    {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, String> headers = new HashMap<String, String>();
        Map<String, String> token = new HashMap<String, String>();
        token.put("name", apiV1.getUsername());
        token.put("sig", apiV1.getUserDomain().getSig());

        String apitoken = mapper.writeValueAsString(token);

        headers.put("Apitoken", apitoken);
        headers.put("Content-Type", "application/json");

        return headers;

    }

    @SuppressWarnings("unchecked")
    private <T> T jsonToObject(String src, Class<T> clazz)
    {

        ObjectMapper objectMapper = new ObjectMapper();
        if (src.equals("") || clazz == null)
        {
            return null;
        }
        try
        {
            return clazz.equals(String.class) ? (T) src : objectMapper.readValue(src, clazz);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    private List<? extends ModelEntity>
            jsonToObjects(String src, Class<? extends ModelEntity> clz) throws JsonParseException, JsonMappingException,
                                                                        IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        CollectionType type = mapper.getTypeFactory().constructCollectionType(List.class, clz);
        List<? extends ModelEntity> entityList = mapper.readValue(src, type);

        return entityList;
    }

}
