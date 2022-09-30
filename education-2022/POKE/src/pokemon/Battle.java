package pokemon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Battle {

	public Pokemon players;
	public Pokemon enemys;
	public AbilitySelector _abilitySelector;

	Battle(AbilitySelector _abilitySelector){
		this._abilitySelector = _abilitySelector;


		ArrayList<Pokemon> Pokemon1 = new ArrayList<Pokemon>();
		Abilitiy[] abilities1 = new Abilitiy[5];
		abilities1 [0] = new Abilitiy("たいあたり", 5, "ノーマル", true);
		abilities1 [1] = new Abilitiy("おうふくビンタ", 3, "ノーマル", false);
		abilities1 [2] = new Abilitiy("ひのこ", 5, "ほのお", true);
		abilities1 [3] = new Abilitiy("かえんぐるま", 7, "ほのお", true);
		abilities1 [4] = new Abilitiy ("こうかん",0,null,true);
		Pokemon1.add(new Pokemon(170,12,5,15,"ほのお",abilities1,"ヒコザル"));

		Abilitiy[] abilities2 = new Abilitiy[5];
		abilities2 [0] = new Abilitiy("たいあたり", 5, "ノーマル", true);
		abilities2 [1] = new Abilitiy("おうふくビンタ", 3, "ノーマル", false);
		abilities2 [2] = new Abilitiy("このは", 5, "くさ", true);
		abilities2 [3] = new Abilitiy("はっぱカッター", 7, "くさ", true);
		abilities2 [4] = new Abilitiy ("こうかん",0,null,true);
		Pokemon1.add(new Pokemon(230,8,15,5,"くさ",abilities2,"ナエトル"));

		Abilitiy[] abilities3 = new Abilitiy[5];
		abilities3 [0] = new Abilitiy("たいあたり", 5, "ノーマル", true);
		abilities3 [1] = new Abilitiy("おうふくビンタ", 3, "ノーマル", false);
		abilities3 [2] = new Abilitiy("あわ", 5, "みず", true);
		abilities3 [3] = new Abilitiy("みすでっぽう", 7, "みず", true);
		abilities3 [4] = new Abilitiy ("こうかん",0,null,true);
		Pokemon1.add(new Pokemon (200,10,10,10,"みず",abilities3,"ポッチャマ"));

		Abilitiy[] abilities4 = new Abilitiy[5];
		abilities4 [0] = new Abilitiy("たいあたり", 5, "ノーマル", true);
		abilities4 [1] = new Abilitiy("おうふくビンタ", 3, "ノーマル", false);
		abilities4 [2] = new Abilitiy("いあいぎり", 5, "ノーマル", true);
		abilities4 [3] = new Abilitiy("いわくだき", 7, "かくとう", true);
		abilities4 [4] = new Abilitiy ("こうかん",0,null,true);
		Pokemon1.add(new Pokemon (200,10,7,6,"ノーマル",abilities4,"ビッパ"));

		Abilitiy[] abilities5 = new Abilitiy[5];
		abilities5 [0] = new Abilitiy("たいあたり", 5, "ノーマル", true);
		abilities5 [1] = new Abilitiy("おうふくビンタ", 3, "ノーマル", false);
		abilities5 [2] = new Abilitiy("でんきショック", 5, "でんき", true);
		abilities5 [3] = new Abilitiy("スパーク", 7, "でんき", true);
		abilities5 [4] = new Abilitiy ("こうかん",0,null,true);
		Pokemon1.add(new Pokemon (170,11,6,14,"でんき",abilities5,"コリンク"));

		Abilitiy[] abilities6 = new Abilitiy[5];
		abilities6 [0] = new Abilitiy("たいあたり", 5, "ノーマル", true);
		abilities6 [1] = new Abilitiy("おうふくビンタ", 3, "ノーマル", false);
		abilities6 [2] = new Abilitiy("じしん", 7, "じめん", true);
		abilities6 [3] = new Abilitiy("どろかけ", 5, "じめん", true);
		abilities6 [4] = new Abilitiy ("こうかん",0,null,true);
		Pokemon1.add(new Pokemon (180,10,10,16,"じめん",abilities6,"ディグダ"));

		ArrayList<Pokemon> Pokemon2 = new ArrayList<Pokemon>();
		Pokemon2.add(new Pokemon(170,12,5,15,"ほのお",abilities1,"ヒコザル"));
		Pokemon2.add(new Pokemon(230,8,15,5,"くさ",abilities2,"ナエトル"));
		Pokemon2.add(new Pokemon (200,10,10,10,"みず",abilities3,"ポッチャマ"));
		Pokemon2.add(new Pokemon (200,7,7,6,"ノーマル",abilities4,"ビッパ"));
		Pokemon2.add(new Pokemon (170,11,6,14,"でんき",abilities5,"コリンク"));
		Pokemon2.add(new Pokemon (180,10,10,13,"じめん",abilities6,"ディグダ"));


		System.out.println("ポケモンをえらんでください");
		for (int m = 0;m < Pokemon1.size(); m++) {
			System.out.print(m + ":" + Pokemon1.get(m).getName());
		}
		System.out.println();

		System.out.print("あいてのポケモン:");
		for (int n = 0;n < Pokemon2.size(); n++) {
			System.out.print(n +  ":" + Pokemon2.get(n).getName());	
		}
		System.out.println();

		Scanner _sc = new Scanner(System.in);
		int a = _sc.nextInt();
		int b = _sc.nextInt();
		int c = _sc.nextInt();

		ArrayList<Pokemon> mine = new ArrayList<Pokemon>();
		mine.add(Pokemon1.get(a));
		mine.add(Pokemon1.get(b));
		mine.add(Pokemon1.get(c));

		System.out.print("あなたがえらんだポケモンは");
		mine.forEach(pokemon -> System.out.print(pokemon.getName() + " "));

		players = mine.get(0);

		List<Pokemon> shuffled = new ArrayList<Pokemon>(Pokemon2); // この後ランダムに並べ替えられる、list のコピー
		Collections.shuffle(shuffled); // shuffled の要素をランダムに並び替える。
		List<Pokemon> ene = shuffled.subList(0,3);

		System.out.println();
		System.out.println("あいてのえらんだポケモンは" + ene.get(0).getName());
		enemys = ene.get(0);

		setPlayersitaiHP(1);
		setEnemysitaiHP(1);

		while(true) {



			if (mine.size() == 0 || ene.size() == 0) {
				break;
			} else if (getPlayersitaiHP() <= 0 ){

				_sentaku(mine, _sc);
				setPlayersitaiHP(1);

			} else if (getEnemysitaiHP() <= 0) {
				int r = (int)(Math.random()*ene.size());
				enemys = ene.get(r);
				System.out.println("あいてのえらんだポケモンは" + enemys.getName());
				setEnemysitaiHP(1);

			}

			Pokemon[] ss = new Pokemon[2];

			System.out.println(players.getName() + "のHP" + players.getHp() + "あいての" + enemys.getName() + "のHP" + enemys.getHp());


			Abilitiy my = _abilitySelector.selectAbility(players.getAbilies(), true);
			Abilitiy aite = _abilitySelector.selectAbility(enemys.getAbilies(), false);

			if (players.getSpeed() >= enemys.getSpeed() || my.getName().equals("こうかん")) {
				ss[0] = players;
				ss[1] = enemys;
			} else {
				ss[0] = enemys;
				ss[1] = players;
			}

			Arrays.asList(ss).forEach(i -> {

				if (!i.isDead()){
					return;
				}
				
				Abilitiy waza;
				Pokemon x;
				if (i == players) {
					x = enemys;
					waza = my;
				} else {
					x = players;
					waza =aite;
				}

				if (waza.getName().equals("こうかん")){
					while(true) {
						try {

							_sentaku(mine, _sc);
							if (mine.get(c) == players) {
								throw new Alreadyselectedexception();
							}
							break;
						}
						catch (Alreadyselectedexception e) {
							System.out.println("すでにえらばれています");
							continue;
						}

						catch(Exception e) {
							System.out.println("対応した数字を入力してください");
							continue;
						}
					}
				}else {

					System.out.println(i.getName() +"の"+ waza.getName());

					if (!(waza.getIsMulti())) {
						int random = (int)(Math.random()*4)+2;
						for(int j = 0;j < random;j++) {
							_damege(i, waza, x);
						}
						System.out.println(random+"回当たった！");
					}else {
						_damege(i, waza, x);
					}
				}
				if (!(players.isDead())){
					System.out.println("じぶんの" +players.getName()+"はたおれた");
					setPlayersitaiHP(players.getHp());
					mine.remove(players);
					return;
				} else if (!(enemys.isDead())){
					System.out.println("あいての" + enemys.getName()+"はたおれた");
					setEnemysitaiHP(enemys.getHp());
					ene.remove(enemys);
					return;
				}
			});
		}
		if (mine.size() == 0) {
			System.out.println("しょうぶにまけた、、、");
		}else {
			System.out.println("しょうぶにかった！");
		}
	}


	private void _damege(Pokemon i,Abilitiy waza,Pokemon x) {

		int result = 0;
		result =  (waza.getPower() * i.getAtk());

		//乱数計算
		double q =(((Math.random()*16)+85) / 100);
		result = (int)(result * q);

		//急所計算
		int k = (int)(Math.random()*10);
		if (k == 0) {
			result = result * 2;
			System.out.println("きゅうしょにあたった！");
		}

		//タイプ一致計
		if (i.getType().equals(waza.getType())){
			result = (int)(result * 1.5);

		}

		if (x.getType().equals("じめん") && waza.getType().equals("でんき")) {
			result = 0 + x.getDef();
			System.out.println("こうかがないようだ、、、");
		} else if (TypeCalculator.getNotEffectiveTypes(x.getType())!= null && TypeCalculator.getNotEffectiveTypes(x.getType()).contains(waza.getType()) ) {
			result = result / 2;
			System.out.println("こうかはいまひとつのようだ、、、");
		}else if (TypeCalculator.getEffectiveTypes(x.getType()).contains(waza.getType())) {
			result = result * 2;
			System.out.println("こうかはばつぐんだ！");
		}
		x.takeDamage(result);
	}

	private int playersitaiHP;
	public void setPlayersitaiHP(int playersitaiHP){
		this.playersitaiHP = playersitaiHP;
	}
	public int getPlayersitaiHP() {
		return this.playersitaiHP;
	}

	private int enemysitaiHP;
	public void setEnemysitaiHP(int enemysitaiHP){
		this.enemysitaiHP = enemysitaiHP;
	}
	public int getEnemysitaiHP() {
		return this.enemysitaiHP;
	}

	private void _sentaku(ArrayList<Pokemon> mine, Scanner _sc) {

		System.out.println("ポケモンをえらんでください");
		mine.forEach(pokemon -> System.out.print(pokemon.getName()));

		System.out.println();
		int d = _sc.nextInt();
		players = mine.get(d);
		System.out.println("あなたがえらんだポケモンは"+ players.getName());
	}
}