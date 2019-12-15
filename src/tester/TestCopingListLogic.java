package tester;

import static org.junit.Assert.*;

import org.junit.Test;

import model.CorpingBean;
import model.CorpingListLogic;

public class TestCopingListLogic {

	@Test
	public void testGetCorping() {
		fail("まだ実装されていません");
	}

	@Test
	public void testPostCorping() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSerchCorping() {
		CorpingBean corpingBean = new CorpingBean("", null, null, null);

		CorpingListLogic corpingListLogic = new CorpingListLogic();
		corpingListLogic.serchCorping(corpingBean);

		assertEquals(null, corpingBean.getText());
		assertEquals(null, corpingBean.getTag1());
		assertEquals(null, corpingBean.getTag2());
		assertEquals(null, corpingBean.getTag3());
	}

}
