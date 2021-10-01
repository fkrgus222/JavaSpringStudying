package �÷��̾�;

public class Player {
	public String userName;
	public PlayerLevel playerLevel;
	public String level;
	
	//������ (only name), ���� Beginner���� ����
	Player(String userName){
		this.playerLevel = new BeginnerLevel();
		this.userName = userName;
		level = "BeginnerLevel";
	}
	
	//������( name, level) , ������ �������� ����
	Player(String userName, String level){
		this.userName = userName;
		this.level = level;
		if (level == "BeginnerLevel") this.playerLevel = new BeginnerLevel();
		else if (level == "IntermediateLevel") this.playerLevel = new IntermediateLevel(); 
		else if (level == "AdvancedLevel") this.playerLevel = new AdvancedLevel();
	}
	
	//����� ������.
	public void levelUp() {
		//����� ���� �������� �����Ӻ��.
		System.out.print("����� ������ " + level + " ���� ");
		if (level == "BeginnerLevel") {
			this.playerLevel = new IntermediateLevel();
			this.level = "IntermediateLevel";
			System.out.println(level + " �� �ö����ϴ�.");
		}
		else if (level == "IntermediateLevel") {
			this.playerLevel = new AdvancedLevel();
			this.level = "AdvancedLevel";
		}
		else if (level == "AdvancedLevel") {
			System.out.println("�ְ��� �Դϴ�!!");
			System.out.println("===============");
		}
		//����ɷ� ������ �߽����ϴ�.
	}
	
	//���� ����. PlayerLevel.go() ���ԵǾ�����.
	public void showInfo(int count) {
		System.out.println("����� �̸��� : " + userName + " �Դϴ�.");
		System.out.println("����� ������ : " + level + " �Դϴ�.");
		this.playerLevel.go(count);
	}
	
	
}
