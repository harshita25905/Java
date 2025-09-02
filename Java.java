package exception;

public class room {
	public static void main(String[] args) {
		int a=10;
		int b=10;
		int c=a/b;
		System.out.println(c);
		int arr[]=new int[5];
		arr[6]=10;
		System.out.println(arr[6]);
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	finally {
		System.out.println("The end");
	}
}
