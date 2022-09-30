package POKEMON;

import java.io.*;
import java.util.*;
public class main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//Pokemon n = new Pokemon("ナエトル","草",230,8,5,15);//いらん
		//Pokemon h = new Pokemon("ヒコザル","火",170,12,15,5);//いらん
		//Pokemon p = new Pokemon("ポッチャマ","水",200,10,10,10);//いらん
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
		Waza waza1 = new Waza("たいあたり","ノーマル",5,1);
		Waza waza2 = new Waza("おうふくビンタ","ノーマル",3,(int)(Math.random()*4)+2);//ホイールの中でrandomに２～５の整数を代入
		Waza waza3 = new Waza("このは","草",5,1);
		Waza waza4 = new Waza("はっぱカッター","草",7,1);
		Waza waza5 = new Waza("ひのこ","火",5,1);
		Waza waza6 = new Waza("かえんぐるま","火",7,1);
		Waza waza7 = new Waza("あわ","水",5,1);
		Waza waza8 = new Waza("みずでっぽう","水",7,1);

		if(My.getpmSpeed() >= ene.getpmSpeed()) {
			while (true) {
				System.out.println(My.Name+"のHP:"+My.getpmHP()+","+"相手の"+ene.Name+"のHP:"+ene.getpmHP());
				System.out.println();
				System.out.println("自分の技を選ぶ");
				if(buf == 1) {
					System.out.println("1:たいあたり,2:おうふくビンタ,3:このは,4:はっぱカッター");
					Scanner sc2 = new Scanner(System.in);
					int buf2 = sc2.nextInt();
					if(buf2 == 1) {
						System.out.println("ナエトルのたいあたり");
						dmg o = new dmg(8,5,ene.getType(),My.getType(),"ノーマル");//引数入力
						int d = o.dmgCalc() - ene.getpmDefence();
						ene.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
					}else if(buf2 == 2) {
						System.out.println("ナエトルのおうふくビンタ");
						dmg o = new dmg(8,3,ene.getType(),My.getType(),"ノーマル");//引数入力
						waza2.setAN();
						for(int i = 0;i < waza2.getAN();i++) {
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
				}else if(buf == 2) {
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
				}else if(buf == 3) {
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
					break;
				}
				//ここから敵バージョンの攻撃を作る-------------------------------
				System.out.println();
				System.out.println(My.Name+"のHP:"+My.getpmHP()+","+"相手の"+ene.Name+"のHP:"+ene.getpmHP());
				System.out.println();
				System.out.println("相手の攻撃");
				if(r == 1) {
					System.out.println("1:たいあたり,2:おうふくビンタ,3:このは,4:はっぱカッター");
					int r2 = (int)(Math.random()*4)+1;
					if(r2 == 1) {
						System.out.println("相手のナエトルのたいあたり");
						dmg o = new dmg(8,5,My.getType(),ene.getType(),"ノーマル");//引数入力
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
					}else if(r2 == 2) {
						System.out.println("相手のナエトルのおうふくビンタ");
						dmg o = new dmg(8,3,My.getType(),ene.getType(),"ノーマル");//引数入力
						waza2.setAN();
						for(int i = 0;i < waza2.getAN();i++) {
							int d = o.dmgCalc() - My.getpmDefence();
							My.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
						}
						System.out.println(waza2.getAN()+"回当たった！");
					}else if(r2 == 3) {
						System.out.println("相手のナエトルのこのは");
						dmg o = new dmg(8,5,My.getType(),ene.getType(),"草");//引数入力
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
					}else if(r2 == 4) {
						System.out.println("相手のナエトルのはっぱカッター");
						dmg o = new dmg(8,7,My.getType(),ene.getType(),"草");//引数入力
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
					}
				}else if(r == 2) {
					System.out.println("1:たいあたり,2:おうふくビンタ,3:ひのこ,4:かえんぐるま");
					int r2 = (int)(Math.random()*4)+1;
					if(r2 == 1) {
						System.out.println("相手のヒコザルのたいあたり");
						dmg o = new dmg(12,5,My.getType(),ene.getType(),"ノーマル");//引数入力
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
					}else if(r2 == 2) {
						System.out.println("相手のヒコザルのおうふくビンタ");
						dmg o = new dmg(12,3,My.getType(),ene.getType(),"ノーマル");//引数入力
						waza2.setAN();
						for(int i = 0;i < waza2.getAN();i++) {
							int d = o.dmgCalc() - My.getpmDefence();
							My.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
						}
						System.out.println(waza2.getAN()+"回当たった！");
					}else if(r2 == 3) {
						System.out.println("相手のヒコザルのひのこ");
						dmg o = new dmg(12,5,My.getType(),ene.getType(),"火");//引数入力
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
					}else if(r2 == 4) {
						System.out.println("相手のヒコザルのかえんぐるま");
						dmg o = new dmg(12,7,My.getType(),ene.getType(),"火");//引数入力
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
					}
				}else if(r == 3) {
					System.out.println("1:たいあたり,2:おうふくビンタ,3:あわ,4:みずでっぽう");
					int r2 = (int)(Math.random()*4)+1;
					if(r2 == 1) {
						System.out.println("相手のポッチャマのたいあたり");
						dmg o = new dmg(10,5,My.getType(),ene.getType(),"ノーマル");//引数入力
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
					}else if(r2 == 2) {
						System.out.println("相手のポッチャマのおうふくビンタ");
						dmg o = new dmg(10,3,My.getType(),ene.getType(),"ノーマル");//引数入力
						waza2.setAN();
						for(int i = 0;i < waza2.getAN();i++) {
							int d = o.dmgCalc() - My.getpmDefence();
							My.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
						}
						System.out.println(waza2.getAN()+"回当たった！");
					}else if(r2 == 3) {
						System.out.println("相手のポッチャマのあわ");
						dmg o = new dmg(10,5,My.getType(),ene.getType(),"水");//引数入力
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
					}else if(r2 == 4) {
						System.out.println("相手のポッチャマのみずでっぽう");
						dmg o = new dmg(10,7,My.getType(),ene.getType(),"水");//引数入力
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
					}
				}
				if (My.getpmHP() <= 0) {
					System.out.println();
					System.out.println("自分のHPが0になった");
					System.out.println("勝負に負けた、、、");
					break;
				}
			}//ここまでwhile
		}else {
			while(true) {
				//ここから敵バージョンの攻撃を作る-------------------------------
				System.out.println();
				System.out.println(My.Name+"のHP:"+My.getpmHP()+","+"相手の"+ene.Name+"のHP:"+ene.getpmHP());
				System.out.println();
				System.out.println("相手の攻撃");
				if(r == 1) {
					System.out.println("1:たいあたり,2:おうふくビンタ,3:このは,4:はっぱカッター");
					int r2 = (int)(Math.random()*4)+1;
					if(r2 == 1) {
						System.out.println("相手のナエトルのたいあたり");
						dmg o = new dmg(8,5,My.getType(),ene.getType(),"ノーマル");//引数入力
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
					}else if(r2 == 2) {
						System.out.println("相手のナエトルのおうふくビンタ");
						dmg o = new dmg(8,3,My.getType(),ene.getType(),"ノーマル");//引数入力
						waza2.setAN();
						for(int i = 0;i < waza2.getAN();i++) {
							int d = o.dmgCalc() - My.getpmDefence();
							My.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
						}
						System.out.println(waza2.getAN()+"回当たった！");
					}else if(r2 == 3) {
						System.out.println("相手のナエトルのこのは");
						dmg o = new dmg(8,5,My.getType(),ene.getType(),"草");//引数入力
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
					}else if(r2 == 4) {
						System.out.println("相手のナエトルのはっぱカッター");
						dmg o = new dmg(8,7,My.getType(),ene.getType(),"草");//引数入力
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
					}
				}else if(r == 2) {
					System.out.println("1:たいあたり,2:おうふくビンタ,3:ひのこ,4:かえんぐるま");
					int r2 = (int)(Math.random()*4)+1;
					if(r2 == 1) {
						System.out.println("相手のヒコザルのたいあたり");
						dmg o = new dmg(12,5,My.getType(),ene.getType(),"ノーマル");//引数入力
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
					}else if(r2 == 2) {
						System.out.println("相手のヒコザルのおうふくビンタ");
						dmg o = new dmg(12,3,My.getType(),ene.getType(),"ノーマル");//引数入力
						waza2.setAN();
						for(int i = 0;i < waza2.getAN();i++) {
							int d = o.dmgCalc() - My.getpmDefence();
							My.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
						}
						System.out.println(waza2.getAN()+"回当たった！");
					}else if(r2 == 3) {
						System.out.println("相手のヒコザルのひのこ");
						dmg o = new dmg(12,5,My.getType(),ene.getType(),"火");//引数入力
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
					}else if(r2 == 4) {
						System.out.println("相手のヒコザルのかえんぐるま");
						dmg o = new dmg(12,7,My.getType(),ene.getType(),"火");//引数入力
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
					}
				}else if(r == 3) {
					System.out.println("1:たいあたり,2:おうふくビンタ,3:あわ,4:みずでっぽう");
					int r2 = (int)(Math.random()*4)+1;
					if(r2 == 1) {
						System.out.println("相手のポッチャマのたいあたり");
						dmg o = new dmg(10,5,My.getType(),ene.getType(),"ノーマル");//引数入力
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
					}else if(r2 == 2) {
						System.out.println("相手のポッチャマのおうふくビンタ");
						dmg o = new dmg(10,3,My.getType(),ene.getType(),"ノーマル");//引数入力
						waza2.setAN();
						for(int i = 0;i < waza2.getAN();i++) {
							int d = o.dmgCalc() - My.getpmDefence();
							My.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
						}
						System.out.println(waza2.getAN()+"回当たった！");
					}else if(r2 == 3) {
						System.out.println("相手のポッチャマのあわ");
						dmg o = new dmg(10,5,My.getType(),ene.getType(),"水");//引数入力
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
					}else if(r2 == 4) {
						System.out.println("相手のポッチャマのみずでっぽう");
						dmg o = new dmg(10,7,My.getType(),ene.getType(),"水");//引数入力
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
					}
				}
				if (My.getpmHP() <= 0) {
					System.out.println();
					System.out.println("自分のHPが0になった");
					System.out.println("勝負に負けた、、、");
					break;
				}
				//----------------------------------------------------------------------------------------
				System.out.println();
				System.out.println(My.Name+"のHP:"+My.getpmHP()+","+"相手の"+ene.Name+"のHP:"+ene.getpmHP());
				System.out.println();
				System.out.println("自分の技を選ぶ");
				if(buf == 1) {
					System.out.println("1:たいあたり,2:おうふくビンタ,3:このは,4:はっぱカッター");
					Scanner sc2 = new Scanner(System.in);
					int buf2 = sc2.nextInt();
					if(buf2 == 1) {
						System.out.println("ナエトルのたいあたり");
						dmg o = new dmg(8,5,ene.getType(),My.getType(),"ノーマル");//引数入力
						int d = o.dmgCalc() - ene.getpmDefence();
						ene.setpmHP(d);//与えるダメージ分を（）にいれる、計算式
					}else if(buf2 == 2) {
						System.out.println("ナエトルのおうふくビンタ");
						dmg o = new dmg(8,3,ene.getType(),My.getType(),"ノーマル");//引数入力
						waza2.setAN();
						for(int i = 0;i < waza2.getAN();i++) {
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
				}else if(buf == 2) {
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
				}else if(buf == 3) {
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
					break;
				}
			}
		}
	}
}

