package com.lht.learn.design23.strategy.v2.model;


import com.lht.learn.design23.strategy.v2.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lee
 * @Date: 2021/3/11 19:43
 * @Version 1.0
 */
public class People implements Node {
	private Integer id;

	private String name;

	private Integer parentId;

	private List<People> children = new ArrayList<>();

	public People(Integer id, String name, Integer parentId) {
		this.id = id;
		this.name = name;
		this.parentId = parentId;
	}


	@Override
	public List<People> getChildren() {
		return children;
	}

	public void setChildren(List<People> children) {
		this.children = children;
	}

	@Override
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

	@Override
	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
}
