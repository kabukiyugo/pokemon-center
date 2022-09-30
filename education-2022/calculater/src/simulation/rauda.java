package simulation;

import java.util.ArrayList;

public class rauda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		
		//a.forEach(null);
		//String aaa = "aa";
		//String bbb = "bb";
		//String ccc = "cc";
		a.add("aaa");
		a.add("bb");
		a.add("c");
		a.forEach(str -> System.out.println(str));
		
		a.stream().filter(str -> str == "aaa").forEach(str -> System.out.println(str));;
		
		a.stream().map(str -> str.length()).forEach(System.out::println);
		
		a.stream().sorted((str1,str2) -> str1.length() - str2.length()).forEach(System.out::println);
		
		a.stream().sorted().forEach(System.out::println);
		
		a.stream().sorted((str1,str2) -> str2.compareTo(str1)).forEach(System.out::println);
		
		String abc = a.stream().reduce("", (str1,str2) -> str1 + str2);
		
		System.out.println(abc);
		
		
		
	}

}
