package bandit;

/*
 * ����� � ���� �������� ���� ����� ���� �� ������ ��������� ���� ����. ���� ������ ���� �� ����� ��������� �������� 
 * �� ������� � �� ���������� ���� �� ����. ���� ���������� ���������� ������ ������ ������� ����� ���� ���� ������.
 * ������ 4. �������� �main� �����, � ����� �������� ���������� ���� � �������������� �� ���� ���������� � ��������� 
 * ���������� ������.
 */

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Villain Billy = new Villain(2,2,2,"Billy","Billy Horse","Johny Walker", 300,"Billy Bandit", 10000);
		Villager JohnSmith = new Villager(2,2,2,"John Smith", "Smith Horse","Tullamore Dew");
		
		Villain Jonny = new Villain(JohnSmith.getLegs(),JohnSmith.getHands(),JohnSmith.getEyes(),JohnSmith.getName(),
				JohnSmith.getHourse(),JohnSmith.getWhiskey(), 400,"Johny", 5000);
		
		Villain.Skirmish(Billy, Jonny);
	}

}
