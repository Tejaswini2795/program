package VoterAssignment;

public class VoterDAO {
	
	public VoterDetails getVoterDetails(int voterId) {
		VoterDetails vd = new VoterDetails();
		if(voterId == vd.getVoterId()) {
			return vd;
		}
		else {
			throw new VoterNotFoundException("voter not found");
		}
	}

}
