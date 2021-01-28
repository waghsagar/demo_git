package test01;

public class largestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		int b=210;
		int c=30;
		
		// 1. Using logic
		
		if((a>b) && (a>c)) {
			System.out.println(a+" is largest");
		}else if((b>c) && (b>a)) {
			System.out.println(b+" is largest");
		} else {
			System.out.println(c+" is largest");
		}

	}

}
