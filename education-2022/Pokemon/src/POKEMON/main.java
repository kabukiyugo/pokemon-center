package POKEMON;

import java.io.*;
import java.util.*;
public class main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//Pokemon n = new Pokemon("�i�G�g��","��",230,8,5,15);//�����
		//Pokemon h = new Pokemon("�q�R�U��","��",170,12,15,5);//�����
		//Pokemon p = new Pokemon("�|�b�`���}","��",200,10,10,10);//�����
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
		Waza waza1 = new Waza("����������","�m�[�}��",5,1);
		Waza waza2 = new Waza("�����ӂ��r���^","�m�[�}��",3,(int)(Math.random()*4)+2);//�z�C�[���̒���random�ɂQ�`�T�̐�������
		Waza waza3 = new Waza("���̂�","��",5,1);
		Waza waza4 = new Waza("�͂��σJ�b�^�[","��",7,1);
		Waza waza5 = new Waza("�Ђ̂�","��",5,1);
		Waza waza6 = new Waza("�����񂮂��","��",7,1);
		Waza waza7 = new Waza("����","��",5,1);
		Waza waza8 = new Waza("�݂��ł��ۂ�","��",7,1);

		if(My.getpmSpeed() >= ene.getpmSpeed()) {
			while (true) {
				System.out.println(My.Name+"��HP:"+My.getpmHP()+","+"�����"+ene.Name+"��HP:"+ene.getpmHP());
				System.out.println();
				System.out.println("�����̋Z��I��");
				if(buf == 1) {
					System.out.println("1:����������,2:�����ӂ��r���^,3:���̂�,4:�͂��σJ�b�^�[");
					Scanner sc2 = new Scanner(System.in);
					int buf2 = sc2.nextInt();
					if(buf2 == 1) {
						System.out.println("�i�G�g���̂���������");
						dmg o = new dmg(8,5,ene.getType(),My.getType(),"�m�[�}��");//��������
						int d = o.dmgCalc() - ene.getpmDefence();
						ene.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
					}else if(buf2 == 2) {
						System.out.println("�i�G�g���̂����ӂ��r���^");
						dmg o = new dmg(8,3,ene.getType(),My.getType(),"�m�[�}��");//��������
						waza2.setAN();
						for(int i = 0;i < waza2.getAN();i++) {
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
				}else if(buf == 2) {
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
				}else if(buf == 3) {
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
					break;
				}
				//��������G�o�[�W�����̍U�������-------------------------------
				System.out.println();
				System.out.println(My.Name+"��HP:"+My.getpmHP()+","+"�����"+ene.Name+"��HP:"+ene.getpmHP());
				System.out.println();
				System.out.println("����̍U��");
				if(r == 1) {
					System.out.println("1:����������,2:�����ӂ��r���^,3:���̂�,4:�͂��σJ�b�^�[");
					int r2 = (int)(Math.random()*4)+1;
					if(r2 == 1) {
						System.out.println("����̃i�G�g���̂���������");
						dmg o = new dmg(8,5,My.getType(),ene.getType(),"�m�[�}��");//��������
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
					}else if(r2 == 2) {
						System.out.println("����̃i�G�g���̂����ӂ��r���^");
						dmg o = new dmg(8,3,My.getType(),ene.getType(),"�m�[�}��");//��������
						waza2.setAN();
						for(int i = 0;i < waza2.getAN();i++) {
							int d = o.dmgCalc() - My.getpmDefence();
							My.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
						}
						System.out.println(waza2.getAN()+"�񓖂������I");
					}else if(r2 == 3) {
						System.out.println("����̃i�G�g���̂��̂�");
						dmg o = new dmg(8,5,My.getType(),ene.getType(),"��");//��������
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
					}else if(r2 == 4) {
						System.out.println("����̃i�G�g���̂͂��σJ�b�^�[");
						dmg o = new dmg(8,7,My.getType(),ene.getType(),"��");//��������
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
					}
				}else if(r == 2) {
					System.out.println("1:����������,2:�����ӂ��r���^,3:�Ђ̂�,4:�����񂮂��");
					int r2 = (int)(Math.random()*4)+1;
					if(r2 == 1) {
						System.out.println("����̃q�R�U���̂���������");
						dmg o = new dmg(12,5,My.getType(),ene.getType(),"�m�[�}��");//��������
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
					}else if(r2 == 2) {
						System.out.println("����̃q�R�U���̂����ӂ��r���^");
						dmg o = new dmg(12,3,My.getType(),ene.getType(),"�m�[�}��");//��������
						waza2.setAN();
						for(int i = 0;i < waza2.getAN();i++) {
							int d = o.dmgCalc() - My.getpmDefence();
							My.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
						}
						System.out.println(waza2.getAN()+"�񓖂������I");
					}else if(r2 == 3) {
						System.out.println("����̃q�R�U���̂Ђ̂�");
						dmg o = new dmg(12,5,My.getType(),ene.getType(),"��");//��������
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
					}else if(r2 == 4) {
						System.out.println("����̃q�R�U���̂����񂮂��");
						dmg o = new dmg(12,7,My.getType(),ene.getType(),"��");//��������
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
					}
				}else if(r == 3) {
					System.out.println("1:����������,2:�����ӂ��r���^,3:����,4:�݂��ł��ۂ�");
					int r2 = (int)(Math.random()*4)+1;
					if(r2 == 1) {
						System.out.println("����̃|�b�`���}�̂���������");
						dmg o = new dmg(10,5,My.getType(),ene.getType(),"�m�[�}��");//��������
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
					}else if(r2 == 2) {
						System.out.println("����̃|�b�`���}�̂����ӂ��r���^");
						dmg o = new dmg(10,3,My.getType(),ene.getType(),"�m�[�}��");//��������
						waza2.setAN();
						for(int i = 0;i < waza2.getAN();i++) {
							int d = o.dmgCalc() - My.getpmDefence();
							My.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
						}
						System.out.println(waza2.getAN()+"�񓖂������I");
					}else if(r2 == 3) {
						System.out.println("����̃|�b�`���}�̂���");
						dmg o = new dmg(10,5,My.getType(),ene.getType(),"��");//��������
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
					}else if(r2 == 4) {
						System.out.println("����̃|�b�`���}�݂̂��ł��ۂ�");
						dmg o = new dmg(10,7,My.getType(),ene.getType(),"��");//��������
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
					}
				}
				if (My.getpmHP() <= 0) {
					System.out.println();
					System.out.println("������HP��0�ɂȂ���");
					System.out.println("�����ɕ������A�A�A");
					break;
				}
			}//�����܂�while
		}else {
			while(true) {
				//��������G�o�[�W�����̍U�������-------------------------------
				System.out.println();
				System.out.println(My.Name+"��HP:"+My.getpmHP()+","+"�����"+ene.Name+"��HP:"+ene.getpmHP());
				System.out.println();
				System.out.println("����̍U��");
				if(r == 1) {
					System.out.println("1:����������,2:�����ӂ��r���^,3:���̂�,4:�͂��σJ�b�^�[");
					int r2 = (int)(Math.random()*4)+1;
					if(r2 == 1) {
						System.out.println("����̃i�G�g���̂���������");
						dmg o = new dmg(8,5,My.getType(),ene.getType(),"�m�[�}��");//��������
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
					}else if(r2 == 2) {
						System.out.println("����̃i�G�g���̂����ӂ��r���^");
						dmg o = new dmg(8,3,My.getType(),ene.getType(),"�m�[�}��");//��������
						waza2.setAN();
						for(int i = 0;i < waza2.getAN();i++) {
							int d = o.dmgCalc() - My.getpmDefence();
							My.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
						}
						System.out.println(waza2.getAN()+"�񓖂������I");
					}else if(r2 == 3) {
						System.out.println("����̃i�G�g���̂��̂�");
						dmg o = new dmg(8,5,My.getType(),ene.getType(),"��");//��������
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
					}else if(r2 == 4) {
						System.out.println("����̃i�G�g���̂͂��σJ�b�^�[");
						dmg o = new dmg(8,7,My.getType(),ene.getType(),"��");//��������
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
					}
				}else if(r == 2) {
					System.out.println("1:����������,2:�����ӂ��r���^,3:�Ђ̂�,4:�����񂮂��");
					int r2 = (int)(Math.random()*4)+1;
					if(r2 == 1) {
						System.out.println("����̃q�R�U���̂���������");
						dmg o = new dmg(12,5,My.getType(),ene.getType(),"�m�[�}��");//��������
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
					}else if(r2 == 2) {
						System.out.println("����̃q�R�U���̂����ӂ��r���^");
						dmg o = new dmg(12,3,My.getType(),ene.getType(),"�m�[�}��");//��������
						waza2.setAN();
						for(int i = 0;i < waza2.getAN();i++) {
							int d = o.dmgCalc() - My.getpmDefence();
							My.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
						}
						System.out.println(waza2.getAN()+"�񓖂������I");
					}else if(r2 == 3) {
						System.out.println("����̃q�R�U���̂Ђ̂�");
						dmg o = new dmg(12,5,My.getType(),ene.getType(),"��");//��������
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
					}else if(r2 == 4) {
						System.out.println("����̃q�R�U���̂����񂮂��");
						dmg o = new dmg(12,7,My.getType(),ene.getType(),"��");//��������
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
					}
				}else if(r == 3) {
					System.out.println("1:����������,2:�����ӂ��r���^,3:����,4:�݂��ł��ۂ�");
					int r2 = (int)(Math.random()*4)+1;
					if(r2 == 1) {
						System.out.println("����̃|�b�`���}�̂���������");
						dmg o = new dmg(10,5,My.getType(),ene.getType(),"�m�[�}��");//��������
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
					}else if(r2 == 2) {
						System.out.println("����̃|�b�`���}�̂����ӂ��r���^");
						dmg o = new dmg(10,3,My.getType(),ene.getType(),"�m�[�}��");//��������
						waza2.setAN();
						for(int i = 0;i < waza2.getAN();i++) {
							int d = o.dmgCalc() - My.getpmDefence();
							My.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
						}
						System.out.println(waza2.getAN()+"�񓖂������I");
					}else if(r2 == 3) {
						System.out.println("����̃|�b�`���}�̂���");
						dmg o = new dmg(10,5,My.getType(),ene.getType(),"��");//��������
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
					}else if(r2 == 4) {
						System.out.println("����̃|�b�`���}�݂̂��ł��ۂ�");
						dmg o = new dmg(10,7,My.getType(),ene.getType(),"��");//��������
						int d = o.dmgCalc() - My.getpmDefence();
						My.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
					}
				}
				if (My.getpmHP() <= 0) {
					System.out.println();
					System.out.println("������HP��0�ɂȂ���");
					System.out.println("�����ɕ������A�A�A");
					break;
				}
				//----------------------------------------------------------------------------------------
				System.out.println();
				System.out.println(My.Name+"��HP:"+My.getpmHP()+","+"�����"+ene.Name+"��HP:"+ene.getpmHP());
				System.out.println();
				System.out.println("�����̋Z��I��");
				if(buf == 1) {
					System.out.println("1:����������,2:�����ӂ��r���^,3:���̂�,4:�͂��σJ�b�^�[");
					Scanner sc2 = new Scanner(System.in);
					int buf2 = sc2.nextInt();
					if(buf2 == 1) {
						System.out.println("�i�G�g���̂���������");
						dmg o = new dmg(8,5,ene.getType(),My.getType(),"�m�[�}��");//��������
						int d = o.dmgCalc() - ene.getpmDefence();
						ene.setpmHP(d);//�^����_���[�W�����i�j�ɂ����A�v�Z��
					}else if(buf2 == 2) {
						System.out.println("�i�G�g���̂����ӂ��r���^");
						dmg o = new dmg(8,3,ene.getType(),My.getType(),"�m�[�}��");//��������
						waza2.setAN();
						for(int i = 0;i < waza2.getAN();i++) {
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
				}else if(buf == 2) {
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
				}else if(buf == 3) {
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
					break;
				}
			}
		}
	}
}
