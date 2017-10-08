package cn.com.Test;

import cn.com.dao.IteacherDAO;
import cn.com.entity.student;
import cn.com.entity.teacher;
import cn.com.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Teacher201793 {
    @Test
    public void test(){
        String path = System.getProperty("java.io.tmpdir");
                System.out.println(path);
    }
    @Test
    public  void test01(){
        SqlSession session = MyBatisUtil.getSession();
        IteacherDAO mapper = session.getMapper(IteacherDAO.class);
        teacher teacherid = mapper.teacherid(1);
        System.out.println(teacherid.getTname());
        for (student stu:teacherid.getStu()){
            System.out.println(stu.getSname());
        }
        session.close();
    }
    @Test
    public  void test02(){
        SqlSession session = MyBatisUtil.getSession();
        IteacherDAO mapper = session.getMapper(IteacherDAO.class);
        List<teacher> list = mapper.sel();
        System.out.println(list);

        System.out.println("逆时针的皮");

        List<teacher> apd = mapper.sel();
        System.out.println(apd);

        session.close();;


    }
}