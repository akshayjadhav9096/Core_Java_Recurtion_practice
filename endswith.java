package Recursion;

public class endswith {

	public static void main(String[] args) {
		
		String s1="Akshay";
		String s2="Akshay";
		
		if(s2.length()<=s1.length())
		{
			int s1end=s1.length()-1;
			int s2end=s2.length()-1;
			int i=0;
			int cnt=0;	
		
		while(i<s2.length())
		{
			if(s1.charAt(s1end)==s2.charAt(s2end))
				cnt++;
		}
		i++;
		s1end--;
		s2end--;	
		if(cnt==s2.length())
			System.out.println(true);
		else
			System.out.println(false);
	}
}}
