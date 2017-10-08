package cn.zjl.unti;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisunti {
     private  static  String path="Mybatis-config.xml";
    private static SqlSessionFactory build;

    public static SqlSession getsession() throws IOException {
        InputStream rs = Resources.getResourceAsStream(path);
        build = new SqlSessionFactoryBuilder().build(rs);
        return build.openSession();

    }
    }

