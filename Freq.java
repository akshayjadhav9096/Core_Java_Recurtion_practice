package Recursion;

public class Freq {

	public static void main(String[] args) {
		
		String s1="Aakaka";
		
	for (int i = 0; i < s1.length(); i++)
	{
		int count=0;
		for (int j = 0; j < i; j++)
		{
			if(s1.charAt(i)==s1.charAt(j))
				count++;
		}
		if(count==0)
		{
			int freq=0;
			for (int j = 0; j < s1.length(); j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
					freq++;
			}
			System.out.println(s1.charAt(i)+" "+freq);	
	}
	}}}
