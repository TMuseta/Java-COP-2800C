import java.util.Objects;

//player is an athlete and a person too hence extends both
public class HandballPlayer extends Athlete {
	// player has handball gloves
	// players play centerback only
	private String handballGloves;

	public HandballPlayer(String firstName, String middleName, String lastName, int age, String team, String position,
			String handballGloves) {
		super(firstName, middleName, lastName, age, team, position);
		this.handballGloves = handballGloves;
	}

	public String getHandballGloves() {
		return handballGloves;
	}

	public void setHandballGloves(String handballGloves) {
		this.handballGloves = handballGloves;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof HandballPlayer))
			return false;
		HandballPlayer other = (HandballPlayer) obj;
		if (this.getAge() != other.getAge())
			return false;
		return Objects.equals(handballGloves, other.handballGloves);
	}

	// This will override the abstract method doThis() from Person class
	public void doThis() {
		System.out.println("I throw the ball");

	}

	// This will override the abstract method PlayerData() from Data interface
	@Override
	public void Data() {

	}

	public String toString() {
		String Data;
		Data = "HandballPlayer:\n" + super.toString() + "Handball Gloves: " + handballGloves + "\n";
		return Data;
	}

}
