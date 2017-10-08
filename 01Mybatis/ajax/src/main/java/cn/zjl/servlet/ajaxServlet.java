package cn.zjl.servlet;

import cn.zjl.entity.Sickman;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ajaxServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException,IOException {
        String name=request.getParameter("uname");
        System.out.println("kkkkk");
        if (name.equals("admin")){
            response.getWriter().write("true");
        }else {
            response.getWriter().write("false");
        }

//        List<Sickman> list=new ArrayList<Sickman>();
//        Sickman sk1=new Sickman();
//        sk1.setPeople("她");
//        sk1.setAge(18);
//
//        Sickman sk2=new Sickman();
//        sk2.setPeople("他");
//        sk2.setAge(19);
//
//        list.add(sk1);
//        list.add(sk2);
//
//        String json = JSON.toJSONString(list);
//        response.setCharacterEncoding("utf-8");
//        response.getWriter().write(json);




    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException,IOException {
        doPost(request,response);
    }
}
