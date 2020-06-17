package cn.rhb;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @ClassName ProviderApplication
 * @Description TODO
 * @Author rhb
 * @Date 2020-06-16 16:43
 * @Version 1.0
 */
@EnableDubboConfiguration
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }
}
