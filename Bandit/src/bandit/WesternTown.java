package bandit;

import java.util.Calendar;
/*
 * ����� ���� � ����� ����� ��� ������� ������� ��������������: ��������������, ������ �� ����������, 
 * ���� ������ � ���� ������. ���������� ���� ������ �� ��� ���� �����, ��� ���� � �� �� ������ � �������� �������� 
 * ���� 1850 �. 
 * ������ 1. ����������� ���� �WesternTown�, ��� ����������� ������������, get � set ������, ����� �������� �� 
 * ������� ��������.

 */
public class WesternTown {
	public WesternTown() {
		address = "Zapadna Amerika";
		year = 1890;
		bars = 2;
		sheriffs = 1;
	}

	public WesternTown(String address, short year, int bars, int sheriffs) {
		super();
		this.address = address;
		setYear(year);
		setBars(bars);
		setSheriffs(sheriffs);
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public short getYear() {
		return year;
	}

	public void setYear(short year) {
		if (year > 0 && year < Calendar.getInstance().get(Calendar.YEAR))
			this.year = year;
	}

	public int getBars() {
		return bars;
	}

	public void setBars(int bars) {
		if (bars >= 0)
			this.bars = bars;
	}

	public int getSheriffs() {
		return sheriffs;
	}

	public void setSheriffs(int sheriffs) {
		if (sheriffs >= 0)
			this.sheriffs = sheriffs;
	}


	private String address;
	private short year;
	private int bars;
	private int sheriffs;
}
