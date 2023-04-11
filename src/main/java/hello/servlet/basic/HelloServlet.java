package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// helloServlet 이라는 서블릿을 was 에서 제공하는 서블릿 컨테이너에 생성
// 서블릿은 싱글톤으로 생성되고 Request 와 Response 는 각 요청마다 생성
@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    /* HttpServletRequest 의 역할
        - HTTP 요청 메세지를 파싱
        - 임시 저장소 기능 (setAttribute, getAttribute)
        - 세션 관리 기능
     */

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HelloServlet.service");

        System.out.println("req = " + req);
        System.out.println("resp = " + resp);

        String username = req.getParameter("username");
        System.out.println("username = " + username);

        resp.setContentType("text/plain");
        resp.setCharacterEncoding("utf-8");
        resp.getWriter().write("hello " + username);
    }
}
