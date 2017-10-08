package cn.com.Test;

import cn.com.dao.ISmbmsUserDAO;
import cn.com.entity.Smbms_user;
import cn.com.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by annan on 2017/9/17.
 */
public class SmbmsTest20170917 {
    @Test//登陆ok
    public void SmbmsLogin() throws IOException {

        SqlSession session= MyBatisUtil.getSession();

        ISmbmsUserDAO mapper = session.getMapper(ISmbmsUserDAO.class);

        Smbms_user smbms_user=new Smbms_user();
        smbms_user.setUserCode("G002");
        smbms_user.setUserPassword("1");

        Smbms_user smbms_user1 = mapper.userlogin(smbms_user);

        if (smbms_user1!=null) {
            System.out.println(smbms_user1.getUserName());
        }
        session.close();
    }

/*
    @Test//分页查询
    public void userList() throws IOException {

        SqlSession session= MyBatisUtil.getSession();

        ISmbmsUserDAO mapper = session.getMapper(ISmbmsUserDAO.class);

        List<Smbms_user> smbms_users = mapper.userList(3, 3);

        for (Smbms_user item:smbms_users){
            System.out.println(item.getUserName());
        }
        session.close();
    }
*/

    @Test//查询
    public void userList() throws IOException {

        SqlSession session= MyBatisUtil.getSession();

        ISmbmsUserDAO mapper = session.getMapper(ISmbmsUserDAO.class);

        List<Smbms_user> smbms_users = mapper.userList();

        for (Smbms_user item:smbms_users){
            System.out.println(item.getUserName());
        }
        session.close();
    }


    @Test//添加user
    public void userAdd() throws IOException, ParseException {

        SqlSession session= MyBatisUtil.getSession();

        ISmbmsUserDAO mapper = session.getMapper(ISmbmsUserDAO.class);

        Smbms_user user=new Smbms_user();
        user.setUserCode("1");
        user.setUserName("22");
        user.setUserPassword("11");
        user.setGender(1);

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//小写的mm表示的是分钟
        String date="2012-11-11";
        Date da=sdf.parse(date);

        user.setBirthday(da);
        user.setPhone("1111111");
        user.setAddress("清华");
        user.setUserType(1);


        int userAdd = mapper.userAdd(user);
        session.commit();

        if (userAdd>0){
            System.out.println("添加ok");
        }
        session.close();
    }

    @Test//添加user
    public void userDEl() throws IOException {

        SqlSession session= MyBatisUtil.getSession();

        ISmbmsUserDAO mapper = session.getMapper(ISmbmsUserDAO.class);

        Smbms_user user=new Smbms_user();
        user.setId(542);
        int userAdd = mapper.userDel(user);
        session.commit();

        if (userAdd>0){
            System.out.println("删除 ok");
        }
        session.close();
    }
}
