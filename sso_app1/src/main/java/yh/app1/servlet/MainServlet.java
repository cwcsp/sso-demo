package yh.app1.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @Title:MainServlet
 * @Description:代表需要登录授权才能访问的页面
 * @author 张颖辉
 * @date 2017年9月8日上午10:03:39
 * @version 1.0
 */
public class MainServlet extends HttpServlet {
    private static final long serialVersionUID = 3615122544373006252L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/main.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    
}