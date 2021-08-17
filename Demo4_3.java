package javajichu_9;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒 a");
		String nowString =sdf.format(now);
		System.out.println(nowString);
	}

}
