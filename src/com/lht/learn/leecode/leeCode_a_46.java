package com.lht.learn.leecode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: lee
 * @Date: 2021/3/6 11:09
 * @Version 1.0
 */
public class leeCode_a_46 {


	/**
	 * @param args
	 * @desc: 给你一个未排序的整数数组 nums ，请你找出其中没有出现的最小的正整数
	 */
	public static void main(String[] args) {

		int[] nums = {9, 7, 6};

		List<List<Integer>> permute = permute(nums);

		System.out.println(permute);
	}

	public static List<List<Integer>> permute(int[] nums) {

		ArrayList<List<Integer>> list = new ArrayList<>();

		ArrayList<Integer> base = new ArrayList<>();

		for (int num : nums) {
			base.add(num);
		}
		getAllPro(base.size(), base, list, 0);

		return list;
	}

	private static void getAllPro(int size, ArrayList<Integer> base, ArrayList<List<Integer>> list, int first) {

		if (first == size) {
			list.add(new ArrayList<>(base));
		}
		for (int i = first; i < base.size(); i++) {

			Collections.swap(base, i, first);

			getAllPro(size, base, list, first + 1);

			Collections.swap(base, i, first);
		}

	}

}
