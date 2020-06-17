package cn.rhb.remote;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @ClassName RemoteTrackIdFilter
 * @Description TODO
 * @Author rhb
 * @Date 2020-06-17 15:52
 * @Version 1.0
 */
@Slf4j
@Activate(group = {Constants.CONSUMER,Constants.PROVIDER},order = -1000)
public class RemoteTrackIdFilter implements Filter {

    /*
        没有显式的注入，是因为Dubbo的设计原理之一的扩展extension load
     */
    private IpWhiteList ipWhiteList;

    public void setIpWhiteList(IpWhiteList ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
    }

    /*
        Invocation和Invoke这两个词，可以联想到，这是一种类型动态代理的模式
        1. JDK动态代理：InvocationHandler+Proxy
        2. CGlib动态代理：MethodInterceptor、MethodProxy、Enhancer
    */
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        log.info("RPC拦截器："+invoker+","+invocation);

        if(!ipWhiteList.getEnable()){
            return invoker.invoke(invocation);
        }

        String remoteHost = RpcContext.getContext().getRemoteHost();
        List<String> ips = ipWhiteList.getIps();
        if(ips.contains(remoteHost)){
            return invoker.invoke(invocation);
        }else{
            return new RpcResult(new RuntimeException("ip禁用"));
        }
    }
}
