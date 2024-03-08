package app_java_7;
//Ss //Dd //Ww [a-zA-Z0-9]
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegulaeExpression {
public static void main(String[] args) {
	String str="Pankaj Sir Academy@#1997";
	Pattern p = Pattern.compile("[a-z]");
	Matcher m = p.matcher(str);
	while (m.find()) {
		System.out.print(m.group());
	}
}
}
