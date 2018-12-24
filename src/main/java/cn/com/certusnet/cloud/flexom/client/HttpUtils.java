package cn.com.certusnet.cloud.flexom.client;

import java.net.URI;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Map;

import javax.net.ssl.SSLContext;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

@SuppressWarnings("deprecation")
public class HttpUtils
{
    /**
     * Logger for this class
     */
    private static final Logger logger = Logger.getLogger(HttpUtils.class);

    /**
     * create a httpclient
     * 
     * @param supportCookies
     * @param supportHttps
     * @return
     */
    public static CloseableHttpClient create(boolean supportCookies, boolean supportHttps)
    {

        CloseableHttpClient httpClient = null;
        HttpClientBuilder httpClientBuilder = HttpClients.custom();

        if (supportCookies)
        {
            BasicCookieStore cookieStore = new BasicCookieStore();
            httpClientBuilder.setDefaultCookieStore(cookieStore);
        }

        if (supportHttps)
        {
            try
            {
                SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy()
                {
                    public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException
                    {
                        return true;
                    }
                }).build();

                SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext);

                httpClientBuilder.setSSLSocketFactory(sslsf);
            }
            catch (Exception e)
            {
                logger.error("create https client failed.", e);
            }
        }

        httpClient = httpClientBuilder.build();

        return httpClient;
    }

    //
    /**
     * create a default httpClient whitout cookies and https support.
     * 
     * @return
     */
    public static CloseableHttpClient create()
    {
        return create(false, false);
    }

    public static String httpGet(String uri, Map<String, String> header)
    {
        try (CloseableHttpClient httpClient = create())
        {
            HttpGet httpGet = new HttpGet(new URI(uri));
            setHeader(httpGet, header);

            try
            {
                CloseableHttpResponse response = httpClient.execute(httpGet);
                HttpEntity entity1 = (HttpEntity) response.getEntity();
                // response status
                int responseStatus = response.getStatusLine().getStatusCode();
                if (responseStatus == HttpStatus.SC_OK)
                {

                    return EntityUtils.toString(entity1, "UTF-8");

                }
                else
                {
                    String message = EntityUtils.toString(entity1, "UTF-8");
                    logger.error("response status=" + responseStatus + ",message=" + message);

                    return message;
                }
            }
            catch (Exception e)
            {
                // TODO: handle exception
                throw new RuntimeException("httpGet error!", e);
            }

        }
        catch (Exception e)
        {
            // TODO: handle exception
            throw new RuntimeException("httpGet error:", e);
        }
    }

    public static String httpDelete(String uri, Map<String, String> header)
    {
        try (CloseableHttpClient httpClient = create())
        {
            HttpDelete httpDelete = new HttpDelete(new URI(uri));
            setHeader(httpDelete, header);

            try
            {
                CloseableHttpResponse response = httpClient.execute(httpDelete);
                HttpEntity entity1 = (HttpEntity) response.getEntity();

                int responseStatus = response.getStatusLine().getStatusCode();
                if (responseStatus == HttpStatus.SC_OK)
                {

                    return EntityUtils.toString(entity1, "UTF-8");

                }
                else
                {
                    String message = EntityUtils.toString(entity1, "UTF-8");
                    logger.error("response status=" + responseStatus + ",message=" + message);

                    return message;
                }

            }
            catch (Exception e)
            {
                // TODO: handle exception
                throw new RuntimeException("httpDelete error:", e);
            }
        }
        catch (Exception e)
        {
            // TODO: handle exception
            throw new RuntimeException("httpDelete error:", e);
        }
    }

    public static String httpPost(String uri, String params, Map<String, String> header)
    {
        try (CloseableHttpClient httpClient = create())
        {
            HttpPost httpPost = new HttpPost(new URI(uri));
            setHeader(httpPost, header);

            StringEntity entity = new StringEntity(params);
            entity.setContentEncoding("UTF-8");
            entity.setContentType("application/json");

            httpPost.setEntity(entity);

            try
            {
                CloseableHttpResponse response = httpClient.execute(httpPost);
                HttpEntity entity1 = (HttpEntity) response.getEntity();

                int responseStatus = response.getStatusLine().getStatusCode();
                if (responseStatus == HttpStatus.SC_OK)
                {

                    return EntityUtils.toString(entity1, "UTF-8");

                }
                else
                {
                    String message = EntityUtils.toString(entity1, "UTF-8");
                    logger.error("response status=" + responseStatus + ",message=" + message);

                    return message;
                }
            }
            catch (Exception e)
            {
                // TODO: handle exception
                throw new RuntimeException("httpPost error:", e);
            }

        }
        catch (Exception e)
        {
            // TODO: handle exception
            throw new RuntimeException("httpPost error:", e);
        }
    }

    public static String httpPut(String uri, String params, Map<String, String> header)
    {
        try (CloseableHttpClient httpClient = create())
        {
            HttpPut httpPut = new HttpPut(new URI(uri));
            setHeader(httpPut, header);

            StringEntity entity = new StringEntity(params);
            entity.setContentEncoding("UTF-8");
            entity.setContentType("application/json");

            httpPut.setEntity(entity);

            try
            {
                CloseableHttpResponse response = httpClient.execute(httpPut);
                HttpEntity entity1 = (HttpEntity) response.getEntity();

                int responseStatus = response.getStatusLine().getStatusCode();
                if (responseStatus == HttpStatus.SC_OK)
                {

                    return EntityUtils.toString(entity1, "UTF-8");

                }
                else
                {
                    String message = EntityUtils.toString(entity1, "UTF-8");
                    logger.error("response status=" + responseStatus + ",message=" + message);

                    return message;
                }
            }
            catch (Exception e)
            {
                // TODO: handle exception
                throw new RuntimeException("httpPut error:", e);
            }

        }
        catch (Exception e)
        {
            // TODO: handle exception
            throw new RuntimeException("httpPut error:", e);
        }
    }

    private static void setHeader(AbstractHttpMessage httpMsg, Map<String, String> header)
    {
        Header[] heads = createHeader(header);
        if (heads != null)
        {
            httpMsg.setHeaders(heads);
        }
    }

    private static Header[] createHeader(Map<String, String> header)
    {

        if (header == null || header.isEmpty())
        {
            return null;
        }

        Header[] headers = new Header[header.size()];

        int n = 0;
        for (Map.Entry<String, String> s : header.entrySet())
        {
            headers[n] = new BasicHeader(s.getKey(), s.getValue());
            n++;
        }

        return headers;
    }
    
    public static <T>String objectToJsonPretty(T obj){
        ObjectMapper objectMapper = new ObjectMapper();
        if(obj == null){
            return null;
        }
        try {
            return obj instanceof String ? (String) obj : objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public enum HttpMethod
    {
        GET, POST, PUT, DELETE;
    }

}