package cn.itzhangpeng.springcxf.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/** restfulwebservice  user pojo类  !!!!注意一定要提提供无参数构造
 * @Auther:zhangpeng
 * @Date:2019/8/13
 * @Description:cn.itzhangpeng.springcxf.entity
 * @Version:1.0
 */
@XmlRootElement(name="user")//使用jaxb注解指定生成xml的根元素
@XmlAccessorType(XmlAccessType.PROPERTY)//指定字段（没有gettersetter方法）生成xml元素，XmlAccessType.property指定属性生成xml元素
public class User implements Serializable {
    //@XmlElement 指定生成xml元素
    //@XmlJavaTypeAdapter(Aimplement.class) 放在接口上，由于接口无法生成元素，implement.class为该接口实现类
    private String name;
    private Integer id;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User(String name, Integer id, Integer age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
    //!!!!注意一定要有无参数构造
    public User() {
       super();
    }
}
