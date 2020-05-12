package practice.java;

public class Palindrome {

	public static void main(String[] args) {
		String text = "testleaf";
		String rev = "";
		for (int i = text.length()-1; i >=0; i--) {
			rev = rev + text.charAt(i);
			
		}
		if(text.equalsIgnoreCase(rev)) {
			System.out.println("Yes,palindrome");
			
		}
		else
		{
			System.out.println("No,Not a palindrome");
		}

	}

}
