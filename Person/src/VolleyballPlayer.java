import java.util.Objects;

// Volleyball player is an athlete and a person too hence extends both
public class VolleyballPlayer extends Athlete {
	// Volleyball player has fingerBands
	// Volleyball player players either Libero or Wing spiker or both
	private String fingerBands;

	public VolleyballPlayer(String firstName, String middleName, String lastName, int age, String team, String position,
			String fingerBands) {
		super(firstName, middleName, lastName, age, team, position);
		this.fingerBands = fingerBands;
	}

	public String getFingerBands() {
		return fingerBands;
	}

	public void setFingerBands(String fingerBands) {
		this.fingerBands = fingerBands;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof VolleyballPlayer))
			return false;
		VolleyballPlayer other = (VolleyballPlayer) obj;
		return Objects.equals(fingerBands, other.fingerBands);
	}

	// This will override the abstract method doThis() from Person class
	public void doThis() {
		System.out.println("I spike the ball");

	}

	// This will override the abstract method PlayerData() from Data interface
	@Override
		public void Data() {
		
	}
	//this method constructs a string for the Data for each Player
	public String toString() {
		String Data;
		Data = "Volleyball Player:\n" + super.toString() + "Finger Bands: " + fingerBands + "\n";
		return Data;
	}
	

}
