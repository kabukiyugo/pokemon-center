package pokemon;

import java.util.*;

public class TypeCalculator {

	public static List<String> getEffectiveTypes(String type) {
		if (type.equals("ÇŸÇÃÇ®")) {
			ArrayList<String> type1 = new ArrayList<>();
			type1.add("Ç›Ç∏");
			type1.add("Ç∂ÇﬂÇÒ");
			return type1;
		} else if (type.equals("Ç›Ç∏")) {
			ArrayList<String> type1 = new ArrayList<>();
			type1.add("Ç≠Ç≥");
			type1.add("Ç≈ÇÒÇ´");
			 return type1;
		} else if (type.equals("ÉmÅ[É}Éã")) {
			ArrayList<String> type1 = new ArrayList<>();
			type1.add("Ç©Ç≠Ç∆Ç§");
			return type1;
		} else if (type.equals("Ç∂ÇﬂÇÒ")) {
			ArrayList<String> type1 = new ArrayList<>();
			type1.add("Ç≠Ç≥");
			type1.add("Ç›Ç∏");
			return type1;
		} else if (type.equals("Ç≈ÇÒÇ´")) {
			ArrayList<String> type1 = new ArrayList<>();
			type1.add("Ç∂ÇﬂÇÒ");
			return type1;	
		} else {
			ArrayList<String> type1 = new ArrayList<>();
			type1.add("ÇŸÇÃÇ®");
			return type1;
		}
	}

	public static List<String> getNotEffectiveTypes(String type) {
		if (type.equals("ÇŸÇÃÇ®")) {
			ArrayList<String> type2 = new ArrayList<>();
			type2.add("Ç≠Ç≥");
			type2.add("ÇŸÇÃÇ®");
			return type2;
		} else if (type.equals("Ç›Ç∏")) {
			ArrayList<String> type2 = new ArrayList<>();
			type2.add("ÇŸÇÃÇ®");
			type2.add("Ç›Ç∏");
			return type2;
		} else if (type.equals("Ç∂ÇﬂÇÒ")) {
			ArrayList<String> type2 = new ArrayList<>();
			type2.add("ÇŸÇÃÇ®");
			type2.add("Ç≠Ç≥");
			type2.add("Ç∂ÇﬂÇÒ");
			return type2;
		} else if (type.equals("Ç≈ÇÒÇ´")) {
			ArrayList<String> type2 = new ArrayList<>();
			type2.add("Ç›Ç∏");
			type2.add("Ç≈ÇÒÇ´");
			return type2;	
		} else if (type.equals("Ç≠Ç≥")){
			ArrayList<String> type2 = new ArrayList<>();
			type2.add("Ç›Ç∏");
			type2.add("Ç≠Ç≥");
			return type2;
		}
		return null;
		
	}
}
