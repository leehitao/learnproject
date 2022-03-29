package com.lht.learn.leecode;

/**
 * @Author: lee
 * @Date: 2021/3/6 11:09
 * @Version 1.0
 */
public class leeCode_a_41 {


	/**
	  * @desc: 给你一个未排序的整数数组 nums ，请你找出其中没有出现的最小的正整数
	 * @param args
	*/
	public static void main(String[] args) {

		int[] nums = {9,7,6,8,0,3,2,5,1};


		System.out.println(getMin(nums));

	}

	private static int getMin(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			while(nums[i]>0 && nums[i]<nums.length && i != nums[i] && nums[nums[i]] != nums[i]){
				int temp = nums[i];
				nums[i] = nums[temp];
				nums[temp] = temp;
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (i != nums[i]) {
				return i;
			}
		}
		return nums.length+1;
	}

}
