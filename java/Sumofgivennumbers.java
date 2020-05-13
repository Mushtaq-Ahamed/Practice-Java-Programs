package practice.java;

public class Sumofgivennumbers {

	public static void main(String[] args) {

		String input = "asdf1qwer9as8d7";
		
		String number = input.replaceAll("\\D", "");
		
		System.out.println(number);
		
		int num = Integer.parseInt(number);
		
		int sum = 0;

		while (num % 10 != 0) {
			
			sum = sum + num % 10;
			
			num = num / 10;
		}

		System.out.println("sum of the given numbers is : "+ sum);
	}

}
