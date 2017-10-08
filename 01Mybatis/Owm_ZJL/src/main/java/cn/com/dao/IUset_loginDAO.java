package cn.com.dao;


import cn.com.entity.user_login;

public interface IUset_loginDAO {
   //一条sql 多对一
    public user_login logcad(int id);
    //多条 多对一
    public  user_login logMit(int id);

}