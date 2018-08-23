package servlet;


import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SikakuDao;
import dto.Sikaku;
import dto.Student;
import dto.Students;




/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/top")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		ArrayList<Students> result = SikakuDao.disp_ichiran();
		request.setAttribute("all2", result);

		request.setCharacterEncoding("UTF-8");
		ArrayList<Sikaku> result1 = SikakuDao.disp_Sikaku();
		request.setAttribute("all1", result1);

		request.setCharacterEncoding("UTF-8");
		ArrayList<Student> result3 = SikakuDao.disp_Student();
		request.setAttribute("all3", result3);

		String view = "/WEB-INF/view/top.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}