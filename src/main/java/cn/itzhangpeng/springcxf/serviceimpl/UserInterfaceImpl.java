package cn.itzhangpeng.springcxf.serviceimpl;
import cn.itzhangpeng.springcxf.entity.User;
import cn.itzhangpeng.springcxf.service.UserInterface;
import java.util.ArrayList;
import java.util.List;
/**
 * @Auther:zhangpeng
 * @Date:2019/8/13
 * @Description:cn.itzhangpeng.springcxf.serviceimpl
 * @Version:1.0
 */
public class UserInterfaceImpl implements UserInterface {
    @Override
    public User getUser(Integer id) {
        System.out.println(id);
        return new User("zhangsan1", 3, 20);
    }
    @Override
    public List<User> getUserList(String name) {
        User user = new User("zhangsan", 1, 20);
        User user1 = new User("zhangsan", 2, 22);
        User user2 =  new User("zhangsan", 4, 24);
        User user3=  new User("zhangsan", 7, 21);
        List<User> list=new ArrayList<User>();
        list.add(user);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        return list;
    }
}
