package model;

import java.io.Serializable;

public class CorpingBean implements Serializable {
	private int id;
	private String text;
	private String tag1;
	private String tag2;
	private String tag3;

	//コンストラクタ
	public CorpingBean () {}

	public CorpingBean(int id, String text, String tag1, String tag2, String tag3) {
		this.id = id;
		this.text= text;
		this.tag1= tag1;
		this.tag2= tag2;
		this.tag3= tag3;
	}

	public CorpingBean(String text, String tag1, String tag2, String tag3) {
		this.text= text;
		this.tag1= tag1;
		this.tag2= tag2;
		this.tag3= tag3;
	}

	public CorpingBean(String text, String tag1, String tag2) {
		this.text= text;
		this.tag1= tag1;
		this.tag2= tag2;
	}

	public CorpingBean(String text, String tag1) {
		this.text= text;
		this.tag1= tag1;
	}

	public CorpingBean(String text) {
		this.text= text;
	}

	//getter,setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTag1() {
		return tag1;
	}

	public void setTag1(String tag1) {
		this.tag1 = tag1;
	}

	public String getTag2() {
		return tag2;
	}

	public void setTag2(String tag2) {
		this.tag2 = tag2;
	}

	public String getTag3() {
		return tag3;
	}

	public void setTag3(String tag3) {
		this.tag3 = tag3;
	}



}
