package cn.com.service.impl;

import cn.com.dao.InewsDAO;
import cn.com.dao.ItalkDao;
import cn.com.entity.news;
import cn.com.entity.talk;
import cn.com.service.newsService;
import cn.com.service.talkService;
import cn.com.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class talkServiceImpl implements talkService {
    ItalkDao dao;
    SqlSession session;
    public talkServiceImpl(){
        session = MyBatisUtil.getSession();
      dao=session.getMapper(ItalkDao.class);
    }


    public List<talk> newstalk() {
        return  dao.newstalk();
    }
}