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
	System.out.println(Myname+"��HP:"+Myhp+","+"�����"+Enename+"��HP:"+Enehp);
	System.out.println();
	System.out.println("�����̋Z��I��");
	if(sl.getbuf() == 1) {
		System.out.println("1:����������,2:�����ӂ��r���^,3:���̂�,4:�͂��σJ�b�^�[");
		Scanner sc2 = new Scanner(System.in);
		int buf2 = sc2.nextInt();
		if(buf2 == 1) {
			System.out.println("�i�G�g���̂���������");
			dmg2 o = new dmg2(8,5,Enedefence,Enetype,Mytype,"�m�[�}��");//��������
			int d = o.dmgCalc(); 
			ene.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
		}else if(buf2 == 2) {
			System.out.println("�i�G�g���̂����ӂ��r���^");
			dmg o = new dmg(8,3,ene.getType(),My.getType(),"�m�[�}��");//��������
			setouhukuAN();
			for(int i = 0;i < getouhukuAN();i++) {
				int d = o.dmgCalc() - ene.getpmDefence();
				ene.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
			}
			System.out.println(waza2.getAN()+"�񓖂������I");
		}else if(buf2 == 3) {
			System.out.println("�i�G�g���̂��̂�");
			dmg o = new dmg(8,5,ene.getType(),My.getType(),"��");//��������
			int d = o.dmgCalc() - ene.getpmDefence();
			ene.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
		}else if(buf2 == 4) {
			System.out.println("�i�G�g���̂͂��σJ�b�^�[");
			dmg o = new dmg(8,7,ene.getType(),My.getType(),"��");//��������
			int d = o.dmgCalc() - ene.getpmDefence();
			ene.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
		}
	}else if(sl.getbuf() == 2) {
		System.out.println("1:����������,2:�����ӂ��r���^,3:�Ђ̂�,4:�����񂮂��");
		Scanner sc2 = new Scanner(System.in);
		int buf2 = sc2.nextInt();
		if(buf2 == 1) {
			System.out.println("�q�R�U���̂���������");
			dmg o = new dmg(12,5,ene.getType(),My.getType(),"�m�[�}��");//��������
			int d = o.dmgCalc() - ene.getpmDefence();
			ene.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
		}else if(buf2 == 2) {
			System.out.println("�q�R�U���̂����ӂ��r���^");
			dmg o = new dmg(12,3,ene.getType(),My.getType(),"�m�[�}��");//��������
			waza2.setAN();
			for(int i = 0;i < waza2.getAN();i++) {
				int d = o.dmgCalc() - ene.getpmDefence();
				ene.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
			}
			System.out.println(waza2.getAN()+"�񓖂������I");
		}else if(buf2 == 3) {
			System.out.println("�q�R�U���̂Ђ̂�");
			dmg o = new dmg(12,5,ene.getType(),My.getType(),"��");//��������
			int d = o.dmgCalc() - ene.getpmDefence();
			ene.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
		}else if(buf2 == 4) {
			System.out.println("�q�R�U���̂����񂮂��");
			dmg o = new dmg(12,7,ene.getType(),My.getType(),"��");//��������
			int d = o.dmgCalc() - ene.getpmDefence();
			ene.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
		}
	}else if(sl.getbuf() == 3) {
		System.out.println("1:����������,2:�����ӂ��r���^,3:����,4:�݂��ł��ۂ�");
		Scanner sc2 = new Scanner(System.in);
		int buf2 = sc2.nextInt();
		if(buf2 == 1) {
			System.out.println("�|�b�`���}�̂���������");
			dmg o = new dmg(10,5,ene.getType(),My.getType(),"�m�[�}��");//��������
			int d = o.dmgCalc() - ene.getpmDefence();
			ene.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
		}else if(buf2 == 2) {
			System.out.println("�|�b�`���}�̂����ӂ��r���^");
			dmg o = new dmg(10,3,ene.getType(),My.getType(),"�m�[�}��");//��������
			waza2.setAN();
			for(int i = 0;i < waza2.getAN();i++) {
				int d = o.dmgCalc() - ene.getpmDefence();
				ene.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
			}
			System.out.println(waza2.getAN()+"�񓖂������I");
		}else if(buf2 == 3) {
			System.out.println("�|�b�`���}�̂���");
			dmg o = new dmg(10,5,ene.getType(),My.getType(),"��");//��������
			int d = o.dmgCalc() - ene.getpmDefence();
			ene.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
		}else if(buf2 == 4) {
			System.out.println("�|�b�`���}�݂̂��ł��ۂ�");
			dmg o = new dmg(10,7,ene.getType(),My.getType(),"��");//��������
			int d = o.dmgCalc() - ene.getpmDefence();
			ene.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
		}
	}
	if (ene.getpmHP() <= 0) {
		System.out.println();
		System.out.println("�����HP��0��");
		System.out.println("�����ɏ������I");

}
}
}