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
					System.out.println("�킴�������ł��������B");
					i = _sc.nextInt();
					if(i == 4) {
						System.out.println("�������񂵂܂�");
					} else {
					System.out.println("���Ȃ�������񂾂킴��" + abilities[i].getName());
				}
				}
				else {
					i = (int)(Math.random()*4);
					System.out.println("���肪�I�񂾂킴��"+ abilities[i].getName());
				}
				return abilities[i];
			} catch(Exception e) {
				System.out.println("0~3�̐�������͂��Ă�������");
			}
		}
	}
}

