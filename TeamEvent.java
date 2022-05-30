
public class TeamEvent extends Event {
	private int noOfParticipants, teamNo;
	
	public TeamEvent(String eventName, String participantName, int noOfParticipants, int teamNo) {
		super(eventName, participantName);
		this.noOfParticipants = noOfParticipants;
		this.teamNo = teamNo;
	}
	
	@Override
	public void registerEvent() {
		String eventName = this.getEventName();
		
		if(eventName.equals( "Singing" )) {
			setRegistrationFee(4.00);
		} else if( eventName.equals( "Dancing" ) ){
			setRegistrationFee(6.00);
		} else if( eventName.equals( "DigitalArt" ) ){
			setRegistrationFee(8.00);
		} else if( eventName.equals( "Acting") ){
			setRegistrationFee(10.00);
		} else {
			setRegistrationFee(0.00);
		}
	}

	public int getNoOfParticipants() {
		return noOfParticipants;
	}

	public void setNoOfParticipants(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}

	public int getTeamNo() {
		return teamNo;
	}

	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}

}
