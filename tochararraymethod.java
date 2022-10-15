package Recursion;

public class tochararraymethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Hefshine";
		
		char ch[]= new char[s1.length()];
		int i=0;
		rec(s1,ch,i);
	//	System.out.println(ch);
		for(char c:ch)
		{
			System.out.println(c);
		}
	}
	private static void rec(String s1, char[] ch, int i) {
		
		if(i<s1.length())
		{
			ch[i]=s1.charAt(i);
			i++;
			rec(s1,ch,i);
		}
	}

}
