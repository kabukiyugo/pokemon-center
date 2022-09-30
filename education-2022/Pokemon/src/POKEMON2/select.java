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
		System.out.println("ポケモンを選ぶ");
		System.out.println("1:ナエトル,2:ヒコザル,3:ポッチャマ");
		Scanner sc = new Scanner(System.in);
		int buf = sc.nextInt();
		int r = (int)(Math.random()*3)+1;
		Pokemon My = null;
		if (buf == 1) {

			My = new Pokemon("ナエトル","草",230,8,5,15);
			System.out.println("自分は"+ My.Name+"をくり出した");
		}else if (buf == 2) {
			My = new Pokemon("ヒコザル","火",170,12,15,5);
			System.out.println("自分は"+My.Name+"をくり出した");
		}else if (buf == 3){
			My = new Pokemon("ポッチャマ","水",200,10,10,10);
			System.out.println("自分は"+My.Name+"をくり出した");
		}
		System.out.println();
		Pokemon ene = null;
		if (r == 1) {
			ene = new Pokemon("ナエトル","草",230,8,5,15);
			System.out.println("敵は"+ ene.Name+"をくり出した");
		}else if (r == 2) {
			ene = new Pokemon("ヒコザル","火",170,12,15,5);
			System.out.println("敵は"+ene.Name+"をくり出した");
		}else if (r == 3){
			ene = new Pokemon("ポッチャマ","水",200,10,10,10);
			System.out.println("敵は"+ene.Name+"をくり出した");
		}
	}
}
