import java.util.Objects;

//Rugby player is an athlete and a person too hence extends both
public class RugbyPlayer extends Athlete {
	// Player has cleats brand
	//Leftwing, Fullback or Both
	private String cleatsBrand;

	public RugbyPlayer(String firstName, String middleName, String lastName, int age, String team, String position,
			String cleatsBrand) {
		super(firstName, middleName, lastName, age, team, position);
		this.cleatsBrand = cleatsBrand;
	}

	public String getCleatsBrand() {
		return cleatsBrand;
	}

	public void setCleatsBrand(String cleatsBrand) {
		this.cleatsBrand = cleatsBrand;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof RugbyPlayer))
			return false;
		RugbyPlayer other = (RugbyPlayer) obj;
		return Objects.equals(cleatsBrand, other.cleatsBrand);
	}

	// This will override the abstract method doThis() from Person class
	@Override
	public void doThis() {
		System.out.println("I catch the quanco");
	}

	// This will override the abstract method Data() from PlayerData interface
	@Override
	public void Data() {
		
	}
	// this method constructs a string for the Data for each Player
	public String toString() {
		String Data;
		Data = "RugbyPlayer:\n" + super.toString() + "Cleats Brand: " + cleatsBrand + "\n";
		return Data;
	}
	
	

}
