
//Importing player array
import java.util.Arrays;

//Football player is an athlete and a person too hence extends both
public class FootballPlayer extends Athlete {
	
	// Player may play defense or offense
	// player may play special teams
	private String speciality[];
	public FootballPlayer(String firstName, String middleName, String lastName, int age, String team, String position,
			String[] speciality) {
		super(firstName, middleName, lastName, age, team, position);
		this.speciality = speciality;
	}

	public String[] getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String[] speciality) {
		this.speciality = speciality;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof FootballPlayer))
			return false;
		FootballPlayer other = (FootballPlayer) obj;
		return Arrays.equals(speciality, other.speciality);
	}

	// This will override the abstract method doThis() from Person class
	@Override
	public void doThis() {
		System.out.println("I tackle something");
	}

	// This will override the abstract method PlayerData() from Data interface
	public void Data() {
	//This method constructs a string for the player data
	
	}

	@Override
	public String toString() {
		String Data;
		Data = "Football Player:\n" + super.toString() + "Speciality: " + Arrays.toString(speciality) + "\n";
		return Data;
	}
}