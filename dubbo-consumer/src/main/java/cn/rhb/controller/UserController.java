package cn.rhb.controller;

import cn.rhb.pojo.User;
import cn.rhb.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author rhb
 * @Date 2020-06-16 15:47
 * @Version 1.0
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Reference
    UserService userService;

    @RequestMapping("/all")
    public List<User> allUsers(){
        return userService.allUsers();
    }

}
