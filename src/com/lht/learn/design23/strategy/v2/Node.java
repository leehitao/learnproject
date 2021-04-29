package com.lht.learn.design23.strategy.v2;

import java.util.List;

/**
 * @Author: lee
 * @Date: 2021/4/12 10:21
 * @Version 1.0
 */
public interface Node<T> {

	Integer getId();

	List<T> getChildren();

	Integer getParentId();

}
