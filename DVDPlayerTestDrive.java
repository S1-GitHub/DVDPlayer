package record;

import java.util.Scanner;

public class DVDPlayerTestDrive {

	private static Scanner sc;
	private static Scanner sc2;

	public static void main(String[] args) {

		DVDPlayer dp1 = new DVDPlayer();
		dp1.brend = "Sony";
		dp1.popular = "very good";
		dp1.price = 300;

		DVDPlayer dp2 = new DVDPlayer();
		dp2.brend = "Panasonic";
		dp2.popular = "good";
		dp2.price = 350;

		DVDPlayer dp3 = new DVDPlayer();
		dp3.brend = "Samsung";
		dp3.popular = "High";
		dp3.price = 250;

		sc = new Scanner(System.in);
		int vibor = 0;
		System.out.println("����� ����");
		vibor = sc.nextInt();

		if (vibor > 350) {
			System.out.println("������ ����� �� ��� ���� - " + dp2.brend);
		}
		 else if (vibor >260) {
			System.out.println("������ ����� �� ��� ���� - " + dp1.brend);
		}
		 else  {
			System.out.println("������ ����� �� ��� ���� - " + dp3.brend);

		}

		String vibor2;
		sc2 = new Scanner(System.in);
		System.out.println("��� �� ����� ������� ����� �� ������������:");
		vibor2 = sc2.next();

		if (vibor2.equals(dp1.popular)) {
			System.out.println("������ ������������ � �������� ����� Sony");
		}
		if (vibor2.equals(dp2.popular)) {
			System.out.println("������ ������������ � �������� ����� Panasonic");
		}
		if (vibor2.startsWith(dp3.popular)) {
			System.out.println("������ ������������ � �������� ����� Samsung");

		}
	}
}
