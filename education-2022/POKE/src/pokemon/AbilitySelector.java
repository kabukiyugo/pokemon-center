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
					System.out.println("わざをえらんでください。");
					i = _sc.nextInt();
					if(i == 4) {
						System.out.println("こうかんします");
					} else {
					System.out.println("あなたがえらんだわざは" + abilities[i].getName());
				}
				}
				else {
					i = (int)(Math.random()*4);
					System.out.println("相手が選んだわざは"+ abilities[i].getName());
				}
				return abilities[i];
			} catch(Exception e) {
				System.out.println("0~3の数字を入力してください");
			}
		}
	}
}


