import java.util.Objects;

//player is an athlete and a person too hence extends both
public class TugOfWarPlayer extends Athlete {
	// player has sturdy footwear
	// player may play back or front not both
	private String sturdyFootWear;

	public TugOfWarPlayer(String firstName, String middleName, String lastName, int age, String team, String position,
			String sturdyFootWear) {
		super(firstName, middleName, lastName, age, team, position);
		this.sturdyFootWear = sturdyFootWear;
	}

	public String getSturdyFootWear() {
		return sturdyFootWear;
	}

	public void setSturdyFootWear(String sturdyFootWear) {
		this.sturdyFootWear = sturdyFootWear;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof TugOfWarPlayer))
			return false;
		TugOfWarPlayer other = (TugOfWarPlayer) obj;
		if (this.getAge() != other.getAge())
			return false;
		return Objects.equals(sturdyFootWear, other.sturdyFootWear);
	}

	// This will override the abstract method doThis() from Person class
	public void doThis() {
		System.out.println("I pull the rope");

	}

	// This will override the abstract method PlayerData() from Data interface
	@Override
	public void Data() {

	}

	public String toString() {
		String Data;
		Data = "Tug Of War Player:\n" + super.toString() + "Sturdy Footwear: " + sturdyFootWear + "\n";
		return Data;
	}

}
