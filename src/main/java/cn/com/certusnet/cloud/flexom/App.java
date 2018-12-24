package cn.com.certusnet.cloud.flexom;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;

import cn.com.certusnet.cloud.flexom.client.BaseApi;
import cn.com.certusnet.cloud.flexom.client.OSFactory;

import cn.com.certusnet.cloud.flexom.model.graph.Endpoint;
import cn.com.certusnet.cloud.flexom.model.graph.EndpointCounter;
import cn.com.certusnet.cloud.flexom.model.hostgroup.HostGroup;
import cn.com.certusnet.cloud.flexom.model.hostgroup.domain.HostGroupDomain;



/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args) throws JsonProcessingException
    
    
    {
//        ObjectMapper mapper = new ObjectMapper();
//        UserDomain user = (UserDomain) Builders.user().name("zhuhq").password("123456").build();
//        System.out.println(mapper.writeValueAsString(user));

//        ApiConnector api = OSFactory.build("172.16.137.158", 8080)
//                .credentials("zhuhq", "74cb1442043111e9b64e023ee2cc3394");
//        Map<String, Object> params = new HashMap<>();
//        params.put("q", ".");
//        List<? extends EndpointDomain> endpoints = (List<? extends EndpointDomain>) api.list(EndpointDomain.class, params);
//        System.out.println(endpoints.size());
//       
//        
//        params = new HashMap<>();
//        params.put("eid", 84);
//        api.service(BaseApiServiceBuilder.endpoint_counter());
//        List<? extends EndpointCounterDomain> domains = (List<? extends EndpointCounterDomain>) api.list(EndpointCounterDomain.class, params);
//        System.out.println(domains.size());
//        
//        BaseApiServiceBuilder builder = OSFactory.build("172.16.137.158", 8080)
//                .credentials("zhuhq", "74cb1442043111e9b64e023ee2cc3394").build();
          Map<String, Object> params = new HashMap<>();
          params.put("q", ".");
          BaseApi api = OSFactory.build("172.16.137.158", 8080).credentials("zhuhq", "123456").authenticate();
          List<? extends Endpoint> endpoints = (List<? extends Endpoint>) api.endpoint().list(params);
          
          System.out.println(endpoints.size());
          
            params = new HashMap<>();
            params.put("eid", 84);
          List<? extends EndpointCounter>  counter = (List<? extends EndpointCounter>) api.endpoint_counter().list(params);
          
          
          System.out.println(counter.size());
          
          params = new HashMap<>();
          List<? extends HostGroup> hostgroups = (List<? extends HostGroup>) api.hostgroup().list(params);
          for(HostGroup d : hostgroups) {
              HostGroupDomain dm = (HostGroupDomain) d;
              System.out.println(dm.getGrpName());
              System.out.println(dm.getCreateUser());
          }
          
          System.out.println(hostgroups.size());

    }
}
