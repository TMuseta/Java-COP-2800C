import java.util.Scanner;


public class TestPlayer {


	public static void main(String[] args) {
		
		
		Person personArray[] = new Person[100];
	
		
		// Creating objects
			
		Person Hank = new BaseballPlayer("Hank", "A.", "Aaron", 29, "Orlando Magic", "Batter1","left-handed");
		
		String s[]= {"Defense", "Pittsburgh Steelers"}; 
		
		Person Terry = new FootballPlayer("Terry","F.", "Bradshaw", 30, " Los Angeles Rams ", "LeftWinger", s);

		Person Mario = new HockeyPlayer("Mario", "R", "Lemieux", 53, "Pittsburgh Penguins", "Goalie", "CCW");

		Person Paula = new Golfer("Paula", "X.", "Creamer", 32, "SkyGolf", "Unknown", "CDW");
			
		Person Brain = new SoccerPlayer("Brain", "T.", "Rowe", 30, " Manchester City F.C ", "Number2", "Defender");
			
		Person Barry = new BaseballPlayer("Barry", "B.", "Bonds", 40, "Pittsburgh Pirates", "Batter2","Both");
		
		String speciality[] = {"Attacker", "Offense","Defense"};
		
		Person Payton = new FootballPlayer("Payton", "A.", "Manning", 27, "Argentina", "CornerBack", speciality);
		
		Person Marcus = new BadmintonPlayer("Marcus", "F.", "Gideon", 27, "Indonesia", "Right", "Carlton");
		
		Person Wayne = new HockeyPlayer("Wayne", "D.", "Gretzky", 34, "New Jersey Devils", "Skater", "KTG");
		
		Person  Nikola = new HandballPlayer("Nikola", "M", "Karabatic", 20, "PSG", "Centre Back", "Deerskin");
		
		Person Rogers = new TennisPlayer("Rogers", "F.", "Federer", 32, "Davis Cup ", "Both", "Babolat");

		Person Phil = new Golfer("Phil", "A.", "Mickleson", 49, "All-American ", "Unknown", "KPMG");
		
		Person Dustin  = new VolleyballPlayer("Dustin", "P.", "Watten", 23, "SCC Berlin ", "Both", "Reebok");
		
		Person Dom = new SoccerPlayer("Dom", "A", "Dwyer", 45, "Arsenel F.C ", "Number1", "GoalKeeper");
		
		Person David = new RugbyPlayer("David", "S", "Pocock", 32, "Brumbies ", "Both", "Nike");
		
		Person Maria = new TennisPlayer("Maria", "Y.", "Sharapova", 32, "Fed Cup ", "RightCorner", "Babolat");
		
		Person Pierre = new RugbyPlayer("Pierre", "A.", "Spies", 35, "SpringBrook ", "LeftWing", "Adidas");
		
		Person Ed = new TugOfWarPlayer("Ed", "S.", "Mill", 27, "Great Britain", "Front", "Reebok");
		
		Person Taylor = new VolleyballPlayer("Taylor", "S.", "Sander", 27, "Associacao Social Esportiva ", "Wing spiker", "NBS");
		
		Person Della = new BadmintonPlayer("Della", "D", "Haris", 34, "Jakarta", "Left", "Yonex");
		
		Person  Mikkel = new HandballPlayer("Mikkel", "M", "Hansen", 20, "PSG", "Centre Back", "Deerskin");
		
		Person Edwin = new TugOfWarPlayer("Edwin", "S.", "Mill", 27, "Great Britain", "Back", "Reebok");
		
		int index = 0;
		
		
		personArray[index++] = Hank;

		personArray[index++] = Terry;

		personArray[index++] = Mario;

		personArray[index++] = Paula;

		personArray[index++] = Brain;

		personArray[index++] = Barry;
		
		personArray[index++] = David;

		personArray[index++] = Maria;
		
		personArray[index++] = Payton;

		personArray[index++] = Wayne;
		
		personArray[index++] = Phil;
		
		personArray[index++] = Dustin;
		
		personArray[index++] = Dom;
		
		personArray[index++] = Marcus;
		
		personArray[index++] = Rogers;
		
		personArray[index++] = Pierre;
		
		personArray[index++] = Taylor;
		
		personArray[index++] = Edwin;
		
		personArray[index++] = Mikkel;
		
		personArray[index++] = Della;
	
		personArray[index++] = Nikola;
		
		personArray[index++] = Ed;
		
		
		int choice = 0;
		
		Scanner scanner = new Scanner(System.in);
		
			do {
				System.out.println("\nMain Menu. Welcome to Athlete Program.");
				System.out.println("************************************\n");
				System.out.println("1. By Sport, list the players that are equal to each other");
				System.out.println("2. Call each sports doThis() method (one at a time) passing each player");
				System.out.println("3. Call the toString methods for each player object");
				System.out.println("0. Exit");
				System.out.print("\nEnter your choice: ");
				
				choice = scanner.nextInt();	
				//scanner.nextLine();
				
				switch(choice) {
					
					case 1:
						
						for(int i = 0; i < index; i++) {
							for(int j = i; j < index; j++) {
								if(i != j) {
									if(personArray[i].equals(personArray[j])) {
										System.out.println(personArray[i].getFirstName() + " and " + personArray[j].getFirstName() + " are equal");
									}
								}
							}
						}
						
						
						break;
					
					case 2:
						
						for(int i = 0; i < index; i++) {
							personArray[i].doThis();
						}
						
						break;
						
					case 3:
						
						for(int i = 0; i < index; i++) {
							System.out.println(personArray[i].toString());
						}
						
						break;
						
					case 0:
						System.out.println("Exiting Menu");
						break;
				
					default:
						break;
				}
				
			}while(choice != 0);
			scanner.close();
		}

}

	
