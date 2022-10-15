package Recursion;

public class SpleetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Aka aka aka ala";
		char ch=' ';
		int cnt=0;
		for (int i = 0; i < s1.length(); i++) 
		{
			if(s1.charAt(i)==ch)
				cnt++;
			
		}
		String sa[]= new String[cnt+1];
		String s2="";
		int index=0;
		for (int i = 0; i < s1.length(); i++)
		{
			
			if(s1.charAt(i)!=ch)
				s2=s2+s1.charAt(i);
			else
				sa[index++]=s2;
			s2="";
		
		if(i==s1.length()-1)
		{
			sa[index++]=s2;
		}

	}
		for (int i = 0; i < sa.length; i++)
		{
			System.out.println(sa[i]);
			
		}
	}
}
