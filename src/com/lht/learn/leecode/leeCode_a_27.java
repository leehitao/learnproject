package com.lht.learn.leecode;

/**
 * @Author: lee
 * @Date: 2021/3/8 11:42
 * @Version 1.0
 */
public class leeCode_a_27 {

	/**
	 * @param args
	 * @desc: 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
	 * <p>
	 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
	 * <p>
	 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
	 */
	public static void main(String[] args) {

		int[] nums = {};
		int i = removeElement(nums, 2);
		System.out.println(i);


		int a = -9;
		int b = 4;
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("a:" + a);
		System.out.println("b:" + b);


	}


	public static int removeElement(int[] nums, int val) {
		int j = nums.length - 1;
		int i = 0;
		if (nums == null || nums.length == 0) {
			return 0;
		}
		while (i <= j) {
			if (nums[i] != val) {
				i++;
				continue;
			}
			while (nums[j] == val && i < j) {
				j--;
			}
			if (i >= j) {
				return i;
			}
			nums[i] = nums[j];
			i++;
			j--;
		}
		return i;
	}
}
