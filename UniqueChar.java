package Recursion;

public class UniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Akkkkkskbghlaufdbjdvklbiushay";
		String s2="";
		s2=loopi(s1,s2,0);
		System.out.println(s2);
		

	}

	private static String loopi(String s1, String s2, int i) {
		if(i<s1.length())
		{
			if(isuniqyemethod(s1,i,0))
				s2=s2+s1.charAt(i);
			return loopi(s1, s2, ++i);
		}
		return s2;
	}

	private static boolean isuniqyemethod(String s1, int i, int j) {
	
		if(j<i)
		{
			if(s1.charAt(j)==s1.charAt(i))
				return false;
			return isuniqyemethod(s1, i, ++j);
		}
		return true;
	}

}

