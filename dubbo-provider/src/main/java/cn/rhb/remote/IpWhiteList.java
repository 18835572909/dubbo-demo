package cn.rhb.remote;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName IpWhiteList
 * @Description TODO
 * @Author rhb
 * @Date 2020-06-17 16:07
 * @Version 1.0
 */
@Data
@Component
public class IpWhiteList {

    private List<String> ips = new ArrayList<>();

    private Boolean enable;

    @PostConstruct
    public void init(){
        ips.add("192.168.1.28");
        ips.add("192.168.1.100");
        enable = true;
    }

}
