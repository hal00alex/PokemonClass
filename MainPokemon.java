
public class Main {

	public static void main(String[] args) {
		//Creates trainer and Pokemon team 
		
		//Ash 
		Trainer Ash = new Trainer(8); 
		//Ash.setBadges(8);
		System.out.println("Ash has " + Ash.getBadges() + " badges");
		
		//Pikachu 
		//Pokemon Pikachu = new Pokemon("Pikachu", 99, "Electric"); 
		
		//Butterfree 
		//Pokemon Butterfree = new Pokemon("Butterfree", 40, "Bug"); 
	
		//Team array 
		Pokemon[] Team = new Pokemon[4]; 
		
		Team[0] = new Pokemon(Ash.getBadges(), "Pikachu", 99, "Electric");
		Team[1] = new Pokemon(Ash.getBadges(), "Bulbasuar", 60, "Grass");
		Team[2] = new Pokemon(Ash.getBadges(), "Charizard", 75, "Fire"); 
		Team[3] = new Pokemon(Ash.getBadges(), "Squrtile", 50, "Water"); 
		System.out.println("Ash trains with " + Team[0].getName() + ", " + Team[1].getName() + ", " + Team[2].getName() +", and " + Team[3].getName());
		System.out.println(Team[0].getName() + " has " + Team[0].getBadges() + " badges because Ash has " + Ash.getBadges() + " badges");
		
	}

}
