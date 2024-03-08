package app_java_7;

public class StringToDataType {
public static void main(String[] args) {
	String s="102";
	int i = Integer.parseInt(s);
	System.out.println(i);
	
	//number format exception
	String c ="revanu";
	int k = Integer.parseInt(c);
	System.out.println(k);
}
}
