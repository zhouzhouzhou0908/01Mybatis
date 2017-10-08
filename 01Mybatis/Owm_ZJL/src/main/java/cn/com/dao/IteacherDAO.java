package cn.com.dao;

import cn.com.entity.teacher;

import java.util.List;

public interface IteacherDAO {
    //根据老师id查询都教了什么麻瓜
    public teacher teacherid(int id);
    //查询
    public List<teacher> sel();

}