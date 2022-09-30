package POKEMON;

public class Waza {
	Waza(String Name,String Type,int Power,int AN){
		this.Name = Name;
		this.Type =	Type;
		this.Power = Power;
		this.AN = AN;
	}

	public String Name;
	
	public String Type;
	
	public int Power;
	
	public int AN;
	
	public void setAN() {
		this.AN =(int)(Math.random()*4)+2;
	}
	
	public String getName() {
		return Name;
	}
	
	public String getType() {
		return Type;
	}
	
	public int getPower() {
		return Power;
	}
	public int getAN() {
		return AN;
	}
	}
	
	
