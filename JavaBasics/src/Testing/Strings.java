package Testing;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String str= "Then he said, \"Hello, World!\"";
		String str1 = " to \"Automation\"";
		String str3 = "This ,is, Automation, Testing"; 
		 String str4 = "The quick brown fox jumps over the lazy dog.'";
	str4 = str4.concat("Is it true");
		System.out.println("Length of the string is :" + str3.length());
		System.out.println("Change to lowercase  :" + str3.toLowerCase());
		System.out.println("Change to uppercase  :" + str3.toUpperCase());
		System.out.println(str3.indexOf("is"));
		System.out.println(str3.replace('i','o'));
		System.out.println(str4.endsWith("dog.'"));
		//String words = str4.split())
		//console.log(words[3]);
		
		
		//System.out.println(str);
		//System.out.println(str1);
		
		/*int Amt = 1000;
		double rate = 0.05; 
		int duration=3;
	    double Total = Amt*(1+rate*duration);
		System.out.println(Total);

		String str1= "He\"llo Wor\"ld";
		String str2 = "Say Hello";
		System.out.println(str1 +"\t"+ str2);
		
		String threeLines = "This is a string\nthat spans across\nthree lines.";
				System.out.println(threeLines);
				
	String str3 ="AutomationTesting";
	System.out.println(str3.toLowerCase());
	System.out.println(str3.toUpperCase());*/
	

	}

}
