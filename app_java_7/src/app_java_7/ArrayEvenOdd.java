package app_java_7;

public class ArrayEvenOdd {
public static void main(String[] args) {
	int[] x= {4,5,1,7,2,8,3,9,6,10};
	for (int i = 0; i < x.length; i++) {
		if (x[i]%2==0) {
			System.out.println("even "+  x[i]);
		}
	}
	for (int i = 0; i < x.length; i++) {
		if (x[i]%2!=0) {
			System.out.println("odd "+  x[i]);
		}
	}
}
}
