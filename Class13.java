package java13;

public class Class13 {
	public static void main(String args[]) {
		String str;
		str ="520";
		try {
			System.out.println("這是由字串520所引起的例外");
		}
		catch(ArithmeticException e) {
			System.out.println("string="+str);
		}
	
