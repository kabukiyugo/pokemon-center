package simulation;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class calculation {

	public static void main(String[] args)throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		out : while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String line1 = line;
			int startIndex = 0;
			int i;
			ArrayList<String> list = new ArrayList<String>();
			//String[] arr = line.split("[+-]");
			for(i=0; i<line.length(); i++) {
				if(String.valueOf(line.charAt(i)).equals("+") || String.valueOf(line.charAt(i)).equals("-")) {
					list.add(line.substring(startIndex,i));
					startIndex = i;
				}
			}
			list.add(line.substring(startIndex,line.length()));
			ArrayList aaa = new ArrayList();
			
			int sum = 0;
			
			for(String item : list) {
				sum += num(item);
			}
			
			System.out.println(sum);
			
			//��������
//			for(String j : list) {
//				if(list.size() != 1) {
//					for(int x ; x < j.length() ; x++) {
//						aaa.add(String.valueOf(j.charAt(x)));
//					}
//					
//				}
//			}
//			System.out.println(aaa);
			//�����܂�
			
			
			

			/*
			 * if (arr.length < 3 || ((arr.length != 3) && (arr.length % 3 != 2))) {
			 * 
			 * System.out.println("���l ���Z�q ���l ���Z�q ���l �c �̏��ɍŒ�3�̈������w�肵�Ă�������"); continue;
			 * 
			 * } else {
			 * 
			 * // �擪�̐��l if (checkNum(arr[0])) {
			 * 
			 * //���l�ϊ� total = Double.parseDouble(arr[0]);
			 * 
			 * }
			 * 
			 * for (int i = 0; i <= ((arr.length - 3) / 2); i++) {
			 * 
			 * //�擪�̐��l�ȍ~�͈�Ƃтɉ��Z�q�Ɛ��l������ if (checkOperator(arr[i * 2 + 1]) && checkNum(arr[i
			 * * 2 + 2])) {
			 * 
			 * //���Z�q�ɂ����total�ɍ��Z���鏈����ύX switch (arr[i * 2 + 1]) {
			 * 
			 * case "+": total = total + Double.parseDouble(arr[i * 2 + 2]); break;
			 * 
			 * case "-": total = total - Double.parseDouble(arr[i * 2 + 2]); break;
			 * 
			 * case "*": total = total * Double.parseDouble(arr[i * 2 + 2]); break;
			 * 
			 * case "/": total = total / Double.parseDouble(arr[i * 2 + 2]); break;
			 * 
			 * }
			 * 
			 * } else { System.out.println("���l ���Z�q ���l ���Z�q ���l �c �̏��Ɉ������w�肵�Ă�������"); continue
			 * out; }
			 * 
			 * }
			 * 
			 * System.out.println("���v:" + total); }
			 */
		}

		sc.close();
	}

	// ���l�`�F�b�N ���l�̏ꍇ��true ���l�ȊO�̏ꍇfalse
	private static boolean checkNum(String str) {

		try {

			// double�^�֕ϊ����A�G���[���o�Ȃ���ΐ��l�Ƃ݂Ȃ�
			Double.parseDouble(str);

		} catch (NumberFormatException e) {

			return false;

		}

		return true;

	}
	
	public static int num(String str) {
		int flag = 0;
		ArrayList<String> list1 = new ArrayList<String>();
		for(int i=0; i<str.length(); i++){
			if(String.valueOf(str.charAt(i)).equals("*")) {
				list1.add("*");
				flag = 1;
			}else if(String.valueOf(str.charAt(i)).equals("/") ) {
				list1.add("/");
				flag = 1;
			}
		}
		if(flag == 0) {
			return Integer.parseInt(str);
		}
		String[] list2 = str.split("[*/]");
		int sum = 0;
		for(int j=0; j<list2.length-1; j++) {
			if(list1.get(j).equals("*")) {
				sum += Integer.parseInt(list2[j]) * Integer.parseInt(list2[j+1]);
			}else {
				sum += Integer.parseInt(list2[j]) / Integer.parseInt(list2[j+1]);
			}
			 
		}
		return sum;
		
	}

	// ���Z�q�`�F�b�N
	private static boolean checkOperator(String str) {

		if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
			return true;
		} else {
			return false;
		}

	}
	
	




}
