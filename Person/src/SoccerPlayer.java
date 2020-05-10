// Soccer player is an athlete and a person too hence extends both
public class SoccerPlayer extends Athlete {
	// goalKeeper, defender, midFielder, or forward
	private String fieldPosition;

	public SoccerPlayer(String firstName, String middleName, String lastName, int age, String team, String position,
			String fieldPosition) {
		super(firstName, middleName, lastName, age, team, position);
		this.fieldPosition = fieldPosition;
	}

	// do this method to display message
	public String getFieldPosition() {
		return fieldPosition;
	}

	public void setFieldPosition(String fieldPosition) {
		this.fieldPosition = fieldPosition;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof SoccerPlayer))
			return false;
		SoccerPlayer other = (SoccerPlayer) obj;
		if (fieldPosition == null) {
			if (other.fieldPosition != null)
				return false;
		} else if (!fieldPosition.equals(other.fieldPosition))
			return false;
		return true;
	}

	// This will override the abstract method doThis() from Person class
	public void doThis() {
		System.out.println("I kick the ball");
	}

	// This will override the abstract method Data() from PlayerData interface
	public void Data() {

		
	}
	// This method constructs a string for the player data
	@Override
	public String toString() {
		return "Soccer Player:\n" + super.toString() + "Field Position: " + fieldPosition + "\n";
	}
}