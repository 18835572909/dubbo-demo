package cn.rhb.pojo;

/**
 * @ClassName ServiceImpl1
 * @Description TODO
 * @Author rhb
 * @Date 2020-06-19 10:26
 * @Version 1.0
 */
public class ServiceImpl1 implements Service {
    @Override
    public void say() {
        System.out.println("ServiceImpl1 Hello!");
    }
    @Override
    public void getName(String name) {
        System.out.println("1:"+name);
    }
}
