package javajichu_9;

import java.util.Calendar;
import java.util.Date;

public class Demo4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c=Calendar.getInstance();
		Date now=c.getTime();
		System.out.println("��ǰʱ�䣺"+now);
		
		int year=c.get(Calendar.YEAR);
		System.out.println("���Ϊ��"+year);
		
		c.add(Calendar.MONTH, 13);
		Date d1=c.getTime();
		System.out.println("����13���º�����ڣ�"+d1);
		
		c.set(Calendar.DATE, 2);
		Date d2=c.getTime();
		System.out.println("��������Ϊ2�ţ�"+d2);
	}

}
