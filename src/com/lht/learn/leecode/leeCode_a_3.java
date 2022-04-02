package com.lht.learn.leecode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lee
 * @version 1.0
 * @project leetcode
 * @package PACKAGE_NAME
 * @date 2020/4/11 15:07
 */
public class leeCode_a_3 {

    public static void main(String[] args) {

        String s = "aabc";


        System.out.println(lengthOfLongestSubstring(s));

    }


    public static int lengthOfLongestSubstring(String s) {

        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int begin = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(s.charAt(i))) {
                begin = Math.max(begin,map.get(s.charAt(i)));
            }
            map.put(s.charAt(i), i + 1);
            max = Math.max(max,i - begin + 1);
        }
        return max;
    }

}
