package ArrayZuoye;

import java.util.Arrays;
import java.util.Scanner;

/*
 * ����Java�����м�Java������
 */
public class UpLevel {

	public static void main(String[] args) {

		String[] names = new String[0]; // ѧԱ����
		int[] ages = new int[0]; // ѧԱ����
		String[] teams = new String[0]; // ս������
		String[] types = new String[0]; // ѧԱ����

		// Ĭ����Ϣ
		names = Arrays.copyOf(names, names.length + 5);
		ages = Arrays.copyOf(ages, ages.length + 5);
		teams = Arrays.copyOf(teams, teams.length + 5);
		types = Arrays.copyOf(types, types.length + 5);

		types[0] = "��������";
		names[0] = "��������";
		ages[0] = 23;
		teams[0] = "����ս��";

		types[1] = "�ŵ�����";
		names[1] = "�ű̳�";
		ages[1] = 22;
		teams[1] = "��Ӣս��";

		types[2] = "ҡ������";
		names[2] = "������";
		ages[2] = 28;
		teams[2] = "����ս��";

		types[3] = "�ŵ�����";
		names[3] = "����";
		ages[3] = 21;
		teams[3] = "��Ӣս��";

		types[4] = "�ŵ�����";
		names[4] = "ë����";
		ages[4] = 26;
		teams[4] = "����ս��";

		Scanner scan = new Scanner(System.in);
		int num1;
		do {
			// ������Ϣ
			System.out.println("\n" + "---------��ӭ�����ƳǺ�����---------\n");
			System.out.println("1����ʾ����ѧԱ��Ϣ");
			System.out.println("2�����������С��������");
			System.out.println("3������ۿ�ѧԱ����չʾ");
			System.out.println("4��ɾ��ѧԱ");
			System.out.println("5�����ѧԱ");
			System.out.println("0���˳�\n");
			// ���û�ѡ��
			System.out.print("���û�����ѡ��");
			num1 = scan.nextInt();
			// ��֤�����ֵ��OK��
			for1: for (;;) {
				if (num1 >= 0 && num1 <= 5) {
					break;
				} else {
					System.out.print("����������û�����ѡ��");
					num1 = scan.nextInt();
					continue for1;
				}
			}
			System.out.println();

			// �����û�������й���ѡ��
			switch (num1) {

			case 1: // 1����ʾ����ѧԱ��Ϣ
				
				if (names.length == 0) {
					System.out.println("���κ�ѧԱ��Ϣ��");
					break;
				}
				
				for (int i = 0; i < names.length; ++i) {
					if (names[i] != null) {
						System.out.println(
								"ѧԱ���ͣ�" + types[i] + "\t������" + names[i] + "\t\t���䣺" + ages[i] + "\t\tս�ӣ�" + teams[i]);
					}
				}
				break;

			case 2: // 2�����������С��������
				
				if (names.length == 0) {
					System.out.println("���κ�ѧԱ��Ϣ�ɹ�����");
					break;
				}
				
				for (int i = 0; i < ages.length - 1; ++i) {
					for (int j = 0; j < ages.length - 1 - i; ++j) {
						if (ages[j] > ages[j + 1]) {

							// ѧԱ���͸���λ��
							String tmp1 = types[j + 1];
							types[j + 1] = types[j];
							types[j] = tmp1;

							// ��������λ��
							String tmp2 = names[j + 1];
							names[j + 1] = names[j];
							names[j] = tmp2;

							// �������λ��
							int tmp3 = ages[j + 1];
							ages[j + 1] = ages[j];
							ages[j] = tmp3;

							// ս�Ӹ���λ��
							String tmp4 = teams[j + 1];
							teams[j + 1] = teams[j];
							teams[j] = tmp4;
						}
					}
				}

				break;
			case 3: // 3������ۿ�ѧԱ����չʾ
				
				if (names.length == 0) {
					System.out.println("���κ�ѧԱ��Ϣ��");
					break;
				}
				
				int i = (int) (Math.random() * 5 + 1);
				System.out.println("����չʾ���ǵ�" + i + "��ѧԱ��Ϣ��");
				System.out.println("ѧԱ���ͣ�" + types[i - 1] + "\t������" + names[i - 1] + "\t\t���䣺" + ages[i - 1] + "\t\tս�ӣ�"
						+ teams[i - 1]);

				break;
			case 4: // 4��ɾ��ѧԱ
				// ����ɾ�����ơ������κ�ѧԱʱ����ʾ��ѧԱ������case

				if (names.length == 0) {
					System.out.println("�����κ�ѧԱ���޷�ɾ����");
					break;
				}

				int numd = 0;
				do {
					for (int i1 = 0; i1 < types.length; ++i1) {
						System.out.println("��ţ�" + (1 + i1) + "\t\tѧԱ���ͣ�" + types[i1] + "\t������" + names[i1] + "\t\t���䣺"
								+ ages[i1] + "\t\tս�ӣ�" + teams[i1]);
					}
					System.out.println("��������Ҫɾ����ѧԱ��ţ�");
					numd = scan.nextInt();
				} while (!(1 <= numd && numd <= names.length));
				for (int k = numd - 1; k < types.length - 1; ++k) {
					types[k] = types[k + 1];
					ages[k] = ages[k + 1];
					names[k] = names[k + 1];
					teams[k] = teams[k + 1];
				}
				types = Arrays.copyOf(types, types.length - 1);
				ages = Arrays.copyOf(ages, ages.length - 1);
				names = Arrays.copyOf(names, names.length - 1);
				teams = Arrays.copyOf(teams, teams.length - 1);
				break;

			case 5: // 5�����ѧԱ
				types = Arrays.copyOf(types, types.length + 1);
				ages = Arrays.copyOf(ages, ages.length + 1);
				names = Arrays.copyOf(names, names.length + 1);
				teams = Arrays.copyOf(teams, teams.length + 1);

				System.out.print("��������Ҫ��ӵ�ѧԱ������");
				String namea = scan.next();
				for1: for (int k = 0; k < types.length; ++k) {
					if (namea.equals(names[k])) {
						System.out.print("��ѧԱ�Ѵ��ڣ�������������Ҫ��ӵ�ѧԱ������");
						namea = scan.next();
						continue for1;
					} else {
						names[names.length - 1] = namea;
						System.out.print("������ѧԱ���ͣ�");
						types[types.length - 1] = scan.next();

						System.out.print("������ѧԱ���䣺");
						ages[ages.length - 1] = scan.nextInt();

						System.out.print("������ѧԱս�ӣ�");
						teams[teams.length - 1] = scan.next();
						break for1;
					}
				}

				System.out.println("���ѧԱ�ɹ���");
				for (int m = 0; m < names.length; ++m) {
					if (names[m] != null) {
						System.out.println(
								"ѧԱ���ͣ�" + types[m] + "\t������" + names[m] + "\t\t���䣺" + ages[m] + "\t\tս�ӣ�" + teams[m]);
					}
				}

				break;

			case 0: // �˳�
				break;

			default: // �˳�
				break;
			}

		} while (num1 > 0 && num1 <= 5);
		scan.close();
	}
}
