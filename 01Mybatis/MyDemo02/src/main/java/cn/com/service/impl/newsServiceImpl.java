package cn.com.service.impl;

import cn.com.dao.ISmbmsUserDAO;
import cn.com.dao.InewsDAO;
import cn.com.entity.news;
import cn.com.service.newsService;
import cn.com.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class newsServiceImpl implements newsService {
    InewsDAO dao;
    SqlSession session;
    public newsServiceImpl(){
        session = MyBatisUtil.getSession();
      dao=session.getMapper(InewsDAO.class);
    }


    public List<news> newsList(int pageIndex, int pageSize) {
        return dao.newsList(pageIndex,pageSize);
    }

    public int userfy() {
        return dao.userfy();
    }
}