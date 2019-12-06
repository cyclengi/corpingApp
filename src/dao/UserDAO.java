package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.UserBean;;


public class UserDAO {

	private final String DRIVER_NAME = "org.h2.Driver";
	private final String JDBC_URL = "jdbc:h2:file:C:/data/corpingApp";
	private final String DB_USER = "sa";
	private final String DB_PASS = "1234";

	public UserBean authenticationUser(UserBean userBean){
		Connection conn = null;
		UserBean authUserBean = new UserBean();
		try {
			Class.forName(DRIVER_NAME);
			conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

			String sql = "SELECT USERID, PASS, NAME, MAIL FROM USER WHERE USERID = ? AND PASS = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, userBean.getUserId());
			pStmt.setString(2, userBean.getPass());

			ResultSet rs = pStmt.executeQuery();


			if(rs.next()) {
				authUserBean.setUserId(rs.getString("USERID"));
				authUserBean.setPass(rs.getString("PASS"));
				authUserBean.setName(rs.getString("NAME"));
				authUserBean.setMail(rs.getString("MAIL"));
			} else {
				authUserBean = null;
			}


		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch(SQLException e) {
					e.printStackTrace();
					return null;
				}
			}
		}

		return authUserBean;

	}


	//項目追加
	public boolean createUser(UserBean userBean) {
		Connection conn = null;

		try {
			conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

			String sql = "INSERT INTO USER (USERID, PASS, NAME, MAIL) VALUES(?, ?, ?, ?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, userBean.getUserId());
			pStmt.setString(2, userBean.getPass());
			pStmt.setString(3, userBean.getName());
			pStmt.setString(4, userBean.getMail());

			int result = pStmt.executeUpdate();

			if(result != 1) {
				return false;
			}
		} catch(SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return true;

	}

}

