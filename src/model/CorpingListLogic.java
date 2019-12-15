package model;

import java.util.ArrayList;
import java.util.List;

import dao.CorpingDAO;

public class CorpingListLogic {

	//コーピングリストをすべて表示
	public List<CorpingBean> getCorping(){
		CorpingDAO dao = new CorpingDAO();
		List<CorpingBean> corpingBeanList = dao.findAll();
		return corpingBeanList;

	}

	//コーピングを挿入
	public boolean postCorping(CorpingBean corpingBean) {
		CorpingDAO dao = new CorpingDAO();
		return dao.create(corpingBean);
	}


	//コーピング検索
	public List<CorpingBean> serchCorping(CorpingBean corpingBean){
		CorpingDAO dao = new CorpingDAO();
		List<CorpingBean> corpingBeanList = new ArrayList<CorpingBean>();

		//入力チェック。空文字の場合はnullを代入。H2の場合、空文字だと検索がうまくいかない
		if(corpingBean.getText() == "") {
			corpingBean.setText(null);
		}
		if(corpingBean.getTag1() == "") {
			corpingBean.setTag1(null);
		}
		if(corpingBean.getTag2() == "") {
			corpingBean.setTag2(null);
		}
		if(corpingBean.getTag3() == "") {
			corpingBean.setTag3(null);
		}

		if(corpingBean.getText() != null) {
			corpingBeanList = dao.textSearch(corpingBean.getText());
		} else {
			corpingBeanList = dao.tagSearch(corpingBean.getTag1(), corpingBean.getTag2(), corpingBean.getTag3());
		}

		return corpingBeanList;

	}

}
