package pokemon;

import java.util.Scanner;

public class PokemonSelector {
	PokemonSelector(Scanner sc){
		this._sc = sc;
	}
	

	public Pokemon selectPokemon(boolean isPlayer) {
		
		int i;
		if (isPlayer) {
			
			
			
		}
		else {
			i = (int)(Math.random()*3);
		}
		if (i == 0) {
			
			;
		} else if (i == 1) {
			
		} else {
			Abilitiy[] abilities = new Abilitiy[4];
			abilities [0] = new Abilitiy("たいあたり", 5, "ノーマル", true);
			abilities [1] = new Abilitiy("おうふくビンタ", 3, "ノーマル", false);
			abilities [2] = new Abilitiy("あわ", 5, "みず", true);
			abilities [3] = new Abilitiy("みすでっぽう", 7, "みず", true);
			return new Pokemon (200,10,10,10,"みず",abilities,"ポッチャマ");
		}

	}

	Pokemon[] Pokemon1 = new Pokemon[3];

	System.out.println("ポケモンをえらんでください");
	System.out.println("0：ヒコザル　1：ナエトル　2：ポッチャマ");
	System.out.println();
	Scanner _sc;
	i = _sc.nextInt();
	
	Abilitiy[] abilities1 = new Abilitiy[4];
	abilities1 [0] = new Abilitiy("たいあたり", 5, "ノーマル", true);
	abilities1 [1] = new Abilitiy("おうふくビンタ", 3, "ノーマル", false);
	abilities1 [2] = new Abilitiy("ひのこ", 5, "ほのお", true);
	abilities1 [3] = new Abilitiy("かえんぐるま", 7, "ほのお", true);
	Pokemon1 [0] = new Pokemon(170,12,5,15,"ほのお",abilities1,"ヒコザル");

	Abilitiy[] abilities2 = new Abilitiy[4];
	abilities2 [0] = new Abilitiy("たいあたり", 5, "ノーマル", true);
	abilities2 [1] = new Abilitiy("おうふくビンタ", 3, "ノーマル", false);
	abilities2 [2] = new Abilitiy("このは", 5, "くさ", true);
	abilities2 [3] = new Abilitiy("はっぱカッター", 7, "くさ", true);
	Pokemon1 [1] = new Pokemon(230,8,15,5,"くさ",abilities2,"ナエトル");

	Abilitiy[] abilities3 = new Abilitiy[4];
	abilities3 [0] = new Abilitiy("たいあたり", 5, "ノーマル", true);
	abilities3 [1] = new Abilitiy("おうふくビンタ", 3, "ノーマル", false);
	abilities3 [2] = new Abilitiy("あわ", 5, "みず", true);
	abilities3 [3] = new Abilitiy("みすでっぽう", 7, "みず", true);
	Pokemon1 [2]  = new Pokemon (200,10,10,10,"みず",abilities3,"ポッチャマ");

	Pokemon[] Pokemon2 = new Pokemon[3];
	Pokemon2 [0] = new Pokemon(170,12,5,15,"ほのお",abilities1,"ヒコザル");
	Pokemon2 [1] = new Pokemon(230,8,15,5,"くさ",abilities2,"ナエトル");
	Pokemon2 [2]  = new Pokemon (200,10,10,10,"みず",abilities3,"ポッチャマ");
}	
}
