package javajichu_9;

public class Demo1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		sb.append("1,").append("2.").insert(0, "0,");
		sb.reverse();
		System.out.println(sb);
	}

}
