package com.lht.learn.leecode;

/**
 * @Author: lee
 * @Date: 2021/3/9 16:18
 * @Version 1.0
 */
public class leeCode_a_35 {

	/**
	 * @param args
	 * @desc: 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
	 */
	public static void main(String[] args) {

		int[] nums = {1, 5, 7, 23, 45, 76, 88, 89, 99};

		int i = searchInsert(nums, 100);

		System.out.println(i);
	}

	// 暴力遍历
	public static int searchInsert(int[] nums, int target) {

		int result = 0;

		if (nums[nums.length-1]<target) {
			return nums.length;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= target) {
				result = i;
				break;
			}
		}
		return result;
	}


	public static int searchInsert1(int[] nums, int target) {

		int result = 0;

		if (nums[nums.length-1]<target) {
			return nums.length;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= target) {
				result = i;
				break;
			}
		}
		return result;
	}
}
