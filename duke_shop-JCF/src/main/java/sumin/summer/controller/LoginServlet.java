package sumin.summer.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sumin.summer.dao.ShopDao;
import sumin.summer.model.Customer;
import fw.DaoFactory;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		//------------------ �������� Login ���� ������ ����----------------------------
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		HttpSession session = request.getSession();

		//------------------ �α��� ���� Ȯ�� --------------------------------------------

		ShopDao dao=new DaoFactory().shopDao();

		Customer cust;
		try {
			cust = dao.getCustomer(id, passwd);
			if (  cust != null ) {
				session.setAttribute("login",cust);
			}else{
				session.setAttribute("loginFailed", "sumin");
			}

			response.sendRedirect("index.jsp");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//			RequestDispatcher dispatcher =
//					request.getRequestDispatcher("index.jsp");
//			dispatcher.forward(request, response);
//			return;

	}

}
