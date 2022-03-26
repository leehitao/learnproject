package com.lht.learn.test;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author: lee
 * @Date: 2021/5/21 15:03
 * @Version 1.0
 */
public class TestClient {
	public static void main(String[] args) {
		sss();
	}

	private static String getUseLessMid(String target, String dataSource) {
		String[] databaseArr = dataSource.split(",");
		String[] sArr = target.split(",");
		String result = "";
		for (String s1 : sArr) {
			boolean flag = false;
			for (String s2 : databaseArr) {
				if (s1.equals(s2)) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				result += "'" + s1 + "'" + ",";
			}

		}
		return result;
	}

	private static void sss(){
		        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		       Calendar ca = Calendar.getInstance();
		       ca.add(Calendar.DATE, 3);// num为增加的天数，可以改变的
		Date d = ca.getTime();
		       String enddate = format.format(d);
		        System.out.println("增加天数以后的日期：" + enddate);

	}

	private static void ss222s(){
		while(!getRedis()){
			if(getDBLock()){
				getDBData();
				updateRedis();
				break;
			}
			sleep();
		}

	}
}
