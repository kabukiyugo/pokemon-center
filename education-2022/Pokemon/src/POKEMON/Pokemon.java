package POKEMON;

public class Pokemon {
	public Pokemon(String Name,String Type,int pmHP,int pmAttack,int pmSpeed,int pmDefence){
		this.Name = Name;
		this.Type = Type;
		this.pmHP = pmHP;
		this.pmAttack = pmAttack;
		this.pmSpeed = pmSpeed;
		this.pmDefence = pmDefence;
	}

	public String Name;
	
	public String waza1;
	
	public String waza2;
	
	public String waza3;
	
	public String waza4;
	
	public String Type;
	
	public int pmHP;
	
	public int pmAttack;
	
	public int pmSpeed;
	
	public int pmDefence;
	
	public void setpmHP(int pmHP) {
		this.pmHP -= pmHP;
	}
	public int getpmHP() {
		return pmHP;
	}
	public int getpmAttack() {
		return pmAttack;
	}
	
	public int getpmSpeed() {
		return pmSpeed;
	}
	public int getpmDefence() {
		return pmDefence;
		}
	public String getType() {
		return Type;
	}
	}