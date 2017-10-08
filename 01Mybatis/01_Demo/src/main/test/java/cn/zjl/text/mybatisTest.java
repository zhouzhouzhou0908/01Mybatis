package cn.zjl.text;

import cn.zjl.dao.IUserDao;
import cn.zjl.enetiy.userinfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class mybatisTest {

@Test
   public  void test111() throws IOException {
      String path="Mybatis-config.xml";
      //1.将硬盘上的xml变成一个输入流
      InputStream resource= Resources.getResourceAsStream(path);
      //2.使用流对象作为参数创建一个会话工厂
      SqlSessionFactory fact = new SqlSessionFactoryBuilder().build(resource);
      //3.通过会话工厂创建会话对象，session就是程序员和数据库的交互的入口
      SqlSession session = fact.openSession();
      //4.调度selectList方法执行sql，并且获取结果
     // List<userinfo> list=session.selectList("select_Final");
    IUserDao mapper = session.getMapper(IUserDao.class);
    List<userinfo> list = mapper.select_Final();
   for (userinfo user:list){

         System.out.print(user.getUsername());
         System.out.println(user.getUserpwd());
      }
      //5.关闭会话，释放资源，提高性能
      session.close();

   }
   @Test
   public  void test112() throws IOException {
      String path="Mybatis-config.xml";
      //1.将硬盘上的xml变成一个输入流
      InputStream resource= Resources.getResourceAsStream(path);
      //2.使用流对象作为参数创建一个会话工厂
      SqlSessionFactory fact = new SqlSessionFactoryBuilder().build(resource);
      //3.通过会话工厂创建会话对象，session就是程序员和数据库的交互的入口
      SqlSession session = fact.openSession();
      IUserDao mapper = session.getMapper(IUserDao.class);

      userinfo user=new userinfo();
      user.setUsername("小周0908");
      user.setUserpwd("0051");
      mapper.insert_Final(user);

      session.commit();
      System.out.println("真皮是FA");

      //5.关闭会话，释放资源，提高性能
      session.close();

   }

   @Test
      public  void test113() throws IOException {
         String path="Mybatis-config.xml";
         //1.将硬盘上的xml变成一个输入流
         InputStream resource= Resources.getResourceAsStream(path);
         //2.使用流对象作为参数创建一个会话工厂
         SqlSessionFactory fact = new SqlSessionFactoryBuilder().build(resource);
         //3.通过会话工厂创建会话对象，session就是程序员和数据库的交互的入口
         SqlSession session = fact.openSession();


         IUserDao mapper = session.getMapper(IUserDao.class);

         userinfo user=new userinfo();
         user.setUsername("小周");
         user.setUserid(1);
         mapper.update_Final(user);

         session.commit();
         System.out.println("真皮是FA");

         //5.关闭会话，释放资源，提高性能
         session.close();


   }
   @Test
   public  void test114() throws IOException {
      String path="Mybatis-config.xml";
      //1.将硬盘上的xml变成一个输入流
      InputStream resource= Resources.getResourceAsStream(path);
      //2.使用流对象作为参数创建一个会话工厂
      SqlSessionFactory fact = new SqlSessionFactoryBuilder().build(resource);
      //3.通过会话工厂创建会话对象，session就是程序员和数据库的交互的入口
      SqlSession session = fact.openSession();
      IUserDao mapper = session.getMapper(IUserDao.class);

      userinfo user=new userinfo();
      mapper.date_Final(11);




      session.commit();
      System.out.println("真皮是FA");

      //5.关闭会话，释放资源，提高性能
      session.close();


   }


}