package a;

public class StringHandlingDemo {
	public static void main(String[] args)
	{
		String s1 = "Dr. AIT";
		System.out.println("the length of S1 id" +s1.length());
		System.out.println("the length of T is" +s1.indexOf('T'));
		
		String s2="monday";
		String s3=s2.substring(3,6);
		String s8=s2.substring(3);
		System.out.println(s3);
		System.out.println(s8);
		
		String s4 ="Hi";
		String s5 = s4.trim();
		System.out.println(s5);
		
		String sentence =" hi welcome ";
		char ch[] = sentence.toCharArray();
		
		for(int i=0; i<sentence.length(); i++)
		{
			System.out.println(ch[i]);
		}
		System.out.println(sentence.length());
		
		String s6="java";
		System.out.println(s6);
		String s7=s6.toUpperCase();
		System.out.println(s7);
	}
	

}
