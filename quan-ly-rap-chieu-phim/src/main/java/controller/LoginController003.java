package controller;

import dao.Thanhvien003DAO;
//LoginServlet.java
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// /view/login/ chua login.jsp
@WebServlet(urlPatterns = { "/LoginController003" })
public class LoginController003 extends HttpServlet {
	/**
	 * 
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String tentaikhoan = request.getParameter("tentaikhoan");
		String matkhau = request.getParameter("matkhau");

//		UserDAO122 userDAO = new UserDAO122();
		String userRole = Thanhvien003DAO.getUserRole(tentaikhoan, matkhau);

		if (userRole != null) {
			if (userRole.equals("nhanvien")) {
				HttpSession session = request.getSession(); // Lấy hoặc tạo phiên làm việc

				// Lưu thông tin người dùng vào phiên làm việc
				session.setAttribute("tentaikhoan", tentaikhoan); // Lưu tên người dùng
				session.setAttribute("role", userRole); // Lưu vai trò (admin, khách hàng, vv.)
				// Người dùng đăng nhập thành công và là "admin"
				response.sendRedirect("view/nhanvien/GDChinhNV003.jsp");
			} else if (userRole.equals("khachhang")) {
				// Người dùng đăng nhập thành công và là "khách hàng"
				HttpSession session = request.getSession(); // Lấy hoặc tạo phiên làm việc
				session.setAttribute("username", tentaikhoan); // Lưu tên người dùng
				session.setAttribute("role", userRole);
				response.sendRedirect("view/khachhang/GDChinhKH003.jsp");
			}
		} else {
			// Đăng nhập không thành công, chuyển hướng đến trang "error.jsp" hoặc nơi bạn
			// muốn
			response.sendRedirect("view/login/error.jsp");
		}
	}
}
