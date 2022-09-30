package pokemon3;

public interface pokeinterface {

     void takeDamage(int damege);
	
	 void attack();
	
	 void setHp(int hp);
	
	 int getHp();
	
	 void setAtk(int atk);
	
	 int getAtk();
	
	 void setDef(int def);
	
	 int getDef();
	
	 void setSpeed(int speed);
	
	 int getSpeed();
	
	 void setType(String type);
	
	 String getType();
	 
	 String getName();
	 
	 void setAbilities(Ability[] abilities);
	 
	 Ability[] getAbilities();
}
