package cn.itzhangpeng.springcxf.service;
import cn.itzhangpeng.springcxf.entity.User;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
/**
 * @Auther:zhangpeng
 * @Date:2019/8/13
 * @Description:cn.itzhangpeng.springcxf.service
 * @Version:1.0
 */
@WebService
@Path("/user")//指定url到接口的依赖
public interface UserInterface {
    @GET//指定请求方式
    //@Consumes 指定处理请求的content type类型
    //指定返回数据的格式,如同时指定：get方式默认返回xml，post方式默认返回json
    //注意！！！：如果仅仅指定为json,需要提供jsonprovider设置如何响应json
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/getUser/{id}")//将url映射到方法
        //取出path中的参数
    User getUser(@PathParam("id") Integer id);

    @GET
    @Path("/getUserList/{name}")//将url映射到方法
    //指定返回数据的格式
    @Produces(MediaType.APPLICATION_JSON)
    //取出path中的参数
    List<User> getUserList(@PathParam("name")String name);
}
