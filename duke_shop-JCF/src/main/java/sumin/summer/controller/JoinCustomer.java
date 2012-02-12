package sumin.summer.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sumin.summer.dao.ShopDao;
import sumin.summer.model.Member;
import fw.DaoFactory;


/**
 * Servlet implementation class JoinCustomer
 */
public class JoinCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JoinCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		//------------------ �������� Login ���� ������ ����----------------------------
		Member member= new Member();
		member.setUserId(request.getParameter("userId"));
		member.setPassword(request.getParameter("password"));
		member.setName(request.getParameter("name"));
		member.setEmail(request.getParameter("email"));
		member.setDeptName(request.getParameter("deptName"));
		HttpSession session = request.getSession();

		//------------------ �α��� ���� Ȯ�� --------------------------------------------

		ShopDao dao=new DaoFactory().shopDao();
		dao.insertMember(member);
		session.setAttribute("member",member);
		response.sendRedirect("join_member_proc.jsp");
	}

}
