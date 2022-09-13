package VoterAssignment;

public class MainClass {
	public static void main(String[] args) {
		VoterDAO voterDAO = new VoterDAO();
		try {
			voterDAO.getVoterDetails(1);
			System.out.println("try block after exception");
		} finally {
			System.out.println("finally executing");
		}
	}
}
