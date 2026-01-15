package com.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dairy {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(columnDefinition="text")
	private String title;
	@Column(columnDefinition="text")
	private String content;
	@Column(columnDefinition="text")
	private String category;
	@Column(columnDefinition="text")
	private String remark;
	
	@Override
	public String toString() {
		return "Dairy [id=" + id + ", title=" + title + ", content=" + content + ", category=" + category + ", remark="
				+ remark + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
