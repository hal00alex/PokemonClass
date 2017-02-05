
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
		
		
		//comparing 2 pikachus 
		Pokemon pika = new Pokemon(8, "Pikachu", 99, "Electric"); 
		//bad way
		System.out.println(Team[0] == pika); 
		//good way
		System.out.println(Team[0].equals(pika));
		
		
		//type cast a trainer into a pokemon in case you are playing Pokemon Mystery Duegon 
		//But you shouldn't downcast. It's better for changing customers and employee status
		//Pokemon Blue = (Pokemon)Ash; 
		
		//instanceOf example
		if (Ash instanceof Trainer){
			System.out.println("Ash is a trainer");
		}
		else{
			System.out.println("Oh no, Ash got turned into a Pokemon"); 
		}
		
		//interface calling 
		GoTrain newTrainer = new Trainer(6); 
		newTrainer.sayTrain();
		//newTrainer.getBadges(); GoTrain is not a Trainer
		
		//polymorphism: 
		//Trainer is an object 
		//Trainer is GoTrain 
		//Pokemon is a Trainer
		
		//polymorphism + interfaces -> over-riding and class designing
		
		
		//casting references 
		//shouldn't down cast, but here it is: Pokemon(Ash) 
		//this casts the reference of Ash, earlier we tried to turn Ash into a pokemon
		 
		
	}


}
