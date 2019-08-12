package cn.itzhangpeng.springcxf.webappconfig;
import cn.itzhangpeng.springcxf.serviceimpl.WeatherServiceImpl;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import javax.sql.DataSource;
import javax.xml.bind.annotation.W3CDomHandler;
import java.beans.PropertyVetoException;
/**
 * @Auther:zhangpeng
 * @Date:2019/5/5
 * @Description:springConfig
 * @Version:1.0
 */

@ComponentScan(value = {"cn.itzhangpeng"},excludeFilters = {
      @ComponentScan.Filter(type = FilterType.ANNOTATION,classes ={Controller.class, RestController.class} )
})
@Configuration//spring配置类
@ImportResource("classpath:spring-cxf.xml")//导入cxf配置文件
public class RootContainerConfig {
    //把服务实现类添加到ioc容器
    @Bean(name="weatherServiceImpl")
    public WeatherServiceImpl  getWeatherServiceImpl(){
        WeatherServiceImpl weatherServiceImpl =new WeatherServiceImpl();
        return weatherServiceImpl;
    }
}
