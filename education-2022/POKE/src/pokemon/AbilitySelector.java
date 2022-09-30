package pokemon;

import java.util.Scanner;

public class AbilitySelector {
	AbilitySelector(Scanner sc){
		this._sc = sc;
	}
	Scanner _sc;

	public Abilitiy selectAbility(Abilitiy[] abilities, boolean isPlayer)  {

		
		while(true) {
					
			try{
				int i = 0;
				if (isPlayer) {
					System.out.println("‚í‚´‚ğ‚¦‚ç‚ñ‚Å‚­‚¾‚³‚¢B");
					i = _sc.nextInt();
					if(i == 4) {
						System.out.println("‚±‚¤‚©‚ñ‚µ‚Ü‚·");
					} else {
					System.out.println("‚ ‚È‚½‚ª‚¦‚ç‚ñ‚¾‚í‚´‚Í" + abilities[i].getName());
				}
				}
				else {
					i = (int)(Math.random()*4);
					System.out.println("‘Šè‚ª‘I‚ñ‚¾‚í‚´‚Í"+ abilities[i].getName());
				}
				return abilities[i];
			} catch(Exception e) {
				System.out.println("0~3‚Ì”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
			}
		}
	}
}


