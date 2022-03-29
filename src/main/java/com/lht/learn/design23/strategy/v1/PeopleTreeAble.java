package com.lht.learn.design23.strategy.v1;

/**
 * @Author: lee
 * @Date: 2021/4/12 9:36
 * @Version 1.0
 */
public class PeopleTreeAble implements TreeAble<People> {

	@Override
	public Boolean isParent(People o1, People target) {
		if (o1.getParentId() == target.getId()) {
			return true;
		}
		return false;
	}

	@Override
	public void fillChild(People o1, People target) {

		target.getChildren().add(o1);
	}

	@Override
	public Boolean isFirstLv(People o1) {
		if (o1.getParentId() == 0 || null == o1.getParentId()) {
			return true;
		}
		return false;
	}

}
