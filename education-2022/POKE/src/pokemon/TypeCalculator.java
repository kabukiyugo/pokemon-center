package pokemon;

import java.util.*;

public class TypeCalculator {

	public static List<String> getEffectiveTypes(String type) {
		if (type.equals("ほのお")) {
			ArrayList<String> type1 = new ArrayList<>();
			type1.add("みず");
			type1.add("じめん");
			return type1;
		} else if (type.equals("みず")) {
			ArrayList<String> type1 = new ArrayList<>();
			type1.add("くさ");
			type1.add("でんき");
			 return type1;
		} else if (type.equals("ノーマル")) {
			ArrayList<String> type1 = new ArrayList<>();
			type1.add("かくとう");
			return type1;
		} else if (type.equals("じめん")) {
			ArrayList<String> type1 = new ArrayList<>();
			type1.add("くさ");
			type1.add("みず");
			return type1;
		} else if (type.equals("でんき")) {
			ArrayList<String> type1 = new ArrayList<>();
			type1.add("じめん");
			return type1;	
		} else {
			ArrayList<String> type1 = new ArrayList<>();
			type1.add("ほのお");
			return type1;
		}
	}

	public static List<String> getNotEffectiveTypes(String type) {
		if (type.equals("ほのお")) {
			ArrayList<String> type2 = new ArrayList<>();
			type2.add("くさ");
			type2.add("ほのお");
			return type2;
		} else if (type.equals("みず")) {
			ArrayList<String> type2 = new ArrayList<>();
			type2.add("ほのお");
			type2.add("みず");
			return type2;
		} else if (type.equals("じめん")) {
			ArrayList<String> type2 = new ArrayList<>();
			type2.add("ほのお");
			type2.add("くさ");
			type2.add("じめん");
			return type2;
		} else if (type.equals("でんき")) {
			ArrayList<String> type2 = new ArrayList<>();
			type2.add("みず");
			type2.add("でんき");
			return type2;	
		} else if (type.equals("くさ")){
			ArrayList<String> type2 = new ArrayList<>();
			type2.add("みず");
			type2.add("くさ");
			return type2;
		}
		return null;
		
	}
}
