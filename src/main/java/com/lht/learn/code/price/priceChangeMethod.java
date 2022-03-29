package com.lht.learn.code.price;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @Author: lee
 * @Date: 2021/1/8 14:38
 * @Version 1.0
 */
public class priceChangeMethod {

	public static void main(String[] args) {

		int money = 15;
		String s = changeF2Y(money);
		System.out.println(s);

	}

	public static String changeF2Y(int price) {
		return BigDecimal.valueOf(Long.valueOf(price)).divide(new BigDecimal(100)).setScale(2).toString();
	}

	public static int changeY2F(double price) {
		DecimalFormat df = new DecimalFormat("#.00");
		price = Double.valueOf(df.format(price));
		int money = (int) (price * 100);
		return money;
	}
}
