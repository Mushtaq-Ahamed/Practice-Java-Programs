package practice.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
	public static void main(String[] args) {
		String str = "mushtaqahmed.n@gmail.com";
		String pattern = "[a-zA-Z0-9._]+@[a-z0-9]+.[a-z.]{2,}";
		Pattern compile = Pattern.compile(pattern);
		Matcher matcher = compile.matcher(str);
		System.out.println(matcher.matches());
	}

}
