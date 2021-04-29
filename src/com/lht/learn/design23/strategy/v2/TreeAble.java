package com.lht.learn.design23.strategy.v2;

/**
 * @Author: lee
 * @Date: 2021/3/20 14:12
 * @Version 1.0
 */
public interface TreeAble<T> {

	Boolean isParent(T o1, T o2);

	void fillChild(T o1, T o2);

	Boolean isRootNode(T o1);

}
