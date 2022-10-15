package Recursion;

public class Sumofarray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7};
		int sum=0;

		System.out.println(sum=sum=myarray(a,0,0));
	}

	private static int myarray(int[] a, int sum, int i) {

		if(i<a.length)
		{
			sum=sum+a[i];
			i++;
		 return	myarray(a,sum,i);
		}
		return sum;
		
		
	}

}
