import java.util.Objects;
//player is an athlete and a person too hence extends both
public class BadmintonPlayer extends Athlete {
	//Player has a shuttle cock
	//players either left side or right side.
	
	private String shuttleCock;

	public BadmintonPlayer(String firstName, String middleName, String lastName, int age, String team, String position,
			String shuttleCock) {
		super(firstName, middleName, lastName, age, team, position);
		this.shuttleCock = shuttleCock;
	}

	public String getShuttleCock() {
		return shuttleCock;
	}

	public void setShuttleCock(String shuttleCock) {
		this.shuttleCock = shuttleCock;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof BadmintonPlayer))
			return false;
		BadmintonPlayer other = (BadmintonPlayer) obj;
		return Objects.equals(shuttleCock, other.shuttleCock);
	}

	// This will override the abstract method doThis() from Person class
	public void doThis() {
		System.out.println("I hit the shuttlecock");

	}

	// This will override the abstract method PlayerData() from Data interface
	@Override
	public void Data() {
		
	}
	public String toString() {
		String Data;
		Data =  "Badminton Player:\n" + super.toString() + "Shuttle Cock: " + shuttleCock + "\n";
		return Data;
	}

}

