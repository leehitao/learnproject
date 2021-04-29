package com.lht.learn.leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: lee
 * @Date: 2021/2/4 14:13
 * @Version 1.0
 */

/**
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，
 * 使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 */
public class leeCode_a_15 {


	public static void main(String[] args) {
		int[] nums = {-1, -1, 1, 3, 3, 0, 3, -3};
		System.out.println(threeSum(nums));

	}

	// 答案
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> ans = new ArrayList();
		int len = nums.length;
		if (nums == null || len < 3) return ans;
		Arrays.sort(nums); // 排序
		for (int i = 0; i < len; i++) {
			if (nums[i] > 0) break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
			if (i > 0 && nums[i] == nums[i - 1]) continue; // 去重
			int L = i + 1;
			int R = len - 1;
			while (L < R) {
				int sum = nums[i] + nums[L] + nums[R];
				if (sum == 0) {
					// 此处先做移位的话无法判断第一组数据,所以先统计数据的话，
					// 移位要注意拿当前值和下一次的值比较是否重复，不重复指针再移动到下一位
					ans.add(Arrays.asList(nums[i], nums[L], nums[R]));
					while (L < R && nums[L] == nums[L + 1]) L++; // 去重
					while (L < R && nums[R] == nums[R - 1]) R--; // 去重
					L++;
					R--;
				}
				else if (sum < 0) L++;
				else if (sum > 0) R--;
			}
		}
		return ans;
	}


}
