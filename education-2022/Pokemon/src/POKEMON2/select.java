package POKEMON2;

import java.util.Scanner;

import POKEMON.Pokemon;

public class select {
	
	int buf;
	
	public int getbuf() {
		return buf;
	}
	
	int hp;
	public int 

	public void select(){
		System.out.println("�|�P������I��");
		System.out.println("1:�i�G�g��,2:�q�R�U��,3:�|�b�`���}");
		Scanner sc = new Scanner(System.in);
		int buf = sc.nextInt();
		int r = (int)(Math.random()*3)+1;
		Pokemon My = null;
		if (buf == 1) {

			My = new Pokemon("�i�G�g��","��",230,8,5,15);
			System.out.println("������"+ My.Name+"������o����");
		}else if (buf == 2) {
			My = new Pokemon("�q�R�U��","��",170,12,15,5);
			System.out.println("������"+My.Name+"������o����");
		}else if (buf == 3){
			My = new Pokemon("�|�b�`���}","��",200,10,10,10);
			System.out.println("������"+My.Name+"������o����");
		}
		System.out.println();
		Pokemon ene = null;
		if (r == 1) {
			ene = new Pokemon("�i�G�g��","��",230,8,5,15);
			System.out.println("�G��"+ ene.Name+"������o����");
		}else if (r == 2) {
			ene = new Pokemon("�q�R�U��","��",170,12,15,5);
			System.out.println("�G��"+ene.Name+"������o����");
		}else if (r == 3){
			ene = new Pokemon("�|�b�`���}","��",200,10,10,10);
			System.out.println("�G��"+ene.Name+"������o����");
		}
	}
}