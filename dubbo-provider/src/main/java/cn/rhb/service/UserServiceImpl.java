package cn.rhb.service;

import cn.rhb.pojo.User;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author rhb
 * @Date 2020-06-16 15:10
 * @Version 1.0
 */

@Service(version="${service.version}",interfaceClass=UserService.class)
@Component
public class UserServiceImpl implements UserService {

    List<User> users = new ArrayList<>();

    @PostConstruct
    public void init(){
        for(int i=0;i<10;i++){
            User user = new User();
            user.setUsername("小"+i);
            user.setAddress("广州科韵路"+i+"号");
            user.setAge(i+1);
            user.setPassword("******");
            user.setUserId(UUID.randomUUID().toString().replaceAll("-",""));
            users.add(user);
        }
    }

    @Override
    public List<User> allUsers() {
        return users;
    }
}
