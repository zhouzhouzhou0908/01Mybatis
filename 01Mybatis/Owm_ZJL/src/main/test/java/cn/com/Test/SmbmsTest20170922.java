package cn.com.Test;

import cn.com.dao.ISmbmsUserDAO;
import cn.com.entity.PagePOJO;
import cn.com.entity.Smbms_user;
import cn.com.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by annan on 2017/9/17.
 */
public class SmbmsTest20170922 {


    //模糊查询
//    public void userLikeList() throws IOException {
//
//        SqlSession session= MyBatisUtil.getSession();
//
//        ISmbmsUserDAO mapper = session.getMapper(ISmbmsUserDAO.class);
//
//        PagePOJO page = new PagePOJO(5, 2, 2, 2, 2, 2);
//        Map<String,Object> params = new HashMap<String,Object>();
//        params.put("page", page);
//        List<Smbms_user> smbms_users = mapper.userLikeList(params);
//
//        for (Smbms_user item:smbms_users){
//            System.out.println(item);
//        }
//
//        session.close();
//    }

    @Test
    public  void test001(){
        SqlSession session = MyBatisUtil.getSession();
        ISmbmsUserDAO mapper = session.getMapper(ISmbmsUserDAO.class);
        Smbms_user user=new Smbms_user();
            user.setUserName("耿");
        List<Smbms_user> smbms_users = mapper.userLikeList(user);
        for (Smbms_user item:smbms_users){
            System.out.println(item);
        }
    }
    @Test
    public void test002(){
        SqlSession session = MyBatisUtil.getSession();
        ISmbmsUserDAO mapper = session.getMapper(ISmbmsUserDAO.class);
        List<Smbms_user> smbms_users = mapper.userListpage(1, 2);
        for (Smbms_user item:smbms_users){
            System.out.println(item.getUserName());
        }
    }
    @Test
    public void test003(){
        SqlSession session = MyBatisUtil.getSession();
        ISmbmsUserDAO mapper = session.getMapper(ISmbmsUserDAO.class);
        int userfy = mapper.userfy();
        System.out.println(userfy);
    }

    }







