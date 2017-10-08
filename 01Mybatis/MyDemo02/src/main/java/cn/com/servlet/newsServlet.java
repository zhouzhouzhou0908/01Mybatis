package cn.com.servlet;

import cn.com.entity.PagePOJO;
import cn.com.entity.Smbms_user;

import cn.com.entity.news;
import cn.com.service.impl.newsServiceImpl;
import cn.com.service.newsService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by annan on 2017/9/19.
 */
public class newsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        newsService service=new newsServiceImpl();
        String action = request.getParameter("action");



        /*查询列表*/
        if ("list".equals(action)||action==null) {
            System.out.println("开头");
            PagePOJO page = new PagePOJO();
            //显示每页记录数
            int pageSize = 1;
            page.setPageSize(pageSize);
            //总记录数
            int userfy = service.userfy();
            page.setTotalRecords(userfy);
            //总页数
            int TotalPages=userfy%pageSize==0?userfy/pageSize:userfy/pageSize+1;
            page.setTotalpages(TotalPages);
            //当前页数
            int pageIndex = 1;
            if (request.getParameter("pageIndex") != null && request.getParameter("pageIndex") != "") {
                try {
                    pageIndex = Integer.parseInt(request.getParameter("pageIndex"));
                } catch (Exception e) {
                    pageIndex = 1;
                }

            }
            if (pageIndex > TotalPages) {
                pageIndex = TotalPages;
            }
            if (pageIndex <= 0) {
                pageIndex = 1;
            }
            page.setPageIndex(pageIndex);

            page.getPageIndex();
            page.getTotalpages();
            List<news> newss = service.newsList((pageIndex-1)*pageSize,pageSize);
            page.setList(newss);
            request.setAttribute("page", page);

            System.out.println("丫的到哪里了！");

            request.getRequestDispatcher("/sele.jsp").forward(request, response);

        }
    }





    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost( request,response);
    }
}
