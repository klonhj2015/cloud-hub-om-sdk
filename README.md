# cloud-hub-om-sdk
Sdk for FlexvisorOm based on openfalcon API.

This is a Java Fluent API for Flexvisor-OM Based On open-falcon

http://open-falcon.org/falcon-plus/

SDK的调用规则：
OSFactory --> BaseApi --> Service --> HttpUtils

编写步骤：
Model接口，主要用于定义Moddel对象get的接口。
Model Domain接口，实际的Model的对象，包含Model的属性， 其中包含关于Model Builder的实际实现类，与Model Domain做逻辑build实现生成最终domain对象。Domain也是最终的序列化对象，注意空值的过滤。
Model builder， 定义了Fluent API的接口。

Service接口，定义了逻辑处理接口，继承BaseService的常规get，put，post，list方法。
ServiceImpl接口，service定义的接口的实现处理，主要调用HttpUtils中的统一Http 方法，其中常规方法会在BaseServiceCommon中实现，所以会继承BaseServiceCommon。


Api接口，定义了鉴权等接口。
OSFactory传入ip、端口，账户、密码等信息。

BaseApi 封装了Api的接口。
BaseApiV1 v1版本的API实现。
BaseApiRouter 注册各类service的接口，用于router。


						  
