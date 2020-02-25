package com.springboot.simpletodo.vo;

public class Todo {
	
	private int id;
	private String icon, title, detail, regDate, modDate;
	
	public Todo(int id, String icon, String title, String detail, String regDate, String modDate) {
		super();
		this.id = id;
		this.icon = icon;
		this.title = title;
		this.detail = detail;
		this.regDate = regDate;
		this.modDate = modDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getModDate() {
		return modDate;
	}

	public void setModDate(String modDate) {
		this.modDate = modDate;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", icon=" + icon + ", title=" + title + ", detail=" + detail + ", regDate=" + regDate
				+ ", modDate=" + modDate + "]";
	}
	
	
	
	

}
