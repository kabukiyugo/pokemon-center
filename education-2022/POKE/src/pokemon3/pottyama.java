package pokemon3;


public class pottyama extends BasePokemon {
	pottyama(){
		super(200,10,10,10,"�݂�","�|�b�`���}",
				new Ability[] {
						new Ability("����������", 5, "�m�[�}��", true),
						new Ability("�����ӂ��r���^", 3, "�m�[�}��", false),
						new Ability("����", 5, "�݂�", true),
						new Ability("�݂��ł��ۂ�", 7, "�݂�", true)
		}
				);
	}
	public void attack() {

	}
}