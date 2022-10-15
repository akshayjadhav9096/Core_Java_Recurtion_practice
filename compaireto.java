package Recursion;

public class compaireto {

	public static void main(String[] args) {
		
		String s1="Hefshine";
		String s2="gefshine";
		System.out.println(s1.compareTo(s2));
		System.out.println(mycompaireto(s1,s2));

	}

	private static int mycompaireto(String s1, String s2) {
		
		int diff=loopcompaire(s1,s2,0);
		if(diff==0)
			return s1.length()-s2.length();
		else
		return diff;
	}

	private static int loopcompaire(String s1, String s2, int i) {
		
		if(i<s1.length()&&i<s2.length()) {
		if(s1.charAt(i)!=s2.charAt(i))
			
			return s1.charAt(i)-s2.charAt(i);
		
		return loopcompaire(s1, s2, ++i);
	}
		
	return 0;
	}

}
