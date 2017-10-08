package cn.com.service;

import cn.com.entity.Smbms_user;

import java.util.List;
import java.util.Map;

/**
 * Created by annan on 2017/9/19.
 */
public interface ISmbmsService {

    public Smbms_user userlogin(Smbms_user su);//登陆啊

    //查询列表
    public List<Smbms_user> userList();



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

    public List<Smbms_user> userListpage(int pageIndex, int pageSize);
    //获取所有记录数
    public  int userfy();
}
