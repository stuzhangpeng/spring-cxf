package cn.itzhangpeng.springcxf.serviceimpl;

import javax.jws.WebService;

/**
 * @Auther:zhangpeng
 * @Date:2019/8/12
 * @Description:cn.itzhangpeng.springcxf.serviceimpl
 * @Version:1.0
 */
@WebService
public class HelloWrold {
    public String sayHello(){
        return "hello";
    }
}
