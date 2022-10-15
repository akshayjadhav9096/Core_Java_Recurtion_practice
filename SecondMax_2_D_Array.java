package Recursion;

public class SecondMax_2_D_Array {

	public static void main(String[] args) {
		
		
		int a[][]= {
				{1,2,3},
				{5,6,7,},
				{7,8,9}};
		
		int max=0;
		int i=0;
		max= loopi(i,a,max);
		System.out.println(max);
		
	}
	private static int loopi(int i, int[][] a, int max) {
		
		if(i<a.length)
		{
			int j=0;
		max= loopj(i,j,max,a);
		 i++;
		 max=loopi(i, a, max);
		}
		return max;
	}

	private static int loopj(int i, int j, int max,int[][] a) {
		if(j<a.length)
		{
			if(a[i][j]>max) {
				max=a[i][j];
		}
		j++;
		 max=loopj(i, j, max, a);
		}
		 return max;
		
	}
	

}
