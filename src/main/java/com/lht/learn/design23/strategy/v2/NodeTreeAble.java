package com.lht.learn.design23.strategy.v2;

/**
 * @Author: lee
 * @Date: 2021/4/12 9:36
 * @Version 1.0
 */
public class NodeTreeAble implements TreeAble<Node> {

	@Override
	public Boolean isParent(Node o1, Node target) {
		if (o1.getParentId() == target.getId()) {
			return true;
		}
		return false;
	}

	@Override
	public void fillChild(Node o1, Node target) {

		target.getChildren().add(o1);
	}

	@Override
	public Boolean isRootNode(Node o1) {
		if (o1.getParentId() == 0 || null == o1.getParentId()) {
			return true;
		}
		return false;
	}

}
