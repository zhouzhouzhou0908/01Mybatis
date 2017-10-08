package cn.com.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by annan on 2017/9/16.
 */
public class MyBatisUtil {

    static String resource="mybatis-config.xml";
    static  InputStream is;
    static SqlSessionFactory factory;

    static {
        try {
            is =Resources.getResourceAsStream(resource);
            factory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSession(){
        return factory.openSession(true);
    }

}


