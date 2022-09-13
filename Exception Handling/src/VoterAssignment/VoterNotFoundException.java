package VoterAssignment;

public class VoterNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	
	public VoterNotFoundException(String message) {
		super(message);
	}

}
