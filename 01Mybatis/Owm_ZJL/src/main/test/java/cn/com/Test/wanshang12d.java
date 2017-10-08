package cn.com.Test;


import cn.com.dao.IUset_loginDAO;
import cn.com.dao.IUset_typeDAO;
import cn.com.entity.user_login;
import cn.com.entity.user_type;
import cn.zjl.unti.MyBatisunti;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;

public class wanshang12d {
    @Test
    public  void test01() throws IOException {
        SqlSession session = MyBatisunti.getsession();
        IUset_typeDAO mapper = session.getMapper(IUset_typeDAO.class);
        user_type uus = mapper.uus(0);
        System.out.println(uus.getUser_type_name());
        for (user_login log:uus.getLog()){
            System.out.println(log.getUser_name());
        }
        session.commit();;
        session.close();

    }

    @Test
    public  void test03() throws IOException {

        SqlSession session = MyBatisunti.getsession();
        IUset_loginDAO mapper = session.getMapper(IUset_loginDAO.class);

        user_login logcad = mapper.logcad(31);
        System.out.println(logcad.getUser_name());
        System.out.println(logcad.getTypes().getUser_type_name());
        session.commit();;
        session.close();

    }
    @Test
    public  void test04() throws IOException {

        SqlSession session = MyBatisunti.getsession();
        IUset_loginDAO mapper = session.getMapper(IUset_loginDAO.class);

        user_login logcad = mapper.logMit(31);
        System.out.println(logcad.getUser_name());
        System.out.println(logcad.getTypes().getUser_type_name());
        session.commit();;
        session.close();

    }
}