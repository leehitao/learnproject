package com.lht.learn.leecode;

/**
 * @Author: lee
 * @Date: 2021/2/7 11:50
 * @Version 1.0
 */

/**
 * @desc: 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 来源：力扣（LeetCode）
 */
public class leeCode_a_11 {

	public static void main(String[] args) {
		int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};

		int i = maxAreaMY2(nums);

		System.out.println(i);


	}

	//my=================O(n^2)======================
	public static int maxAreaMY(int[] height) {
		if (height == null || height.length == 0) {
			return 0;
		}
		int max = 0;
		int h;
		int w;
		for (int i = 0; i < height.length; i++) {
			for (int j = i + 1; j < height.length; j++) {
				h = height[i] < height[j] ? height[i] : height[j];
				w = j - i;
				max = h * w > max ? h * w : max;
			}
		}
		return max;
	}

	//my=================O(n)======================
	public static int maxAreaMY2(int[] height) {
		if (height == null || height.length < 2) {
			return 0;
		}
		int max = 0;
		int left = 0;
		int right = height.length - 1;
		int h;
		int w;
		while (left < right) {
			w = right - left;
			if (height[left] < height[right]) {
				h = height[left++];
				while (left < right && height[left] < h) {
					left++;
				}
			} else {
				h = height[right--];
				while (left < right && height[right] < h) {
					right--;
				}
			}
			max = h * w > max ? h * w : max;
		}
		return max;

	}

	//answer=======================================
}



