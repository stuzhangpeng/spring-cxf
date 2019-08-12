package cn.itzhangpeng.springcxf.serviceimpl;
import cn.itzhangpeng.springcxf.service.WeatherService;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;

import javax.jws.WebService;

/**
 * @Auther:zhangpeng
 * @Date:2019/8/10
 * @Description:cn.zhangpeng.webservice.cxf.serviceimpl
 * @Version:1.0
 */
@WebService(endpointInterface = "cn.itzhangpeng.springcxf.service.WeatherService")
public class WeatherServiceImpl implements WeatherService {
    @Override
    public String getWeather(String cityName) {
        System.out.println(cityName);
        return "raining";
    }
}
