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
		abilities1 [0] = new Abilitiy("����������", 5, "�m�[�}��", true);
		abilities1 [1] = new Abilitiy("�����ӂ��r���^", 3, "�m�[�}��", false);
		abilities1 [2] = new Abilitiy("�Ђ̂�", 5, "�ق̂�", true);
		abilities1 [3] = new Abilitiy("�����񂮂��", 7, "�ق̂�", true);
		abilities1 [4] = new Abilitiy ("��������",0,null,true);
		Pokemon1.add(new Pokemon(170,12,5,15,"�ق̂�",abilities1,"�q�R�U��"));

		Abilitiy[] abilities2 = new Abilitiy[5];
		abilities2 [0] = new Abilitiy("����������", 5, "�m�[�}��", true);
		abilities2 [1] = new Abilitiy("�����ӂ��r���^", 3, "�m�[�}��", false);
		abilities2 [2] = new Abilitiy("���̂�", 5, "����", true);
		abilities2 [3] = new Abilitiy("�͂��σJ�b�^�[", 7, "����", true);
		abilities2 [4] = new Abilitiy ("��������",0,null,true);
		Pokemon1.add(new Pokemon(230,8,15,5,"����",abilities2,"�i�G�g��"));

		Abilitiy[] abilities3 = new Abilitiy[5];
		abilities3 [0] = new Abilitiy("����������", 5, "�m�[�}��", true);
		abilities3 [1] = new Abilitiy("�����ӂ��r���^", 3, "�m�[�}��", false);
		abilities3 [2] = new Abilitiy("����", 5, "�݂�", true);
		abilities3 [3] = new Abilitiy("�݂��ł��ۂ�", 7, "�݂�", true);
		abilities3 [4] = new Abilitiy ("��������",0,null,true);
		Pokemon1.add(new Pokemon (200,10,10,10,"�݂�",abilities3,"�|�b�`���}"));

		Abilitiy[] abilities4 = new Abilitiy[5];
		abilities4 [0] = new Abilitiy("����������", 5, "�m�[�}��", true);
		abilities4 [1] = new Abilitiy("�����ӂ��r���^", 3, "�m�[�}��", false);
		abilities4 [2] = new Abilitiy("����������", 5, "�m�[�}��", true);
		abilities4 [3] = new Abilitiy("���킭����", 7, "�����Ƃ�", true);
		abilities4 [4] = new Abilitiy ("��������",0,null,true);
		Pokemon1.add(new Pokemon (200,10,7,6,"�m�[�}��",abilities4,"�r�b�p"));

		Abilitiy[] abilities5 = new Abilitiy[5];
		abilities5 [0] = new Abilitiy("����������", 5, "�m�[�}��", true);
		abilities5 [1] = new Abilitiy("�����ӂ��r���^", 3, "�m�[�}��", false);
		abilities5 [2] = new Abilitiy("�ł񂫃V���b�N", 5, "�ł�", true);
		abilities5 [3] = new Abilitiy("�X�p�[�N", 7, "�ł�", true);
		abilities5 [4] = new Abilitiy ("��������",0,null,true);
		Pokemon1.add(new Pokemon (170,11,6,14,"�ł�",abilities5,"�R�����N"));

		Abilitiy[] abilities6 = new Abilitiy[5];
		abilities6 [0] = new Abilitiy("����������", 5, "�m�[�}��", true);
		abilities6 [1] = new Abilitiy("�����ӂ��r���^", 3, "�m�[�}��", false);
		abilities6 [2] = new Abilitiy("������", 7, "���߂�", true);
		abilities6 [3] = new Abilitiy("�ǂ납��", 5, "���߂�", true);
		abilities6 [4] = new Abilitiy ("��������",0,null,true);
		Pokemon1.add(new Pokemon (180,10,10,16,"���߂�",abilities6,"�f�B�O�_"));

		ArrayList<Pokemon> Pokemon2 = new ArrayList<Pokemon>();
		Pokemon2.add(new Pokemon(170,12,5,15,"�ق̂�",abilities1,"�q�R�U��"));
		Pokemon2.add(new Pokemon(230,8,15,5,"����",abilities2,"�i�G�g��"));
		Pokemon2.add(new Pokemon (200,10,10,10,"�݂�",abilities3,"�|�b�`���}"));
		Pokemon2.add(new Pokemon (200,7,7,6,"�m�[�}��",abilities4,"�r�b�p"));
		Pokemon2.add(new Pokemon (170,11,6,14,"�ł�",abilities5,"�R�����N"));
		Pokemon2.add(new Pokemon (180,10,10,13,"���߂�",abilities6,"�f�B�O�_"));


		System.out.println("�|�P�����������ł�������");
		for (int m = 0;m < Pokemon1.size(); m++) {
			System.out.print(m + ":" + Pokemon1.get(m).getName());
		}
		System.out.println();

		System.out.print("�����Ẵ|�P����:");
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

		System.out.print("���Ȃ�������񂾃|�P������");
		mine.forEach(pokemon -> System.out.print(pokemon.getName() + " "));

		players = mine.get(0);

		List<Pokemon> shuffled = new ArrayList<Pokemon>(Pokemon2); // ���̌ド���_���ɕ��בւ�����Alist �̃R�s�[
		Collections.shuffle(shuffled); // shuffled �̗v�f�������_���ɕ��ёւ���B
		List<Pokemon> ene = shuffled.subList(0,3);

		System.out.println();
		System.out.println("�����Ă̂���񂾃|�P������" + ene.get(0).getName());
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
				System.out.println("�����Ă̂���񂾃|�P������" + enemys.getName());
				setEnemysitaiHP(1);

			}

			Pokemon[] ss = new Pokemon[2];

			System.out.println(players.getName() + "��HP" + players.getHp() + "�����Ă�" + enemys.getName() + "��HP" + enemys.getHp());


			Abilitiy my = _abilitySelector.selectAbility(players.getAbilies(), true);
			Abilitiy aite = _abilitySelector.selectAbility(enemys.getAbilies(), false);

			if (players.getSpeed() >= enemys.getSpeed() || my.getName().equals("��������")) {
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

				if (waza.getName().equals("��������")){
					while(true) {
						try {

							_sentaku(mine, _sc);
							if (mine.get(c) == players) {
								throw new Alreadyselectedexception();
							}
							break;
						}
						catch (Alreadyselectedexception e) {
							System.out.println("���łɂ���΂�Ă��܂�");
							continue;
						}

						catch(Exception e) {
							System.out.println("�Ή�������������͂��Ă�������");
							continue;
						}
					}
				}else {

					System.out.println(i.getName() +"��"+ waza.getName());

					if (!(waza.getIsMulti())) {
						int random = (int)(Math.random()*4)+2;
						for(int j = 0;j < random;j++) {
							_damege(i, waza, x);
						}
						System.out.println(random+"�񓖂������I");
					}else {
						_damege(i, waza, x);
					}
				}
				if (!(players.isDead())){
					System.out.println("���Ԃ��" +players.getName()+"�͂����ꂽ");
					setPlayersitaiHP(players.getHp());
					mine.remove(players);
					return;
				} else if (!(enemys.isDead())){
					System.out.println("�����Ă�" + enemys.getName()+"�͂����ꂽ");
					setEnemysitaiHP(enemys.getHp());
					ene.remove(enemys);
					return;
				}
			});
		}
		if (mine.size() == 0) {
			System.out.println("���傤�Ԃɂ܂����A�A�A");
		}else {
			System.out.println("���傤�Ԃɂ������I");
		}
	}


	private void _damege(Pokemon i,Abilitiy waza,Pokemon x) {

		int result = 0;
		result =  (waza.getPower() * i.getAtk());

		//�����v�Z
		double q =(((Math.random()*16)+85) / 100);
		result = (int)(result * q);

		//�}���v�Z
		int k = (int)(Math.random()*10);
		if (k == 0) {
			result = result * 2;
			System.out.println("���イ����ɂ��������I");
		}

		//�^�C�v��v�v
		if (i.getType().equals(waza.getType())){
			result = (int)(result * 1.5);

		}

		if (x.getType().equals("���߂�") && waza.getType().equals("�ł�")) {
			result = 0 + x.getDef();
			System.out.println("���������Ȃ��悤���A�A�A");
		} else if (TypeCalculator.getNotEffectiveTypes(x.getType())!= null && TypeCalculator.getNotEffectiveTypes(x.getType()).contains(waza.getType()) ) {
			result = result / 2;
			System.out.println("�������͂��܂ЂƂ̂悤���A�A�A");
		}else if (TypeCalculator.getEffectiveTypes(x.getType()).contains(waza.getType())) {
			result = result * 2;
			System.out.println("�������͂΂��񂾁I");
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

		System.out.println("�|�P�����������ł�������");
		mine.forEach(pokemon -> System.out.print(pokemon.getName()));

		System.out.println();
		int d = _sc.nextInt();
		players = mine.get(d);
		System.out.println("���Ȃ�������񂾃|�P������"+ players.getName());
	}
}