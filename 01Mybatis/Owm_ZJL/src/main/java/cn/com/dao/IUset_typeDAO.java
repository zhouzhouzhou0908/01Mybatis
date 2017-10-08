package cn.com.dao;


import cn.com.entity.user_type;

public interface IUset_typeDAO {
    //一条sql多对多
    public user_type uus(int id);
    //多条sql多对多
    public user_type uuMitsql(int id);
}