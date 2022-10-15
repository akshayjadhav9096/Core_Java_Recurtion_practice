package Recursion;

public class PringTable {

	public static void main(String[] args) {
		
//		int num=5;
//		int b=0;
//		for (int i = 1; i <=10; i++)
//		{
//			b=num*i;
//			System.out.println(b);
//		}
	int i=0;
	int a=0;
	int num1=4;
	loopi(i,a,num1);
	}

	private static void loopi(int i, int a, int num1) {
		if(i<10)
		{
			i++;
			a=num1*i;
			System.out.println(a);
			loopi(i,a,num1);
		}
		
	}

}
