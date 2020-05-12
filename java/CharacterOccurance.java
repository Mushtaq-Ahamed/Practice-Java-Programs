package practice.java;

public class CharacterOccurance {

	public static void main(String[] args) {
		String test = "You have no choice other than following me!";
		char ch = 'o';
		int totalCount = 0;
		char[] value=test.toCharArray();
				for (int i = 0; i < value.length; i++) {
					if(value[i]==ch) {
						totalCount++;
					}
				}
				
		System.out.println("Total count of character("+ch+"): " + totalCount);
		

	}

}
