package pokemon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		AbilitySelector abisele = new AbilitySelector(scanner);
		Battle b = new Battle(abisele);

	}

}
