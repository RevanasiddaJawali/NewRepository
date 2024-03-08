package app_java_7;

public class RemoveWhitespaceOrAnything {
public static void main(String[] args) {
	String str="Pankaj Sir Academy@#1997";
	String s1 = str.replaceAll("\\s", "");
	System.out.println(s1);
	 String s2 = str.replaceAll("a", "");
	 System.out.println(s2);
	 String s3 = str.replaceAll("1997", "2022");
	 System.out.println(s3);
}
}
