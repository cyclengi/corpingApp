package tester;

import java.util.ArrayList;
import java.util.List;

import dao.CorpingDAO;
import model.CorpingBean;

public class DAOTester {

	public static void Main(String[] args) {

		//testFindAll();

		//testTextSearch("記念");

		//testTagSearch("怒り", null, null);


		String text = "Createのテスト1";
		CorpingBean corpingBean = new CorpingBean(text, "怒り", "悲しみ", "憂鬱");
		boolean result = testCreate(corpingBean);

		if(result) {
			System.out.println("正常にINSERT");
		} else {
			System.out.println("INSERTできず");
		}

		System.out.println("全部おわり");


	}


	//findAllをテスト
	public static void testFindAll() {
		List<CorpingBean> corpingBeans = new ArrayList<CorpingBean>();
		CorpingDAO dao = new CorpingDAO();
		corpingBeans = dao.findAll();

		for(CorpingBean corpingBean : corpingBeans) {
			System.out.println(corpingBean.getId());
			System.out.println(corpingBean.getText());
			System.out.println(corpingBean.getTag1());
			System.out.println(corpingBean.getTag2());
			System.out.println(corpingBean.getTag3());
			System.out.println("終了");
		}

	}


	//textSerchをテスト
	public static void testTextSearch(String serchWord) {

		List<CorpingBean> corpingBeans = new ArrayList<CorpingBean>();
		CorpingDAO dao = new CorpingDAO();
		corpingBeans = dao.textSearch(serchWord);

		for(CorpingBean corpingBean : corpingBeans) {
			System.out.println(corpingBean.getId());
			System.out.println(corpingBean.getText());
			System.out.println(corpingBean.getTag1());
			System.out.println(corpingBean.getTag2());
			System.out.println(corpingBean.getTag3());
			System.out.println("終了");
		}

	}


	//serchTagをテスト
	public static void testTagSearch(String serchWord1, String serchWord2, String serchWord3) {

		List<CorpingBean> corpingBeans = new ArrayList<CorpingBean>();
		CorpingDAO dao = new CorpingDAO();
		corpingBeans = dao.tagSearch(serchWord1, serchWord2, serchWord3);

		for(CorpingBean corpingBean : corpingBeans) {
			System.out.println(corpingBean.getId());
			System.out.println(corpingBean.getText());
			System.out.println(corpingBean.getTag1());
			System.out.println(corpingBean.getTag2());
			System.out.println(corpingBean.getTag3());
			System.out.println("終了");
		}

	}



	public static boolean testCreate(CorpingBean corpingBean) {

		CorpingDAO dao = new CorpingDAO();
		boolean result = dao.create(corpingBean);

		return result;


	}




}
