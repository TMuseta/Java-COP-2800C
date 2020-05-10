import java.util.Objects;

// Hockey player is an athlete and a person too hence extends both
public class HockeyPlayer extends Athlete {
	// Hockey player has stickBand
	private String stickBrand;

	public HockeyPlayer(String firstName, String middleName, String lastName, int age, String team, String position,
			String stickBrand) {
		super(firstName, middleName, lastName, age, team, position);
		this.stickBrand = stickBrand;
	}

	public String getStickBrand() {
		return stickBrand;
	}

	public void setStickBrand(String stickBrand) {
		this.stickBrand = stickBrand;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof HockeyPlayer))
			return false;
		HockeyPlayer other = (HockeyPlayer) obj;
		return Objects.equals(stickBrand, other.stickBrand);
	}

	// This will override the abstract method doThis() from Person class
	public void doThis() {
		System.out.println("I sit in a penalty box");

	}

	// This will override the abstract method Data() from PlayerData interface
	public void Data() {

		
	}
	// this method constructs a string for the Data for each Hockey Player
	public String toString() {
		String Data;
		Data = "Hockey Player:\n" + super.toString() + "Stick Brand: " + stickBrand + "\n";
		return Data;
	}
}