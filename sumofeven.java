package Recursion;

public class sumofeven {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9};
	
		int sum=0;
		int i=0;
		sum=sumarray(a,i,sum);
		System.out.println(sum);
	}

	private static int sumarray(int[] a, int i, int sum) {
		
		if(i<a.length)
		{
			if(a[i]%2!=0)
				return sum;
			sum=sum+a[i];
			
		 return sumarray(a,++i,sum);
		}
	return sum;
		
	}

}
