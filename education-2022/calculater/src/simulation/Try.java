package simulation;

import java.util.ArrayList;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		
		for (int i =0;i < 20;i++) {
			a.add((int)(Math.random()*100)+1);
		}
		
		//a.add((int)(Math.random()*100)+1);
		
		//int bb = a.stream().filter(number -> number >= 50).reduce( (int1,int2) -> int1 + int2).get();
		//System.out.println(bb);
		
		//a.stream().reduce( 0,(int1,int2) ->{ if (int2 >= 50) { return int1 + int2;}
		//return int1;
		//});
		System.out.println(a.stream().reduce( 0,(int1,int2)->{
			if (int2 >= 50) { 
				return int1 + int2;}
				return int1;
		}));
		
		//-> int2 >= 50 ? int1 += int2 : i1)); OZ‰‰Zq‚ğ„—p‚µ‚½ê‡
	}

}
