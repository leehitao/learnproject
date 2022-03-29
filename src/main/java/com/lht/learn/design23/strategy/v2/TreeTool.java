package com.lht.learn.design23.strategy.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lee
 * @Date: 2021/3/20 14:24
 * @Version 1.0
 */
public class TreeTool<T> {

	public <T> List<T> getTree(List<T> list, TreeAble treeAble) {
		List<T> rootList = new ArrayList<T>();
		for (T t : list) {
			if (treeAble.isRootNode(t)) {
				rootList.add(t);
			}
		}
		for (T parentNode : rootList) {
			fillChildPro(parentNode, list,treeAble);
		}
		return rootList;
	}

	private <T> void fillChildPro(T parentNode, List<T> list, TreeAble treeAble) {
		for (T t : list) {
			if (treeAble.isParent(t, parentNode)) {
				fillChildPro(t,list,treeAble);
				treeAble.fillChild(t, parentNode);
			}
		}
	}
}
