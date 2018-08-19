

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SikakuDao;

/**
 * Servlet implementation class Insert1
 */
@WebServlet("/Insert1")
public class Insert1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert1() {
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
				String day = request.getParameter("day");
				String name = request.getParameter("name");
				String results = request.getParameter("results");

				//データベースから値を取得
				int result = SikakuDao.insert1Dao(id1,day,name,results);

				//取得した値をリクエストスコープへ
				request.setAttribute("Sikaku", result);
				request.setAttribute("id", id1);
				request.setAttribute("day", day);
				request.setAttribute("name", name);
				request.setAttribute("results", results);

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
