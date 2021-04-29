package com.lht.learn.design23.strategy.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lee
 * @Date: 2021/3/11 19:43
 * @Version 1.0
 */
public class People {
	private Integer id;

	private String name;

	private Integer parentId;

	private List<People> children = new ArrayList<>();

	public People(Integer id, String name, Integer parentId) {
		this.id = id;
		this.name = name;
		this.parentId = parentId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public List<People> getChildren() {
		return children;
	}

	public void setChildren(List<People> children) {
		this.children = children;
	}
}
