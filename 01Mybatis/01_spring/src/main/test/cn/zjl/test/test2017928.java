package cn.zjl.test;

import cn.zjl.Day01.zjl_Service;
import cn.zjl.Day02.printer.print;
import org.apache.ibatis.io.Resources;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class test2017928 {
    @Test
    //BeanFactory
    public void test01(){
        Resource resource=new ClassPathResource("application.xml");
        BeanFactory context=new XmlBeanFactory(resource);
        context.getBean("service");

    }



    @Test
    public  void  test(){
        ApplicationContext con=new ClassPathXmlApplicationContext("application.xml");
        zjl_Service service=(zjl_Service)con.getBean("service");
        System.out.println(service);
        service.work();
    }
    @Test
    public  void  test02(){
        ApplicationContext con=new ClassPathXmlApplicationContext("application.xml");
        print printer = (print) con.getBean("Printer");
        printer.printer();
    }
}