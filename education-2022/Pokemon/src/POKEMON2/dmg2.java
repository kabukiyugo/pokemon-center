package POKEMON2;

public class dmg2 {
	dmg2(int power,int wazapower,int defence,String enetype,String mytype,String wazatype){//�_���v�͓G���������g��
		this.power = power;
		this.wazapower = wazapower;
		this.defence = defence;//�V�����ǉ�
		this.enetype = enetype;
		this.mytype = mytype;
		this.wazatype = wazatype;
	}

	public double dmg;

	public int power;

	public int wazapower;

	public String enetype;//�G������

	public String mytype;//�U�������g���@�Gor����

	public String wazatype;

	public int kyusyo;

	public double ransu;
	
	public int defence;

	public int getkyusyo() {
		return kyusyo;
	}

	public int dmgCalc() {
		dmg =power * wazapower;
		if (mytype =="��"&& wazatype == "��") {
			dmg = dmg * 1.5;
		}else if (mytype =="��"&& wazatype == "��") {
			dmg = dmg * 1.5;
		}else if (mytype =="��"&& wazatype == "��") {
			dmg = dmg * 1.5;
		}else {
			dmg = dmg *1.0;
		}
		
		if (enetype == "��"&& wazatype == "��") {//������g���ėL���s���̕\�L���R���\�[���ɂ��
			dmg = dmg / 2;
			System.out.println("���ʂ͍���̂悤���A�A");
		}else if (enetype == "��"&& wazatype == "��") {//enetype == "��"&& wazatype == "��"��������A���ʂ͂��܂ЂƂ�
			dmg = dmg / 2;
			System.out.println("���ʂ͍���̂悤���A�A");
		}else if(enetype == "��"&& wazatype == "��") {
			dmg = dmg / 2;
			System.out.println("���ʂ͍���̂悤���A�A");
		}else if(enetype == "��"&& wazatype == "��") {
			dmg = dmg / 2;
			System.out.println("���ʂ͍���̂悤���A�A");
		}else if(enetype == "��"&& wazatype == "��") {
			dmg = dmg / 2;
			System.out.println("���ʂ͍���̂悤���A�A");
		}else if(enetype == "��"&& wazatype == "��") {
			dmg = dmg / 2;
			System.out.println("���ʂ͍���̂悤���A�A");
		}else if (enetype == "��"&& wazatype == "��") {
			dmg = dmg * 2;
			System.out.println("���ʂ͔��Q���I");
		}else if (enetype == "��"&& wazatype == "��") {
			dmg = dmg * 2;
			System.out.println("���ʂ͔��Q���I");
		}else if (enetype == "��"&& wazatype == "��") {
			dmg = dmg * 2;
			System.out.println("���ʂ͔��Q���I");
		}else {
			dmg = dmg * 1;
		}
		kyusyo = (int)(Math.random()*10)+1;
		if (kyusyo == 1) {
			dmg = dmg * 2;
			System.out.println("�}���ɓ��������I");
		}else {
			dmg = dmg * 1;
		}
		ransu =(int)(Math.random()*15)+85;
		ransu = (double)ransu /100;
		dmg = dmg * ransu;
		dmg = dmg -defence;
		return (int)dmg;
	}
}