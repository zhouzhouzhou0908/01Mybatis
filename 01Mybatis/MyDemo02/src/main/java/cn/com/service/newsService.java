package cn.com.service;

import cn.com.entity.news;

import java.util.List;

public interface newsService {
    //查询列表
    public List<news> newsList(int pageIndex, int pageSize);
    //获取所有记录数
    public  int userfy();
}