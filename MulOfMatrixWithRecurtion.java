package Recursion;

public class MulOfMatrixWithRecurtion {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},
				    {4,5,6}};
		int b[][]= {{2,3,4},
					{4,6,7}};
		int c[][]= new int[a.length][a[0].length];
		int i=0;
		loopi(a,b,c,i);
	}
	private static void loopi(int[][] a, int[][] b, int[][] c,int i) {
		if(i<a.length)
		{
			i++;
			int j=0;
		loopj(i,a,b,c,j);	
		}	
	}
	private static void loopj(int i, int[][] a, int[][] b, int[][] c, int j) {
		if(j<a.length)
		{
			j++;
			loopk(i,j,a,b,c);
			loopj(i, a, b, c, j);
		}	
	}
	private static void loopk(int i, int j, int[][] a, int[][] b, int[][] c) {
		if(i<c.length)
		{
			i++;
			c[i][j]= a[i][j]*b[i][j];
			loopk(i, j, a, b, c);	
		}	
	}
}
