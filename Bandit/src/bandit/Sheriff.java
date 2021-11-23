package bandit;

/*
 * ������� ������� ����� �� �� ������� � ���������.
 * ������ 5. ����������� ��������� �RegisterTown� � �Sheriff�. 
 * ������� ���������� �� �������� �� ��������� �� ���� ����������� ����� Shoot, ������ ����� �� 20 �� 100.
 */

public class Sheriff extends Villain{
	@Override
	public int shoot() {
		int cart = super.shoot()+20;
		return Math.min(cart, 100);
	}
}
