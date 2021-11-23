package picture;

import java.util.*;

/*
 * ������ 2: �������� ���� ��������, ����� ������� ������ �� ������ �� ���� ���������. 
 * �������� ������������ ������������ (������������� ������ ������), get � set ������. 
 * �������� ����� �� �������� �� ������� ��� ������� (������ �� ����� ��������� ���� ������ ���������). 
 * ��������� �������� �� ��������� � ��� ������ ������� ���� ��� � �������, �� �� �� ����� ���������� 
 * ��� �� �� �������� ����� � ���������. 
 * �������� �����, ����� ������� ������� �� ������� �������� �����.
 */

public class Pictures {
	private ArrayList<Picture> pict;

	public Pictures() {
		pict = new ArrayList<Picture>();
	}

	public ArrayList<Picture> getPict() {
		return pict;
	}

	public void setPict(ArrayList<Picture> pict) {
		this.pict = pict;
	}
	
	public void add(Picture p) throws PictureException {
		if (pict.contains(p)) {
			throw new PictureException("The picture exists!");
		} else {
			pict.add(p);
		}
	}
	
	public void delete(int id) {
		for (Picture p:pict) {
			if (p.getId()==id) {
				pict.remove(p);
				return;
			}
		}
	}
	
	/*
	 * ������ 3: �������� ����� �� ����������� �� ������������ �� ��������� �� ����� ����� 
	 * (����� �� �� ������ ���� ���������, � ��� �� ������ ������ ��� �� �� ��������� ������������ �� ������ �������).
	 */
	
	public void print(String aName) {
		if (aName.isEmpty()) {
			printAll();
		} else {
			for (Picture p:pict) {
				if (p.getAuthor().equals(aName)) {
					p.print();
				}
			}
		}
	}
	
	private void printAll() {
		for (Picture p:pict) {
			p.print();
		}
	}
	
	/*
	 * ������ 4: � ���� �������� �������� �����, ����� ������ ���-������� ��� ���-������� ������� 
	 * (��� �� ������ �� ���� � ����� ����) � ��������� ���������� �� ��� �� ������. 
	 * �������� �����, ����� ����� �������� ���� �� ��������� �� ����� ����� (����� �� ������ �� ������ ���� ���������, 
	 * ���� ��� �� ������ ������ String, �� �� �� ����� �������� ���� �� ��������� �� ������ ������).
	 */
	
	public void ExpensivePicture() {
		float mPrice = getMaxPrice();
		
		for(Picture p:pict) {
			if (p.getPrice() == mPrice) {
				p.print();
			}
		}
	}
	
	private float getMaxPrice()	{
		float mPrice = pict.get(0).getPrice();
		for (int i=1; i<pict.size(); ++i) {
			if (mPrice < pict.get(i).getPrice()) {
				mPrice = pict.get(i).getPrice();
			}
		}
		return mPrice;
	}
	
	public float AveragePrice(String aName) {
		boolean cond = !aName.isEmpty();
		float avPrice = 0;
		int cnt = 0;
		
		for (Picture p:pict) {
			if (cond || p.getAuthor().equals(aName)) {
				avPrice += p.getPrice();
				cnt++;
			}
		}
		return (cnt==0) ? 0 : (avPrice/cnt);
	}
}
