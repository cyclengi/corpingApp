package tester;



import dao.UserDAO;
import model.UserBean;

public class TestUserDAOjiriki {

	public static UserBean userBean = new UserBean("userA", "1234", null, null);
	public static UserBean insertUserBean = new UserBean("userC", "1123", "ゆーざーC", "userC@test.com");
	public static UserDAO dao = new UserDAO();

	public static void main(String[] args) {

		//testAuthenticationUser();

		testCreateUser();

		System.out.println("全部終わり");

	}


	public static void testAuthenticationUser() {


		UserBean uketori = dao.authenticationUser(userBean);

		if(uketori != null) {
			System.out.println(uketori.getUserId());
			System.out.println(uketori.getPass());
			System.out.println(uketori.getName());
			System.out.println(uketori.getMail());
		} else {
			System.out.println("認証失敗（戻り地がNULL）");
		}

	}


	public static void testCreateUser() {

		boolean result = dao.createUser(insertUserBean);

		if(result) {
			System.out.println("追加完了");
		} else {
			System.out.println("失敗");
		}


	}

}
