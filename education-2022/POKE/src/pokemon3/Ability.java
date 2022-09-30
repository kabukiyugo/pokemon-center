package pokemon3;

public class Ability {
	public Ability(String name, int power, String type, boolean isMulti) {
		this.name = name;
		this.power = power;
		this.type = type;
		this.isMulti = isMulti;
	}

	private String name = ""; 
	public void setName(String name){
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	private int power = 0; 
	public void setPower(int power){
		this.power = power;
	}
	public int getPower() {
		return this.power;
	}
	
	private String type =""; 
	public void setType(String type){
		this.type = type;
	}
	public String getType() {
		return this.type;
	}
	
	private boolean isMulti = true; 
	public void setIsMuli(boolean isMultid){
		this.isMulti = isMulti;
	}
	public boolean getIsMulti() {
		return this.isMulti;
	}
	
	
}
