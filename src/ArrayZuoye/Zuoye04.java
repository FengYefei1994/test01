package ArrayZuoye;

import java.util.Scanner;

public class Zuoye04 {

	public static void main(String[] args) {
		// 5.4 ��������5�������������в���һ��ָ������

		Scanner scan = new Scanner(System.in);
		String[] array = new String[] { "����", "����", "����", "������", "����" };
		System.out.print("����������ҵ����֣�");
		String name = scan.next();
		scan.close();
		for (String j : array) {
			if (j.equals(name)) {
				System.out.println("��" + name + "����ˣ�");
				break;
			} else if (j.equals(array[array.length - 1])) {
				System.out.println("û��" + name + "����ˣ�");
			}
		}
	}

}
