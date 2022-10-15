package Recursion;

public class AdditionOfMatrixWithRecurtion {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},
		{1,2,3},
		{5,6,7}};
		
		int sum=0;
		int i=0;
		int j=0;
	
		sum=sumloopi(a,i,j,sum);
		System.out.println(sum);
	}

	private static int sumloopi(int[][] a, int i, int j, int sum) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			loopj( i,j,sum,a);
			i++;
			sumloopi(a, i, j, sum);
		}
		return sum;
		
	}

	private static int loopj(int i, int j, int sum, int[][] a) {
		
		if(j<a.length)
		{
			sum=sum+a[i][j];
			j++;
			loopj(i, j, sum, a);
		}
		return sum;
	}

}
