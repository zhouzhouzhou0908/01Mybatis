package cn.com.service.impl;

import cn.com.dao.ISmbmsUserDAO;
import cn.com.entity.Smbms_user;
import cn.com.service.ISmbmsService;
import cn.com.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

/**
 * Created by annan on 2017/9/19.
 */
public class SmbmsServiceimpl implements ISmbmsService{
    ISmbmsUserDAO dao;
    SqlSession session;
    public SmbmsServiceimpl(){
         session = MyBatisUtil.getSession();
        dao= session.getMapper(ISmbmsUserDAO.class);
    }


    public Smbms_user userlogin(Smbms_user su) {
        return dao.userlogin(su);
    }

    public List<Smbms_user> userList() {
        return dao.userList();
    }

    public List<Smbms_user> userListpage(int pageIndex, int pageSize) {
        return dao.userListpage(pageIndex,pageSize);
    }

    public int userfy() {
        return dao.userfy();
    }

    public int userAdd(Smbms_user suadd) {

       int a=dao.userAdd(suadd);
       session.commit();
        return a;

    }

    public int userDel(Smbms_user sudel) {
      return dao.userDel(sudel);
    }

    public List<Smbms_user> userLikeList(Smbms_user user) {
        return dao.userLikeList(user);
    }


    public Smbms_user userByList(Smbms_user smbms_use) {
        return dao.userByList(smbms_use);
    }

    public int userUpd(Smbms_user user) {
        return dao.userUpd(user);
    }
}
