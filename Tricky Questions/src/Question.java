
class Task {
	String name;
	Task(String name){
		this.name = name;
	}

}

class Question{
	public static void main(String[] args) {
		Task q1 = new Task("ashay");
		Task q2 = new Task("ashay");
		
		if(q2 == q1)
			System.out.println("Equal");
		else
			System.out.println("Not equal");
		
		if(q1.equals(q2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
}
