package pokemon3;


public class hikozaru extends BasePokemon{
	hikozaru(){
		super(170,12,5,15,"ほのお","ヒコザル",
				new Ability[] {
						new Ability("たいあたり", 5, "ノーマル", true),
						new Ability("おうふくビンタ", 3, "ノーマル", false),
						new Ability("ひのこ", 5, "ほのお", true),
						new Ability("かえんぐるま", 7, "ほのお", true)
		}
				);
	}
	public void attack() {

	}
}
