package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Lấy thông tin từ form đăng nhập
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Kiểm tra thông tin đăng nhập (trong trường hợp này, sử dụng thông tin cố định)
        if ("user123".equals(username) && "pass456".equals(password)) {
            // Nếu đúng, chuyển hướng sang trang GDChinhNV003.jsp
            response.sendRedirect("GDChinhNV003.jsp");
        } else {
            // Nếu sai, hiển thị thông báo đăng nhập không thành công
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body><p>Login failed. Please check your username and password.</p></body></html>");
        }
    }
}
