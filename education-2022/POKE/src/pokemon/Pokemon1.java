package Pokemon;

public class Pokemon1 {
	Pokemon1(int hp, int atk, int def, int speed, String type, abirity[] ability,String name) {
		super();
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.speed = speed;
		this.type = type;
		this ability = ability;
		this.name = name;
	}
	
	int hp = 0;
	public void setHp(int hp){
		this.hp = hp;
	}
	public int getHp() {
		return this.hp;
	}
	
	int atk = 0;
	public void setAtk(int atk){
		this.atk = atk;
	}
	public int getAtk() {
		return this.atk;
	}

	int def = 0;
	public void setDef(int def){
		this.def = def;
	}
	public int getDef() {
		return this.def;
	}

	int speed = 0;
	public void setSpeed(int speed){
		this.speed = speed;
	}
	public int getSpeed() {
		return this.speed;
	}

	String type = "";
	
	public void setType(String type){
		this.type = type;
	}
	public String getType() {
		return this.type;
	}
	
	public void Ability[] setAbility(Ability ability) {
		this.ability = ability;
	}
	public Ability[] getAbility() {
		return this.ability;
	}
	
	
	
	String name = "";
	
	public void setNeae(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public boolean isDead() {
		if (getHp() <= 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public int takeDamage(int damage) {
		return setHp = damage - getDef; 
	}
	
}
