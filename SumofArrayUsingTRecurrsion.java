package Recursion;

public class SumofArrayUsingTRecurrsion {

	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		
		int i=0;
		int sum=0;
		array(a,i,sum);
	}

	private static void array(int[] a, int i, int sum) {
		
		if(i<a.length)
		{
			sum=sum+a[i];
			
		}
		
		
		
	}

}
