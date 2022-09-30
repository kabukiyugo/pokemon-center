package pokemon3;


public class  naetoru extends BasePokemon {
	naetoru(){
		super(230,8,15,5,"くさ","ナエトル",
				new Ability[] {
						new Ability("たいあたり", 5, "ノーマル", true),
						new Ability("おうふくビンタ", 3, "ノーマル", false),
						new Ability("このは", 5, "くさ", true),
						new Ability("はっぱカッター", 7, "くさ", true)
		}
				);
	}
	public void attack(){

	}
}
