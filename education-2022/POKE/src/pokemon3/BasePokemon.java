package pokemon3;


public abstract class  BasePokemon implements pokeinterface{
	
	
	
	 public BasePokemon(int hp, int atk, int def, int speed, String type,String name,Ability[] abilities) {
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.speed = speed;
		this.type = type;
		this.abilities = abilities;
		this.name = name;
	}
	
	private int hp = 0;
	public void setHp(int hp){
		this.hp -= hp;
	}
	public int getHp() {
		return this.hp;
	}
	
	private int atk = 0;
	public void setAtk(int atk){
		this.atk = atk;
	}
	public int getAtk() {
		return this.atk;
	}

	private int def = 0;
	public void setDef(int def){
		this.def = def;
	}
	public int getDef() {
		return this.def;
	}

	private int speed = 0;
	public void setSpeed(int speed){
		this.speed = speed;
	}
	public int getSpeed() {
		return this.speed;
	}

	private String type = "";
	
	public void setType(String type){
		this.type = type;
	}
	public String getType() {
		return this.type;
	}
	
	private Ability[] abilities;
	public void setAbilities(Ability[] abilities) {
		this.abilities = abilities;
	}
	public Ability[] getAbilities() {
		return this.abilities;
	}
	
	
	
	private String name = "";
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	//public boolean isDead() {
		//if (getHp() <= 0) {
			//return false;
		//} else {
			//return true;
		//}
	//}
	int a;
	
	public void takeDamage(int damage) {
		 a = damage - getDef(); 
		setHp(a);
		System.out.println(a+"dmg");
	}
}
