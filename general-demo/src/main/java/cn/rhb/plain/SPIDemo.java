package cn.rhb.plain;

import cn.rhb.pojo.Service;
import java.util.ServiceLoader;

/**
 * @ClassName SPIDemo
 * @Description SPI之ServiceLoader使用
 * 1. 创建接口和实现类
 * 2. 创建META-INF/services/cn.rhb.Service文件,并在文件标识实现类的完成路径
 * @Author rhb
 * @Date 2020-06-19 10:27
 * @Version 1.0
 */
public class SPIDemo {
    public static void main(String[] args) {
        ServiceLoader<Service> serviceLoader = ServiceLoader.load(Service.class);
        for(Service p : serviceLoader){
            p.say();
            p.getName("hello");
        }
    }
}
