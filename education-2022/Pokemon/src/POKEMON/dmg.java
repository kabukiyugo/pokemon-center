package POKEMON;

public class dmg {
dmg(int power,int wazapower,String enetype,String mytype,String wazatype){//ダメ計は敵も自分も使う
	this.power = power;
	this.wazapower = wazapower;
	this.enetype = enetype;
	this.mytype = mytype;
	this.wazatype = wazatype;
}

public double dmg;

public int power;

public int wazapower;

public String enetype;//敵か自分

public String mytype;//攻撃側が使う　敵or自分

public String wazatype;

public int kyusyo;

public double ransu;

public int getkyusyo() {
	return kyusyo;
}

public int dmgCalc() {
	dmg =power * wazapower;
	if (mytype =="草"&& wazatype == "草") {
		dmg = dmg * 1.5;
	}else if (mytype =="水"&& wazatype == "水") {
		dmg = dmg * 1.5;
	}else if (mytype =="火"&& wazatype == "火") {
		dmg = dmg * 1.5;
	}else {
		dmg = dmg *1.0;
	}
	
	if (enetype == "草"&& wazatype == "水") {//これを使って有利不利の表記をコンソールにやる
		dmg = dmg / 2;
		System.out.println("効果は今一つのようだ、、");
	}else if (enetype == "水"&& wazatype == "火") {//enetype == "水"&& wazatype == "火"だったら、効果はいまひとつだ
		dmg = dmg / 2;
		System.out.println("効果は今一つのようだ、、");
	}else if(enetype == "火"&& wazatype == "草") {
		dmg = dmg / 2;
		System.out.println("効果は今一つのようだ、、");
	}else if(enetype == "草"&& wazatype == "草") {
		dmg = dmg / 2;
		System.out.println("効果は今一つのようだ、、");
	}else if(enetype == "水"&& wazatype == "水") {
		dmg = dmg / 2;
		System.out.println("効果は今一つのようだ、、");
	}else if(enetype == "火"&& wazatype == "火") {
		dmg = dmg / 2;
		System.out.println("効果は今一つのようだ、、");
	}else if (enetype == "草"&& wazatype == "火") {
		dmg = dmg * 2;
		System.out.println("効果は抜群だ！");
	}else if (enetype == "火"&& wazatype == "水") {
		dmg = dmg * 2;
		System.out.println("効果は抜群だ！");
	}else if (enetype == "水"&& wazatype == "草") {
		dmg = dmg * 2;
		System.out.println("効果は抜群だ！");
	}else {
		dmg = dmg * 1;
	}
	kyusyo = (int)(Math.random()*10)+1;
	if (kyusyo == 1) {
		dmg = dmg * 2;
		System.out.println("急所に当たった！");
	}else {
		dmg = dmg * 1;
	}
	ransu =(int)(Math.random()*15)+85;
	ransu = (double)ransu /100;
	dmg = dmg * ransu;
	
	return (int)dmg;
}

}
