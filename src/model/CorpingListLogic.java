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

		if(corpingBean.getText() != null) {
			corpingBeanList = dao.textSearch(corpingBean.getText());
		} else {
			corpingBeanList = dao.tagSearch(corpingBean.getTag1(), corpingBean.getTag2(), corpingBean.getTag3());
		}

		return corpingBeanList;

	}

}
