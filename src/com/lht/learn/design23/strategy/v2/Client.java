package com.lht.learn.design23.strategy.v2;


import com.lht.learn.design23.strategy.v2.model.People;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lee
 * @Date: 2021/4/12 10:00
 * @Version 1.0
 */
public class Client {

	public static void main(String[] args) {

		List<People> list = new ArrayList<People>();
		list.add(new People(1, "广东", 0));
		list.add(new People(3, "深圳", 1));
		list.add(new People(2, "河南", 0));
		list.add(new People(4, "郑州", 2));
		list.add(new People(5, "龙岗", 3));
		list.add(new People(6, "罗湖", 3));
		list.add(new People(7, "布心", 6));
		list.add(new People(8, "金稻田", 7));

		TreeTool treeTool = new TreeTool();
		List<People> tree = treeTool.getTree(list, new NodeTreeAble());
		System.out.println();

	}

}
