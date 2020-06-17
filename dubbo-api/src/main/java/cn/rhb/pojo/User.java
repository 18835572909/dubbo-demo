package cn.rhb.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description TODO
 * @Author rhb
 * @Date 2020-06-16 14:51
 * @Version 1.0
 */
@Data
public class User implements Serializable {
    private String userId;
    private String username;
    private String password;
    private Integer age;
    private String address;
}
