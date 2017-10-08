package cn.com.dao;

import cn.com.entity.Smbms_user;

import java.util.List;
import java.util.Map;

/**
 * 用户接口
 * Created by annan on 2017/9/18.
 */
public interface ISmbmsUserDAO {

    public Smbms_user userlogin(Smbms_user su);//登陆

    //查询列表
    public List<Smbms_user> userList();

    //分页查询
    public List<Smbms_user> userListpage(int pageIndex, int pageSize);
    //获取所有记录数
    public  int userfy();

    //添加用户
    public int userAdd(Smbms_user suadd);

    //删除用户
    public int userDel(Smbms_user sudel);

    //模糊查询
    public List<Smbms_user> userLikeList(Smbms_user user);

    //读取修改内容
    public Smbms_user userByList(Smbms_user smbms_use);

    //修改
    public int userUpd(Smbms_user user);


}
