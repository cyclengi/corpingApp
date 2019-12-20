package sevlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CorpingBean;
import model.CorpingListLogic;

/**
 * Servlet implementation class CorpingAddServert
 */
@WebServlet("/servlet/CorpingAddServlet")
public class CorpingAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CorpingAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/corpingAdd.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String text = request.getParameter("text");
		String tag1 = request.getParameter("tag1");
		String tag2 = request.getParameter("tag2");
		String tag3 = request.getParameter("tag3");

		CorpingBean corpingBean = new CorpingBean(text, tag1, tag2, tag3);

		CorpingListLogic corpingListLogic = new CorpingListLogic();

		boolean result = corpingListLogic.postCorping(corpingBean);

		if(result) {
			request.setAttribute("msg", "コーピングの追加に成功しました。");
		} else {
			request.setAttribute("msg", "コーピングの追加に失敗しました。");
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/corpingAddResult.jsp");
		dispatcher.forward(request, response);
	}

}
