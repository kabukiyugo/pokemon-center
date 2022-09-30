package pokemon3;


public class pottyama extends BasePokemon {
	pottyama(){
		super(200,10,10,10,"みず","ポッチャマ",
				new Ability[] {
						new Ability("たいあたり", 5, "ノーマル", true),
						new Ability("おうふくビンタ", 3, "ノーマル", false),
						new Ability("あわ", 5, "みず", true),
						new Ability("みすでっぽう", 7, "みず", true)
		}
				);
	}
	public void attack() {

	}
}
