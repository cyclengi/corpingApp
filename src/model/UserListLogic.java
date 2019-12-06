package model;

import dao.UserDAO;

public class UserListLogic {


	public boolean addUser(UserBean userBean) {
		UserDAO dao = new UserDAO();
		return dao.createUser(userBean);
	}


	public UserBean authenticationUser(UserBean userBean) {
		UserDAO dao = new UserDAO();
		return dao.authenticationUser(userBean);
	}

}
