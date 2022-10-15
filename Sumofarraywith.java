package Recursion;

public class Sumofarraywith {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		int i=0;
		arraySum(a,i,sum);
		System.out.println(sum);
	}

	private static int  arraySum(int[] a,int i, int sum)
	{
		if(i<a.length)
		{
			sum=sum+a[i];
			
			return arraySum(a,++i,sum);
		}
		return sum;
		
	}

}
