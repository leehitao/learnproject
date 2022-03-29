package com.lht.learn.design23.strategy.v2.model;


import com.lht.learn.design23.strategy.v2.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lee
 * @Date: 2021/4/12 10:30
 * @Version 1.0
 */
public class Category implements Node {

	private Integer id;
	private String Name;
	private Integer parentId;
	private List<Category> children = new ArrayList<>();

	public Category(Integer id, String name, Integer parentId) {
		this.id = id;
		Name = name;
		this.parentId = parentId;
	}

	@Override
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	@Override
	public List<Category> getChildren() {
		return children;
	}

	public void setChildren(List<Category> children) {
		this.children = children;
	}
}
