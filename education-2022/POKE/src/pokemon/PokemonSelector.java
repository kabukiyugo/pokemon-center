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
			abilities [0] = new Abilitiy("����������", 5, "�m�[�}��", true);
			abilities [1] = new Abilitiy("�����ӂ��r���^", 3, "�m�[�}��", false);
			abilities [2] = new Abilitiy("����", 5, "�݂�", true);
			abilities [3] = new Abilitiy("�݂��ł��ۂ�", 7, "�݂�", true);
			return new Pokemon (200,10,10,10,"�݂�",abilities,"�|�b�`���}");
		}

	}

	Pokemon[] Pokemon1 = new Pokemon[3];

	System.out.println("�|�P�����������ł�������");
	System.out.println("0�F�q�R�U���@1�F�i�G�g���@2�F�|�b�`���}");
	System.out.println();
	Scanner _sc;
	i = _sc.nextInt();
	
	Abilitiy[] abilities1 = new Abilitiy[4];
	abilities1 [0] = new Abilitiy("����������", 5, "�m�[�}��", true);
	abilities1 [1] = new Abilitiy("�����ӂ��r���^", 3, "�m�[�}��", false);
	abilities1 [2] = new Abilitiy("�Ђ̂�", 5, "�ق̂�", true);
	abilities1 [3] = new Abilitiy("�����񂮂��", 7, "�ق̂�", true);
	Pokemon1 [0] = new Pokemon(170,12,5,15,"�ق̂�",abilities1,"�q�R�U��");

	Abilitiy[] abilities2 = new Abilitiy[4];
	abilities2 [0] = new Abilitiy("����������", 5, "�m�[�}��", true);
	abilities2 [1] = new Abilitiy("�����ӂ��r���^", 3, "�m�[�}��", false);
	abilities2 [2] = new Abilitiy("���̂�", 5, "����", true);
	abilities2 [3] = new Abilitiy("�͂��σJ�b�^�[", 7, "����", true);
	Pokemon1 [1] = new Pokemon(230,8,15,5,"����",abilities2,"�i�G�g��");

	Abilitiy[] abilities3 = new Abilitiy[4];
	abilities3 [0] = new Abilitiy("����������", 5, "�m�[�}��", true);
	abilities3 [1] = new Abilitiy("�����ӂ��r���^", 3, "�m�[�}��", false);
	abilities3 [2] = new Abilitiy("����", 5, "�݂�", true);
	abilities3 [3] = new Abilitiy("�݂��ł��ۂ�", 7, "�݂�", true);
	Pokemon1 [2]  = new Pokemon (200,10,10,10,"�݂�",abilities3,"�|�b�`���}");

	Pokemon[] Pokemon2 = new Pokemon[3];
	Pokemon2 [0] = new Pokemon(170,12,5,15,"�ق̂�",abilities1,"�q�R�U��");
	Pokemon2 [1] = new Pokemon(230,8,15,5,"����",abilities2,"�i�G�g��");
	Pokemon2 [2]  = new Pokemon (200,10,10,10,"�݂�",abilities3,"�|�b�`���}");
}	
}