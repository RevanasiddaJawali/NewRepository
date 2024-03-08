package app_java_7;

public class SplitWordsCountWords {
public static void main(String[] args) {
	String str="Pankaj Sir Academy@#1997";
	String[] s = str.trim().split(" ");
	System.out.println(s.length);
	for (String x : s) {
		//System.out.println(x);
		StringBuffer s1=new StringBuffer(x);
		StringBuffer rev = s1.reverse();
		System.out.print(rev+" ");
	}
}
}
