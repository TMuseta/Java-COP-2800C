import java.util.Objects;

// Golfer player is an athlete and a person too hence extends both
public class Golfer extends Athlete {
	// Golfer has a sponsor
	private String sponsor;

	public Golfer(String firstName, String middleName, String lastName, int age, String team, String position,
			String sponsor) {
		super(firstName, middleName, lastName, age, team, position);
		this.sponsor = sponsor;
	}

	public String getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;

	}

	// this method constructs equal method for the Data for each athlete

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Golfer))
			return false;
		Golfer other = (Golfer) obj;
		return Objects.equals(sponsor, other.sponsor);
	}

	// This will override the abstract method doThis() from Person class
	public void doThis() {
		System.out.println("I putt in the hole");

	}

	// This will override the abstract method Data() from PlayerData interface
	public void Data() {

	}

	// this method constructs a string for the Data for each Golfer
	public String toString() {
		String Data;
		Data = "Golfer:\n" + super.toString() + "Sponsor: " + sponsor + "\n";
		return Data;
	}

}
