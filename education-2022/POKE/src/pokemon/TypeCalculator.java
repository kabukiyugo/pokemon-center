package pokemon;

import java.util.*;

public class TypeCalculator {

	public static List<String> getEffectiveTypes(String type) {
		if (type.equals("�ق̂�")) {
			ArrayList<String> type1 = new ArrayList<>();
			type1.add("�݂�");
			type1.add("���߂�");
			return type1;
		} else if (type.equals("�݂�")) {
			ArrayList<String> type1 = new ArrayList<>();
			type1.add("����");
			type1.add("�ł�");
			 return type1;
		} else if (type.equals("�m�[�}��")) {
			ArrayList<String> type1 = new ArrayList<>();
			type1.add("�����Ƃ�");
			return type1;
		} else if (type.equals("���߂�")) {
			ArrayList<String> type1 = new ArrayList<>();
			type1.add("����");
			type1.add("�݂�");
			return type1;
		} else if (type.equals("�ł�")) {
			ArrayList<String> type1 = new ArrayList<>();
			type1.add("���߂�");
			return type1;	
		} else {
			ArrayList<String> type1 = new ArrayList<>();
			type1.add("�ق̂�");
			return type1;
		}
	}

	public static List<String> getNotEffectiveTypes(String type) {
		if (type.equals("�ق̂�")) {
			ArrayList<String> type2 = new ArrayList<>();
			type2.add("����");
			type2.add("�ق̂�");
			return type2;
		} else if (type.equals("�݂�")) {
			ArrayList<String> type2 = new ArrayList<>();
			type2.add("�ق̂�");
			type2.add("�݂�");
			return type2;
		} else if (type.equals("���߂�")) {
			ArrayList<String> type2 = new ArrayList<>();
			type2.add("�ق̂�");
			type2.add("����");
			type2.add("���߂�");
			return type2;
		} else if (type.equals("�ł�")) {
			ArrayList<String> type2 = new ArrayList<>();
			type2.add("�݂�");
			type2.add("�ł�");
			return type2;	
		} else if (type.equals("����")){
			ArrayList<String> type2 = new ArrayList<>();
			type2.add("�݂�");
			type2.add("����");
			return type2;
		}
		return null;
		
	}
}