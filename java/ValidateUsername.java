package practice.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {
	public static void main(String[] args) {
		String str = "Testleaf";
		String pattern = "[a-zA-Z0-9._$@]{8,}";
		Pattern compile = Pattern.compile(pattern);
		Matcher matcher = compile.matcher(str);
		System.out.println(matcher.matches());
	}

}
