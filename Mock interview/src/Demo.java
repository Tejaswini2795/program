import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Demo {

	public static List<User> filter(List<User> list, Predicate<User> predicate) {
		List<User> result = new ArrayList<User>();
		for(User user: list)
			if(predicate.test(user))
				result.add(user);
		return result;
		
	}
	public static void main(String[] args) {
		List<User> asList = Arrays.asList(new User("Ram","Admin"), new User("sham","user"),new User("tejaswini", "Admin"), 
				new User("mahesh","Admin"), new User("Shobha","user"));
		
		List<User> admin = filter(asList, (User u) -> u.getRole().equals("Admin")); 
		System.out.println(admin);
	}

	

}
