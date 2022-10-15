package Recursion;

public class sumoffarraysumstatic {

	static int sum=0;
	static int	a[]= {1,2,3,4,5,6,7,8,9};
	public static void main(String[] args) {
		
		myarray(0);
		System.out.println(sum);
		
	}
	private static void myarray( int i) {
		
		
		if(i<a.length)
		{
			sum=sum+a[i];
			i++;
			myarray( i);
		}
		
	}

}
