package app_java_7;

public class OpeningClosingBrackets {
public static void main(String[] args) {
	String str="((()))";
	int count1=0;
	int count2=0;
	for (int i = 0; i < str.length(); i++) {
		if (str.charAt(i)=='(') {
			count1++;
		}
		if (str.charAt(i)==')') {
			count2++;
		}
	}
	if (count1==count2) {
		System.out.println("equal");
	}else {
		System.out.println("not equal");
	}
	
}
}
