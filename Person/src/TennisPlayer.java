import java.util.Objects;

//Tennis player is an athlete and a person too hence extends both
public class TennisPlayer extends Athlete {
	// Tennis player has a RacketBrand
	// Player i has a position rightcorner or leftcorner or both
	private String racketBrand;

	public TennisPlayer(String firstName, String middleName, String lastName, int age, String team, String position,
			String racket) {
		super(firstName, middleName, lastName, age, team, position);
		this.racketBrand = racket;
	}

	public String getRacket() {
		return racketBrand;
	}

	public void setRacket(String racketBrand) {
		this.racketBrand = racketBrand;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof TennisPlayer))
			return false;
		TennisPlayer other = (TennisPlayer) obj;
		if (this.getAge() != other.getAge())
			return false;
		return Objects.equals(racketBrand, other.racketBrand);
	}

	// This will override the abstract method doThis() from Person class
	public void doThis() {
		System.out.println("I hit the net");

	}

	// This will override the abstract method Data() from PlayerData interface
	public void Data() {

	}

	@Override
	public String toString() {
		String Data;
		Data = "Tennis Player:\n" + super.toString()+ "Racket Brand: " + racketBrand + "\n";
		return Data;
	}
}