package com.lht.learn.leecode;

/**
 * @Author: lee
 * @Date: 2021/3/6 14:42
 * @Version 1.0
 */
public class leeCode_a_26 {

	/**
	 * @param args
	 * @desc: 给定一个排序数组，你需要在 原地 删除重复出现的元素，
	 * 使得每个元素只出现一次，返回移除后数组的新长度。你不需要考虑数组中超出新长度后面的元素
	 */
	public static void main(String[] args) {

		int[] nums = {1, 2, 3, 3, 4,4};
		int array = getArray1(nums);
		System.out.println(array);
		for (int num : nums) {
			System.out.print(num + ",");
		}

	}

	private static int getArray(int[] nums) {
		int j = 1;
		int bak = 0;

		if (nums.length < 2) {
			return nums.length;
		}
		for (int i = 0; i < nums.length - 1; i++, j++) {
			// 当找到了或者找到最后一个都不符合则退出while
			while (nums[i] >= nums[j] && j < nums.length - 1)
				j++;

			if (nums[i] < nums[j]) {
				nums[i + 1] = nums[j];
				bak = i + 2;
			} else {
				bak = i + 1;
			}
			if (j == nums.length - 1) {
				break;
			}
		}
		return bak;
	}

	private static int getArray1(int[] nums) {
		int j = 1;
		int i = 0;

		if (nums.length < 2) {
			return nums.length;
		}

		while (j < nums.length) {
			if (nums[i] == nums[j]) {
				j++;
			} else {
				i++;
				nums[i] = nums[j];
				j++;
			}
		}
		return i+1;
	}


}
