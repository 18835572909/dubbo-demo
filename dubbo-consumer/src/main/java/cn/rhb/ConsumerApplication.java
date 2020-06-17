package cn.rhb;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName ConsumerApplication
 * @Description TODO
 * @Author rhb
 * @Date 2020-06-16 15:43
 * @Version 1.0
 */
@EnableDubboConfiguration
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }

}
