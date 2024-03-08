package app_java_7;

public class PrintLowerUpperDigit {
public static void main(String[] args) {
	String str="Pankaj Sir Academy@#1997";
	for (int i = 0; i <str.length(); i++) {
		if (str.charAt(i)>='a' && str.charAt(i)<='z') {
			System.out.println("lower "+str.charAt(i));
		}
	}
	for (int i = 0; i <str.length(); i++) {
		if (str.charAt(i)>='A' && str.charAt(i)<='Z') {
			System.out.println("upper "+str.charAt(i));
		}
	}
	for (int i = 0; i <str.length(); i++) {
		if (str.charAt(i)>='0' && str.charAt(i)<='9') {
			System.out.println("digits "+str.charAt(i));
		}
	}
}
}
