package javajichu_9;

import java.util.Calendar;
import java.util.Date;

public class Demo4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c=Calendar.getInstance();
		Date now=c.getTime();
		System.out.println("当前时间："+now);
		
		int year=c.get(Calendar.YEAR);
		System.out.println("年份为："+year);
		
		c.add(Calendar.MONTH, 13);
		Date d1=c.getTime();
		System.out.println("增加13个月后的日期："+d1);
		
		c.set(Calendar.DATE, 2);
		Date d2=c.getTime();
		System.out.println("设置日期为2号："+d2);
	}

}
