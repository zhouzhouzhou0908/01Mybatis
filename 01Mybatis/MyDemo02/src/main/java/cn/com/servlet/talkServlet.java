package cn.com.servlet;

import cn.com.entity.PagePOJO;
import cn.com.entity.news;
import cn.com.entity.talk;
import cn.com.service.impl.newsServiceImpl;
import cn.com.service.impl.talkServiceImpl;
import cn.com.service.newsService;
import cn.com.service.talkService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by annan on 2017/9/19.
 */
public class talkServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
       talkService service=new talkServiceImpl();
        String action = request.getParameter("action");
            if (action==null){


            List<talk> talk = service.newstalk();
            request.setAttribute("talk",talk);
            request.getRequestDispatcher("/inser.jsp").forward(request,response);
            }


    }






    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost( request,response);
    }
}
