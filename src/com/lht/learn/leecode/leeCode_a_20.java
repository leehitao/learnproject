package com.lht.learn.leecode;

import java.util.Stack;

/**
 * @Author: lee
 * @Date: 2021/2/9 16:17
 * @Version 1.0
 */
public class leeCode_a_20 {

	/**
	 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
	 * 有效字符串需满足：
	 * 左括号必须用相同类型的右括号闭合。
	 * 左括号必须以正确的顺序闭合。
	 */
	public static void main(String[] args) {

		String str = "({}[]()){}[]";

		String str1 = "({}[]()){[}][]";

		System.out.println(str + ":" + isValid1(str));
		System.out.println(str1 + ":" + isValid1(str1));


	}


	public static boolean isValid(String s) {

		while (s.contains("{}") || s.contains("[]") || s.contains("()")) {
			s = s.replace("{}", "");
			s = s.replace("[]", "");
			s = s.replace("()", "");
		}
		return s.equals("");
	}


	public static boolean isValid1(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(char c: s.toCharArray()){
			if(c=='(')stack.push(')');
			else if(c=='[')stack.push(']');
			else if(c=='{')stack.push('}');
			else if(stack.isEmpty()||c!=stack.pop())return false;
		}
		return stack.isEmpty();
	}
}
