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
public class SmbmsTest20170920 {



    @Test//修改的查询
    public void updateList() throws IOException {

        SqlSession session= MyBatisUtil.getSession();

        ISmbmsUserDAO mapper = session.getMapper(ISmbmsUserDAO.class);

        Smbms_user ssd=new Smbms_user();
        ssd.setId(550);
        Smbms_user smbmsuser = mapper.userByList(ssd);

        if (smbmsuser!=null){
            System.out.println(smbmsuser.getUserName());
        }

        session.close();
    }

    @Test//修改
    public void userUpd() throws IOException {

        SqlSession session= MyBatisUtil.getSession();

        ISmbmsUserDAO mapper = session.getMapper(ISmbmsUserDAO.class);

        Smbms_user ssd=new Smbms_user();
        ssd.setId(53);
        ssd.setUserName("mmp");
        ssd.setUserPassword("xxx");
        ssd.setPhone("5545478465");

        int i = mapper.userUpd(ssd);
        session.commit();

        if (i>0){
            System.out.println("修改 ok！");
        }
        session.close();
    }

}
