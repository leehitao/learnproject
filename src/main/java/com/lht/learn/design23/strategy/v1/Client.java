package com.lht.learn.design23.strategy.v1;

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

		People people = new People(1,"广东",0);
		People people1 = new People(2,"河南",0);
		People people2 = new People(3,"深圳",1);
		People people3 = new People(4,"郑州",2);
		People people4 = new People(5,"龙岗",3);
		People people5 = new People(6,"罗湖",3);
		People people6 = new People(7,"布心",6);
		People people7 = new People(8,"金稻田",7);
		list.add(people);
		list.add(people1);
		list.add(people2);
		list.add(people3);
		list.add(people4);
		list.add(people5);
		list.add(people6);
		list.add(people7);

		TreeTool treeTool = new TreeTool();
		List<People> tree = treeTool.getTree(list, new PeopleTreeAble());
		System.out.println();
	}

}
