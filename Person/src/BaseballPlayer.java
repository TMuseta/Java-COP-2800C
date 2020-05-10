import java.util.Objects;

// Baseball player is an athlete and a person too hence extends both
public class BaseballPlayer extends Athlete {
	// Baseball Player has batting position
	// Baseball players either bat lefthanded, righthanded or both.
	private String battingPosition;

	// Declaring constructors
	public BaseballPlayer(String firstName, String middleName, String lastName, int age, String team, String position,
			String battingPosition) {
		super(firstName, middleName, lastName, age, team, position);
		this.battingPosition = battingPosition;
	}

	public String getBattingPosition() {
		return battingPosition;
	}

	public void setBattingPosition(String battingPosition) {
		this.battingPosition = battingPosition;
	}

	// This will override the abstract method doThis() from Person
	@Override
	public void doThis() {
		System.out.println("I hit something");
	}

	// Overriding equals() to compare two objects
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof BaseballPlayer))
			return false;
		BaseballPlayer other = (BaseballPlayer) obj;
		return Objects.equals(battingPosition, other.battingPosition);
	}

	// This will override the abstract method Data() from PlayerData interface
	public void Data() {

	}

	// this method constructs a tostring for the Data for each Baseball Player
	public String toString() {
		String Data;
		Data = "\nBaseball Player:\n" + super.toString() + "Batting Position: " + battingPosition + "\n";
		return Data;
	}

}
