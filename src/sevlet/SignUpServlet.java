package sevlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UserBean;
import model.UserListLogic;

/**
 * Servlet implementation class signUpServlet
 */
@WebServlet("/servlet/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/logon.jsp");
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userId = request.getParameter("userId");
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		String mail = request.getParameter("mail");

		UserBean userBean = new UserBean(userId, pass, name, mail);

		UserListLogic logic = new UserListLogic();
		boolean result = logic.addUser(userBean);


		if(result) {
			request.setAttribute("msg", "ユーザ登録が完了しました。");
		} else {
			request.setAttribute("msg", "ユーザ登録に失敗しました。");
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/logonResult.jsp");
		dispatcher.forward(request, response);

	}

}
