package cn.zjl.dao;

import cn.zjl.enetiy.userinfo;

import java.util.List;
import java.util.Map;

public interface IUserDao {
    //查询的方法
    public List<userinfo> select_Final();
    //添加的方法
    public  int insert_Final(userinfo user);
    //修改的方法
    public  int update_Final(userinfo user);
    //删除的方法
    public  int date_Final(int id);
    //添加的方法
    public  int insert_Final1(userinfo user);
    //模糊查询
    public List<userinfo> selects(userinfo use);
    //多条件模糊查询
    public List<userinfo> sele(Map<String,Object>map);
    //索引多条件查询
    public  List<userinfo> finselect(String name, String s);
    //智能标签：我很困。。。。
    public  List<userinfo> ss(userinfo user);
    //智能标签数组：状态很好
    public  List<userinfo>szselect(int[] id);


}