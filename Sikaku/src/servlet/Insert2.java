package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SikakuDao;

/**
 * Servlet implementation class Insert2
 */
@WebServlet("/Insert2")
public class Insert2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//formに入力された検索キーを取得
				request.setCharacterEncoding("UTF-8");
				String id = request.getParameter("id");
				int id1 = Integer.parseInt(id);
				String name = request.getParameter("name");
				String sikakuid = request.getParameter("sikakuid");
				int sikakuid1 = Integer.parseInt(sikakuid);

				//データベースから値を取得
				int result2 = SikakuDao.insert2Dao(id1,name,sikakuid);

				//取得した値をリクエストスコープへ
				request.setAttribute("Sikaku", result2);
				request.setAttribute("id", id1);
				request.setAttribute("name", name);
				request.setAttribute("sikakuid", sikakuid1);

				//結果画面へフォワード
				String view = "/WEB-INF/view/result.jsp";
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
