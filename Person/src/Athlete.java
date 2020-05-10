// Athlete is a person hence extends Person class
public class Athlete extends Person {
	// Athlete has team and position
	private String team;
	private String position;
	
	//constructor
	public Athlete(String firstName, String middleName, String lastName, int age, String team, String position) {
		super(firstName, middleName, lastName, age);
		this.team = team;
		this.position = position;
	}

	// This will override the abstract method doThis() from Person class
	@Override
	public void doThis() {
		System.out.println("I enjoying Playing");

	}
	//accessors & mutators
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;

	}

	// Declaring the equal method for Athlete
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Athlete))
			return false;
		Athlete other = (Athlete) obj;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (team == null) {
			if (other.team != null)
				return false;
		} else if (!team.equals(other.team))
			return false;
		return true;
	}

	// This will override the abstract method Data() from PlayerData interface
	@Override
	public void Data() {

	}

	//this method constructs a string for the data for each athlete
	@Override
	public String toString() {
		return super.toString() +  "Team: " +  team + "\nPosition: " + position + "\n";
	}

}
