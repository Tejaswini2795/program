
public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeter g = new Greeter();
		Greeting hw = new HelloWorldGreetings();
		Greeting myLambdaExpression = () -> System.out.print("Hello world");
		//g.greet(hw);
		
		myLambdaExpression.perform();
		//MyAdd addFunction = (int a, int b)-> a+b;
	
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("Hello World!");
				
				g.greet(innerClassGreeting);
				g.greet(myLambdaExpression);
				
			}
		}
	}

}



//interface MyAdd{
//	int add(int x, int y);
//}

