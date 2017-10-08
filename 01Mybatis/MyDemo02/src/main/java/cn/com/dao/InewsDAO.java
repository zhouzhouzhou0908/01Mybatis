package cn.com.dao;

import cn.com.entity.Smbms_user;
import cn.com.entity.news;

import java.util.List;

/**
 * 用户接口
 * Created by annan on 2017/9/18.
 */
public interface InewsDAO {



    //查询列表
    public List<news> newsList(int pageIndex, int pageSize);
    //获取所有记录数
    public  int userfy();




}
