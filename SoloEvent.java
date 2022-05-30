
public class SoloEvent extends Event{
	private int participantNo;
	
	public SoloEvent(String eventName, String participantName, int participantNo) {
		super(eventName, participantName);
		this.participantNo = participantNo;
	}
	
	@Override
	public void registerEvent() {
		String eventName = this.getEventName();
		
		if(eventName.equals( "Singing" )) {
			setRegistrationFee(8.00);
		} else if( eventName.equals( "Dancing" ) ){
			setRegistrationFee(10.00);
		} else if( eventName.equals( "DigitalArt" ) ){
			setRegistrationFee(12.00);
		} else if( eventName.equals( "Acting") ){
			setRegistrationFee(15.00);
		} else {
			setRegistrationFee(0.00);
		}
	}

	public int getParticipantNo() {
		return participantNo;
	}
	
	
	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}
	
	
	

}
