
public class Event {
	private String eventName;
	private String participantName;
	private double registrationFee;
	
	public Event(String eventName, String participantName) {
		  this.eventName = eventName;
		  this.participantName = participantName;
	}
	
	public void registerEvent() {
		String eventName = this.getEventName();
		
		if(eventName.equals( "Singing".toLowerCase() )) {
			setRegistrationFee(8.00);
		} else if( eventName.equals( "Dancing".toLowerCase() ) ){
			setRegistrationFee(10.00);
		} else if( eventName.equals( "DigitalArt".toLowerCase() ) ){
			setRegistrationFee(12.00);
		} else if( eventName.equals( "Acting".toLowerCase() ) ){
			setRegistrationFee(15.00);
		} else {
			setRegistrationFee(0.00);
		}
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getParticipantName() {
		return participantName;
	}

	public void setParticipantName(String particippantName) {
		this.participantName = particippantName;
	}

	public double getRegistrationFee() {
		return registrationFee;
	}

	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}
	

}
