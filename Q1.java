package Recursion;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 		int num=0;
		
		m1(num);

	}

	private static void m1(int num) {
		
		if(num<4)
		{
			System.out.println("hii");
			num++;
			m1(num);
		
	}
	}
}
