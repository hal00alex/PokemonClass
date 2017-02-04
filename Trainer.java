
public class Trainer {
	//private int numPoke; 
	//trainer keeps badges 
	//pokemon team shares all the badges through extends 
	
	private int numBadges; 
	
	public Trainer(int badges){
		numBadges = badges; 
	}
	
	public int getBadges(){
		return (this.numBadges); 
	}
	
	public void setBadges(int numNew){
		this.numBadges = numNew; 
	}
}
