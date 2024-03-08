package app_java_7;
//reverse string or number
public class ReverseS {
public static void main(String[] args) {
	String str="Pankaj Sir Academy@#1997";
	String rev ="";
	for (int i = str.length()-1;i>=0; i--) {
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);
	//number to reverse
	int x=123;
	String s = String.valueOf(x);
	System.out.println(s);
	String revs="";
	for (int i = s.length()-1; i >=0; i--) {
		revs=revs+s.charAt(i);
	}
	System.out.println(revs);
	//Array to reverse
	int [] i= {1,4,6,7,8};
	
	for (int j =  i.length-1; j >=0; j--) {
		System.out.print(i[j]);
	}
	
	
}


}
