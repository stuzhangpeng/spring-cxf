package cn.itzhangpeng.springcxf.webappconfig;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @Auther:zhangpeng
 * @Date:2019/5/5
 * @Description:webapp初始化配置类
 * @Version:1.0
 */

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    //spring容器配置
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootContainerConfig.class};
    }
//配置springmvc容器，本项目未用到
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
//配置spring的前端控制器映射信息，本项目未用到
    @Override
    protected String[] getServletMappings() {
        return  null;
    }
//重写
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        //注册cxfservlet
        ServletRegistration.Dynamic cxfServlet = servletContext.addServlet("CXFServlet", CXFServlet.class);
        cxfServlet.addMapping("/ws/*");
        //注册spring的监听器
        registerContextLoaderListener(servletContext);
    }
}
