package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.CorpingBean;


public class CorpingDAO {

	private final String DRIVER_NAME = "org.h2.Driver";
	private final String JDBC_URL = "jdbc:h2:file:C:/data/corpingApp";
	private final String DB_USER = "sa";
	private final String DB_PASS = "1234";

	public List<CorpingBean> findAll(){
		Connection conn = null;
		List<CorpingBean> corpingBeanList = new ArrayList<CorpingBean>();
		try {
			Class.forName(DRIVER_NAME);
			conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

			String sql = "SELECT ID,TEXT,TAG1,TAG2,TAG3 FROM CORPING ORDER BY ID DESC";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			ResultSet rs = pStmt.executeQuery();

			while(rs.next()) {
				int id = rs.getInt("ID");
				String text = rs.getString("TEXT");
				String tag1 = rs.getString("TAG1");
				String tag2 = rs.getString("TAG2");
				String tag3 = rs.getString("TAG3");
				CorpingBean corpingBean = new CorpingBean(id, text, tag1, tag2, tag3); //SQL NULLの場合、返される値はNULL。
				corpingBeanList.add(corpingBean);
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

		return corpingBeanList;

	}


	//テキスト内容で検索
	public List<CorpingBean> textSearch(String serchWord){
		Connection conn = null;
		List<CorpingBean> corpingBeanList = new ArrayList<CorpingBean>();
		try {
			Class.forName(DRIVER_NAME);
			conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

			String sql = "SELECT ID,TEXT,TAG1,TAG2,TAG3 FROM CORPING WHERE TEXT LIKE ? ORDER BY ID DESC";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, "%" + serchWord + "%");

			ResultSet rs = pStmt.executeQuery();

			while(rs.next()) {
				int id = rs.getInt("ID");
				String text = rs.getString("TEXT");
				String tag1 = rs.getString("TAG1");
				String tag2 = rs.getString("TAG2");
				String tag3 = rs.getString("TAG3");
				CorpingBean corpingBean = new CorpingBean(id, text, tag1, tag2, tag3); //SQL NULLの場合、返される値はNULL。
				corpingBeanList.add(corpingBean);
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

		return corpingBeanList;

	}


	//タグで検索
	public List<CorpingBean> tagSearch(String serchTag1, String serchTag2, String serchTag3){
		Connection conn = null;
		List<CorpingBean> corpingBeanList = new ArrayList<CorpingBean>();
		try {
			Class.forName(DRIVER_NAME);
			conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

			String sql = "SELECT ID,TEXT,TAG1,TAG2,TAG3 FROM CORPING "
					+ "WHERE (TAG1 IN (?, ?, ?)) OR (TAG2 IN (?, ?, ?)) OR (TAG3 IN (?, ?, ?)) ORDER BY ID DESC";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, serchTag1);
			pStmt.setString(2, serchTag2);
			pStmt.setString(3, serchTag3);
			pStmt.setString(4, serchTag1);
			pStmt.setString(5, serchTag2);
			pStmt.setString(6, serchTag3);
			pStmt.setString(7, serchTag1);
			pStmt.setString(8, serchTag2);
			pStmt.setString(9, serchTag3);

			ResultSet rs = pStmt.executeQuery();

			while(rs.next()) {
				int id = rs.getInt("ID");
				String text = rs.getString("TEXT");
				String tag1 = rs.getString("TAG1");
				String tag2 = rs.getString("TAG2");
				String tag3 = rs.getString("TAG3");
				CorpingBean corpingBean = new CorpingBean(id, text, tag1, tag2, tag3); //SQL NULLの場合、返される値はNULL。
				corpingBeanList.add(corpingBean);
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

		return corpingBeanList;

	}



	//項目を追加
	public boolean create(CorpingBean corpingBean) {
		Connection conn = null;

		try {
			conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

			String sql = "INSERT INTO CORPING(TEXT, TAG1, TAG2, TAG3) VALUES(?, ?, ?, ?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, corpingBean.getText());
			pStmt.setString(2, corpingBean.getTag1());
			pStmt.setString(3, corpingBean.getTag2());
			pStmt.setString(4, corpingBean.getTag3());

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


