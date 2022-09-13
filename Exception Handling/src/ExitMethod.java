
public class ExitMethod {
	public static void main(String[] args) {
		try {
			System.out.println("Executing try block");
			
			int result = 25/0;
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Executing catch block with exit method");
			System.exit(0);
		}catch (ArithmeticException e) {
			System.out.println("arithmatic exception class");
			// TODO: handle exception
		}
		finally {
			System.out.println("Finally is getting executed");
		}
	}

}
