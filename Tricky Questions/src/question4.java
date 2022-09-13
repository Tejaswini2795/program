

public class question4 extends Base{
	public static void Task() {
		System.out.println("Derived");
	}
	public static void main(String[] args) {
		Base obj = new question4();
		obj.Task();
	}
	
}
 class Base{
	public static void Task() {
		System.out.println("Base");
	}
}