
public class Pokemon extends Trainer{
	private String name; 
	private int level; 
	private String type; 
	
	public Pokemon(int badges, String name1, int level1, String type1){
		//numBadges = badges; 
		super(badges); 
		name = name1;
		level = level1; 
		type = type1; 
	}
	
	public String getName(){
		return (this.name); 
	}
	
	public void setName(String name){
		this.name = name; 
	}
	
	public String getType(){
		return(this.type); 
	}
	
	public void setType(String type){
		this.type = type; 
	}
	
	public int getLevel(){
		return (this.level); 
	}
	
	public void setLevel (int lvl){
		this.level = lvl; 
	}
}
