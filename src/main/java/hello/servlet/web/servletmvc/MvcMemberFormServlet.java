package hello.servlet.web.servletmvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath = "/WEB-INF/views/new-form.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);

        /**
         * forward
          - 다른 서블릿이나 view 로 이동
          - 서버 내부에서 다시 호출이 발생됨
          - URL 이 변경되지 않음

         * redirect
          - 클라이언트로 응답이 나갔다가 redirect 경로로 다시 요청
          - URL 이 변경됨
         **/
        dispatcher.forward(request, response);
    }
}
