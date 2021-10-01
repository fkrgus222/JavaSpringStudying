package �����÷��̾��;


/*
 * Player Ŭ������ PlayerLevel Ŭ������ ���� (HAS-A)�����̴�. �� ���� (aggregation)���� �����̴�.
 * ��ü(whole)�� �κ�(part)�� ��Ÿ�� �� ����̴�.
 * ���ӿ��� ��� Player�� �ڽ��� ������ �ֱ� ������, Player Ŭ�������� PlayerLevle��
 * ��������� ���´�. ������ �ö󰥼��� ������ �� �ִ� ��ɸ� �޶�����.
 * �׷��Ƿ� PlayerLevel Ŭ������ �߻�Ŭ������ ����� ��� �������� �������� �����ϴ�
 * ����� �����ϰ�, �� �������� �޶����� ����� �߻� �޼ҵ�� ����� �ش�.
 * 
 */

public class Player {

	//[�߿�] Player Ŭ�������� PlayerLevel�� '�������'�� ���´�.
	private PlayerLevel level;
	
	//������
	public Player() {
		//ó�� �����Ǹ� BeginnerLevel�� �밡�Ͽ�, ���� �޽��� Ǯ��
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	//�Ű����� �ڷ����� ��� ������ ��ȯ ������ PlayerLevel
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
	
}
