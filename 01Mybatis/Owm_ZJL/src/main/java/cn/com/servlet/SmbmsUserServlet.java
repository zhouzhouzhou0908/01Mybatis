package cn.com.servlet;

import cn.com.entity.PagePOJO;
import cn.com.entity.Smbms_user;
import cn.com.service.ISmbmsService;
import cn.com.service.impl.SmbmsServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by annan on 2017/9/19.
 */
public class SmbmsUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        ISmbmsService service=new SmbmsServiceimpl();
        String action=request.getParameter("action");

        /*登陆*/
        if("userlogin".equals(action)){
            String userCode = request.getParameter("userCode");
            String password =request.getParameter("password");

            Smbms_user smbms_user=new Smbms_user();
            smbms_user.setUserCode(userCode);
            smbms_user.setUserPassword(password);

            Smbms_user smbms_user1 = service.userlogin(smbms_user);
            if (smbms_user1!=null){
                request.getRequestDispatcher("/welcome.jsp").forward(request,  response);
            }else{
                response.sendRedirect("/login.jsp");
            }

        }

        /*查询列表*/
        if ("userList".equals(action)){
            PagePOJO page=new PagePOJO();
            //显示每页记录数
            int pageSize=2;
            page.setPageSize(pageSize);
            //总记录数
            int userfy = service.userfy();
            page.setTotalRecords(userfy);
            //总页数
            int TotalPages=userfy%pageSize==0?userfy/pageSize:userfy/pageSize+1;
            page.setTotalpages(TotalPages);
            //当前页数
            int pageIndex=1;
            if(request.getParameter("pageIndex")!=null&&request.getParameter("pageIndex")!=""){
                try {
                    pageIndex=Integer.parseInt(request.getParameter("pageIndex"));
                } catch (Exception e) {
                    pageIndex=1;
                }

            }
            if(pageIndex>TotalPages){
                pageIndex=TotalPages;
            }
            if(pageIndex<=0){
                pageIndex=1;
            }
            page.setPageIndex(pageIndex);

                page.getPageIndex();
                page.getTotalpages();
            List<Smbms_user> smbms_users = service.userListpage(pageIndex, pageSize);
            page.setList(smbms_users);
            request.setAttribute("page",page);

            request.getRequestDispatcher("/userList.jsp").forward(request, response);

        }
        /*添加*/
        if ("userAdd".equals(action)){
            String userId = request.getParameter("userId");
            String userName = request.getParameter("userName");
            String userpassword = request.getParameter("userpassword");
            String sex = request.getParameter("sex");
            int gender;
            if ("1".equals(sex)){
                gender=1;
            }else{
                gender=2;
            }
            String data = request.getParameter("data");
            String userphone = request.getParameter("userphone");
            String userAddress = request.getParameter("userAddress");
            String userlei = request.getParameter("userlei");
            int UserType;
            if ("1".equals(userlei)){
                UserType=1;
            }else if("2".equals(userlei)){
                UserType=2;
            }else{
                UserType=3;
            }

            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//小写的mm表示的是分钟

            Date da= null;
            try {
                da = sdf.parse(data);
                Smbms_user user=new Smbms_user();
                user.setUserCode(userId);
                user.setUserName(userName);
                user.setUserPassword(userpassword);
                user.setGender(gender);
                user.setBirthday(da);
                user.setPhone(userphone);
                user.setAddress(userAddress);
                user.setUserType(UserType);

                System.out.println(da);
                System.out.println(userphone);
                System.out.println(userAddress);
                System.out.println(UserType);

                int i = service.userAdd(user);
                if (i>0){
                    request.getRequestDispatcher("/SmbmsUserServlet?action=userList").forward(request, response);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

         /*删除*/
        if("userdel".equals(action)){
            String userid = request.getParameter("userid");
            System.out.println("userid"+userid);
            int uid=Integer.parseInt(userid);
            System.out.println("uid"+uid);

            Smbms_user user=new Smbms_user();
            user.setId(uid);
            int i = service.userDel(user);
            if (i>0){
                request.getRequestDispatcher("/SmbmsUserServlet?action=userList").forward(request, response);
            }
        }

        /*模糊查询*/
        if("userLikeList".equals(action)){
            System.out.println("1");
            String uname = request.getParameter("uname");

            Smbms_user user=new Smbms_user();
            user.setUserName(uname);
            System.out.println("2");
            List<Smbms_user> smbms_users = service.userLikeList(user);
            if (smbms_users!=null){

                PagePOJO page=new PagePOJO();
                page.setList(smbms_users);
                request.setAttribute("page",page);

                request.getRequestDispatcher("/userList.jsp").forward(request, response);
            }else {
                request.getRequestDispatcher("/welcome.jsp");

            }
        }

        /*获取修改内容*/
        if("userUpdate".equals(action)){
            String userid = request.getParameter("udid");
            int uid=Integer.parseInt(userid);
            Smbms_user user=new Smbms_user();
            user.setId(uid);

            Smbms_user smbms_user = service.userByList(user);
            request.setAttribute("suList",smbms_user);
            if (smbms_user!=null) {
                request.getRequestDispatcher("/userUpdate.jsp?useid=uid").forward(request, response);
            }

        }

        /*修改*/
        if("userUpd".equals(action)){
            System.out.println("1");
            String userId = request.getParameter("useid");
            int useid=Integer.parseInt(userId);
            String userName = request.getParameter("userName");
            String sex = request.getParameter("gender");
            int gender;
            if ("1".equals(sex)){
                gender=1;
            }else{
                gender=2;
            }
            String data = request.getParameter("data");
            String userphone = request.getParameter("userphone");
            String userAddress = request.getParameter("userAddress");
            String userlei = request.getParameter("userlei");
            int UserType;
            if ("1".equals(userlei)){
                UserType=1;
            }else if("2".equals(userlei)){
                UserType=2;
            }else{
                UserType=3;
            }

            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//小写的mm表示的是分钟

            Date da;
            try {
                da = sdf.parse(data);
                Smbms_user user=new Smbms_user();
                user.setId(useid);
                user.setUserName(userName);
                user.setGender(gender);
                user.setBirthday(da);
                user.setPhone(userphone);
                user.setAddress(userAddress);
                user.setUserType(UserType);

                System.out.println(da);
                System.out.println(userphone);
                System.out.println(userAddress);
                System.out.println(UserType);

                int i = service.userUpd(user);
                System.out.println("2");
                if (i>0){
                    request.getRequestDispatcher("/SmbmsUserServlet?action=userList").forward(request, response);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost( request,response);
    }
}
