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
			
			//ここから
//			for(String j : list) {
//				if(list.size() != 1) {
//					for(int x ; x < j.length() ; x++) {
//						aaa.add(String.valueOf(j.charAt(x)));
//					}
//					
//				}
//			}
//			System.out.println(aaa);
			//ここまで
			
			
			

			/*
			 * if (arr.length < 3 || ((arr.length != 3) && (arr.length % 3 != 2))) {
			 * 
			 * System.out.println("数値 演算子 数値 演算子 数値 … の順に最低3つの引数を指定してください"); continue;
			 * 
			 * } else {
			 * 
			 * // 先頭の数値 if (checkNum(arr[0])) {
			 * 
			 * //数値変換 total = Double.parseDouble(arr[0]);
			 * 
			 * }
			 * 
			 * for (int i = 0; i <= ((arr.length - 3) / 2); i++) {
			 * 
			 * //先頭の数値以降は一つとびに演算子と数値が続く if (checkOperator(arr[i * 2 + 1]) && checkNum(arr[i
			 * * 2 + 2])) {
			 * 
			 * //演算子によってtotalに合算する処理を変更 switch (arr[i * 2 + 1]) {
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
			 * } else { System.out.println("数値 演算子 数値 演算子 数値 … の順に引数を指定してください"); continue
			 * out; }
			 * 
			 * }
			 * 
			 * System.out.println("合計:" + total); }
			 */
		}

		sc.close();
	}

	// 数値チェック 数値の場合にtrue 数値以外の場合false
	private static boolean checkNum(String str) {

		try {

			// double型へ変換し、エラーが出なければ数値とみなす
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

	// 演算子チェック
	private static boolean checkOperator(String str) {

		if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
			return true;
		} else {
			return false;
		}

	}
	
	




}

