package cn.zjl.text;

import cn.zjl.dao.IUserDao;
import cn.zjl.enetiy.userinfo;
import cn.zjl.unti.MyBatisunti;
import org.apache.ibatis.ognl.IntHashMap;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mybatisTest02 {
    @Test
    //添加
    public  void    testadd() throws IOException {
        userinfo user=new userinfo();
        user.setUsername("测试人员01");
        user.setUserpwd("0058");
        SqlSession getsession = MyBatisunti.getsession();
        IUserDao dao = getsession.getMapper(IUserDao.class);
        dao.insert_Final1(user);
        getsession.commit();
        getsession.close();
        System.out.println("成功嘻嘻嘻");

    }
    @Test
    //模糊查询
    public  void test01() throws IOException {
        SqlSession getsession = MyBatisunti.getsession();
        IUserDao mapper = getsession.getMapper(IUserDao.class);
        userinfo user=new userinfo();
        user.setUsername("小");

        List<userinfo> list= mapper.selects(user);
        for (userinfo item:list){
            System.out.println(item.getUsername());
        }
        System.out.println("这是成功了吗？？");

    }
    @Test
    public void test02() throws IOException {
        SqlSession getsession = MyBatisunti.getsession();
        IUserDao mapper = getsession.getMapper(IUserDao.class);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("username","小");
        map.put("userpwd",123);
        List<userinfo> sele = mapper.sele(map);
        for (userinfo item:sele){
            System.out.println(item.getUsername());

        }
        System.out.println("yyy");
        getsession.close();

    }
    @Test
    //添加
    public void test03() throws IOException {
        SqlSession session = MyBatisunti.getsession();
        IUserDao mapper = session.getMapper(IUserDao.class);
        userinfo user=new userinfo();
        user.setUsername("真皮沙发");
        System.out.println("添加前"+user.getUserid());
        mapper.insert_Final(user);
        System.out.println("添加后"+user.getUserid());
        session.commit();;
        session.close();
    }
    @Test
    //索引查询美滋滋
    public void test04() throws IOException {
        SqlSession getsession = MyBatisunti.getsession();
        IUserDao mapper = getsession.getMapper(IUserDao.class);
        List<userinfo>list=mapper.finselect("小","123");
        for (userinfo item:list){
            System.out.println(item.getUsername());
        }
        System.out.println("hh1");
        getsession.commit();
       getsession.close();
    }
    @Test
    //智能标签查询
    public void test05() throws IOException {
        SqlSession getsession = MyBatisunti.getsession();
        IUserDao mapper = getsession.getMapper(IUserDao.class);
        userinfo user=new userinfo();
        user.setUsername("小");
       user.setUserid(5);
        List<userinfo> ss = mapper.ss(user);
        for (userinfo item:ss){
            System.out.println(item.getUsername());
        }
        getsession.commit();
        getsession.close();

    }
    @Test
    //智能标签之模糊查询之数组
    public void test06() throws IOException {
        SqlSession getsession = MyBatisunti.getsession();
        IUserDao mapper = getsession.getMapper(IUserDao.class);
        int[] id={2,3,9};
        List<userinfo> list = mapper.szselect(id);
        for (userinfo item:list){
            System.out.println(item.getUsername());
        }
        System.out.println("嘿嘿嘿");
        getsession.commit();
        getsession.close();


    }

}