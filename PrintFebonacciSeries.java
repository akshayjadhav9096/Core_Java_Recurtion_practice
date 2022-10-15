package Recursion;

public class PrintFebonacciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int i=1;
		int c=0;
//		for (int i = 1; i <=10; i++)
//		{
//				a=a+b;
//				b=a-b;
//				int c=a+b;
//				
//			
//			System.out.println(c);
//		}
		loopi(a,b,i,c);
	}
	private static void loopi(int a, int b, int i,int c) {
		if(i<=10)
		{
			i++;
			a=a+b;
			b=a-b;
			c=a+b;
			System.out.println(c);
			loopi(a,b,i,c);
		}
		
	}

}
