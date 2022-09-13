
public class RunnableExample {
public static void main(String[] args) {
	
	//Annonymus class
	Thread t = new  Thread(new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("printed inside Runnable");
		}
		
	});
	t.run();
	
	//lambada expression
	Thread lambdaThread = new Thread(()-> System.out.println("printed inside lambda Runnable"));
	lambdaThread.run();
}
}
