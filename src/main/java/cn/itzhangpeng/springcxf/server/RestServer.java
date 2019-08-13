package cn.itzhangpeng.springcxf.server;
import cn.itzhangpeng.springcxf.serviceimpl.UserInterfaceImpl;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
/**restfulwebservice服務發佈
 * @Auther:zhangpeng
 * @Date:2019/8/13
 * @Description:cn.itzhangpeng.springcxf.server
 * @Version:1.0
 */

public class RestServer {
    public static void main(String[] args) {
       /*//创建发布restful服务的对象
        JAXRSServerFactoryBean jaxrsServerFactoryBean=new JAXRSServerFactoryBean();
        //设置服务实现类
        jaxrsServerFactoryBean.setServiceBean(new UserInterfaceImpl());
        //设置发布服务的资源类
        jaxrsServerFactoryBean.setResourceClasses(UserInterfaceImpl.class);
        //设置发布服务的address
        jaxrsServerFactoryBean.setAddress("http://localhost:8887/user");
        //发布restful服务
        jaxrsServerFactoryBean.create();*/
    }

}
