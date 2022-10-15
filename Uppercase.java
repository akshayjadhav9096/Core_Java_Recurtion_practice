package Recursion;

public class Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Hefshine";
		String s2="";
		s2=uppercase(s1,s2,0);
		System.out.println(s2);

	}

	private static String uppercase(String s1, String  s2, int i) {
		// TODO Auto-generated method stub
		
		
		if(i<s1.length())
		{
			char ch=s1.charAt(i);
			if(ch>='a'&&ch<='z')
				ch=(char)(ch-32);
			s2+=ch;
			
			return uppercase(s1, s2, ++i);
				
		}
		return s2;
	}

}
