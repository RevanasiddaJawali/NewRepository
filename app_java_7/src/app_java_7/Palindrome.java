package app_java_7;

public class Palindrome {
public static void main(String[] args) {
	String str="kanak";
	String rev ="";
	for (int i =str.length()-1; i>=0; i--) {
		rev=rev+str.charAt(i);
	}
	if (rev.equals(str)) {
		System.out.println("given string is palindrome");
	}else {
		System.out.println("not palindrome");
	}
}
}
