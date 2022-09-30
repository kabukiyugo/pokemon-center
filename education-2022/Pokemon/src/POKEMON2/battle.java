package POKEMON2;

import java.util.Scanner;

import POKEMON.dmg;

public class battle {
	
	public String Myname;
	
	public String Enename;
	
	public String Myhp;
	
	public String Enehp;
	
	public String Mytype;
	
	public String Enetype;
	
	public int ouhukuAN;
	
	public void setouhukuAN() {
		this.ouhukuAN =(int)(Math.random()*4)+2;
	}
	public int getouhukuAN() {
		return ouhukuAN;
	}
	public int Enedefence;
	
	public int Mydefence;
	
	public void call() {
		
	}
	

public int myAttack() {
	 select sl = new select();
	System.out.println(Myname+"のHP:"+Myhp+","+"相手の"+Enename+"のHP:"+Enehp);
	System.out.println();
	System.out.println("自分の技を選ぶ");
	if(sl.getbuf() == 1) {
		System.out.println("1:たいあたり,2:おうふくビンタ,3:このは,4:はっぱカッター");
		Scanner sc2 = new Scanner(System.in);
		int buf2 = sc2.nextInt();
		if(buf2 == 1) {
			System.out.println("ナエトルのたいあたり");
			dmg2 o = new dmg2(8,5,Enedefence,Enetype,Mytype,"ノーマル");//引数入力
			int d = o.dmgCalc(); 
			ene.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
		}else if(buf2 == 2) {
			System.out.println("ナエトルのおうふくビンタ");
			dmg o = new dmg(8,3,ene.getType(),My.getType(),"ノーマル");//引数入力
			setouhukuAN();
			for(int i = 0;i < getouhukuAN();i++) {
				int d = o.dmgCalc() - ene.getpmDefence();
				ene.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
			}
			System.out.println(waza2.getAN()+"回当たった！");
		}else if(buf2 == 3) {
			System.out.println("ナエトルのこのは");
			dmg o = new dmg(8,5,ene.getType(),My.getType(),"草");//引数入力
			int d = o.dmgCalc() - ene.getpmDefence();
			ene.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
		}else if(buf2 == 4) {
			System.out.println("ナエトルのはっぱカッター");
			dmg o = new dmg(8,7,ene.getType(),My.getType(),"草");//引数入力
			int d = o.dmgCalc() - ene.getpmDefence();
			ene.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
		}
	}else if(sl.getbuf() == 2) {
		System.out.println("1:たいあたり,2:おうふくビンタ,3:ひのこ,4:かえんぐるま");
		Scanner sc2 = new Scanner(System.in);
		int buf2 = sc2.nextInt();
		if(buf2 == 1) {
			System.out.println("ヒコザルのたいあたり");
			dmg o = new dmg(12,5,ene.getType(),My.getType(),"ノーマル");//引数入力
			int d = o.dmgCalc() - ene.getpmDefence();
			ene.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
		}else if(buf2 == 2) {
			System.out.println("ヒコザルのおうふくビンタ");
			dmg o = new dmg(12,3,ene.getType(),My.getType(),"ノーマル");//引数入力
			waza2.setAN();
			for(int i = 0;i < waza2.getAN();i++) {
				int d = o.dmgCalc() - ene.getpmDefence();
				ene.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
			}
			System.out.println(waza2.getAN()+"回当たった！");
		}else if(buf2 == 3) {
			System.out.println("ヒコザルのひのこ");
			dmg o = new dmg(12,5,ene.getType(),My.getType(),"火");//引数入力
			int d = o.dmgCalc() - ene.getpmDefence();
			ene.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
		}else if(buf2 == 4) {
			System.out.println("ヒコザルのかえんぐるま");
			dmg o = new dmg(12,7,ene.getType(),My.getType(),"火");//引数入力
			int d = o.dmgCalc() - ene.getpmDefence();
			ene.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
		}
	}else if(sl.getbuf() == 3) {
		System.out.println("1:たいあたり,2:おうふくビンタ,3:あわ,4:みずでっぽう");
		Scanner sc2 = new Scanner(System.in);
		int buf2 = sc2.nextInt();
		if(buf2 == 1) {
			System.out.println("ポッチャマのたいあたり");
			dmg o = new dmg(10,5,ene.getType(),My.getType(),"ノーマル");//引数入力
			int d = o.dmgCalc() - ene.getpmDefence();
			ene.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
		}else if(buf2 == 2) {
			System.out.println("ポッチャマのおうふくビンタ");
			dmg o = new dmg(10,3,ene.getType(),My.getType(),"ノーマル");//引数入力
			waza2.setAN();
			for(int i = 0;i < waza2.getAN();i++) {
				int d = o.dmgCalc() - ene.getpmDefence();
				ene.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
			}
			System.out.println(waza2.getAN()+"回当たった！");
		}else if(buf2 == 3) {
			System.out.println("ポッチャマのあわ");
			dmg o = new dmg(10,5,ene.getType(),My.getType(),"草");//引数入力
			int d = o.dmgCalc() - ene.getpmDefence();
			ene.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
		}else if(buf2 == 4) {
			System.out.println("ポッチャマのみずでっぽう");
			dmg o = new dmg(10,7,ene.getType(),My.getType(),"草");//引数入力
			int d = o.dmgCalc() - ene.getpmDefence();
			ene.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
		}
	}
	if (ene.getpmHP() <= 0) {
		System.out.println();
		System.out.println("相手のHPは0だ");
		System.out.println("勝負に勝った！");

}
}
}
