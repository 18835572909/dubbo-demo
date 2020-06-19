package cn.rhb.pojo;

/**
 * @ClassName ServiceImpl2
 * @Description TODO
 * @Author rhb
 * @Date 2020-06-19 10:26
 * @Version 1.0
 */
public class ServiceImpl2 implements Service {
    @Override
    public void say() {
        System.out.println("ServiceImpl2 Hello!");
    }

    @Override
    public void getName(String name) {
        System.out.println("2:"+name);
    }
}
