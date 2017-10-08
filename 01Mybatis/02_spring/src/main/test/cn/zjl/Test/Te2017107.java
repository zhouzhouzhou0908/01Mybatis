package cn.zjl.Test;

import cn.zjl.DAO.UserRen;
import cn.zjl.Service.UserService;
import cn.zjl.entity.Rens;
import cn.zjl.entity.UserStu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Te2017107 {
    @Test
    public void Test01(){
        ApplicationContext con=new ClassPathXmlApplicationContext("applicationAop.xml");
        UserService service=(UserService)con.getBean("AopSomeService");

        service.doSome();
    }
    @Test
    public void  Test02(){
        ApplicationContext con=new ClassPathXmlApplicationContext("applicationAop.xml");
        UserStu service=(UserStu)con.getBean("hhh");
        System.out.println(service);


}

    @Test
    public void Test03(){
        ApplicationContext con=new ClassPathXmlApplicationContext("applicationAop.xml");
        UserRen service=(UserRen)con.getBean("Ren");
        System.out.println(service);
    }
    @Test
    public void Test04(){
        ApplicationContext con=new ClassPathXmlApplicationContext("applicationAop.xml");
        Rens service=(Rens)con.getBean("ren");
        System.out.println(service);
    }
}