
public class ChildClass extends ParentClass{
	
	public ChildClass() {
		this(10);
		System.out.println("this is child class non para const");
	}
	ChildClass(int a){
		super(10);
		System.out.println("this is child para const");
	}
	
	//can not override final method
	public final void hi() {
		System.out.println("hiiii");
	}
	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
	}

}
