package ArrayZuoye;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 基础Java升级中级Java案例题
 */
public class UpLevel {

	public static void main(String[] args) {

		String[] names = new String[0]; // 学员姓名
		int[] ages = new int[0]; // 学员年龄
		String[] teams = new String[0]; // 战队名称
		String[] types = new String[0]; // 学员类型

		// 默认信息
		names = Arrays.copyOf(names, names.length + 5);
		ages = Arrays.copyOf(ages, ages.length + 5);
		teams = Arrays.copyOf(teams, teams.length + 5);
		types = Arrays.copyOf(types, types.length + 5);

		types[0] = "流行音乐";
		names[0] = "吉克隽逸";
		ages[0] = 23;
		teams[0] = "汪峰战队";

		types[1] = "古典音乐";
		names[1] = "张碧晨";
		ages[1] = 22;
		teams[1] = "那英战队";

		types[2] = "摇滚音乐";
		names[2] = "刘安琪";
		ages[2] = 28;
		teams[2] = "杰伦战队";

		types[3] = "古典音乐";
		names[3] = "梁博";
		ages[3] = 21;
		teams[3] = "那英战队";

		types[4] = "古典音乐";
		names[4] = "毛不易";
		ages[4] = 26;
		teams[4] = "哈林战队";

		Scanner scan = new Scanner(System.in);
		int num1;
		do {
			// 所有信息
			System.out.println("\n" + "---------欢迎来到唐城好声音---------\n");
			System.out.println("1、显示所有学员信息");
			System.out.println("2、根据年龄从小到大排列");
			System.out.println("3、随机观看学员技能展示");
			System.out.println("4、删除学员");
			System.out.println("5、添加学员");
			System.out.println("0、退出\n");
			// 请用户选择
			System.out.print("请用户输入选择：");
			num1 = scan.nextInt();
			// 验证输入的值是OK的
			for1: for (;;) {
				if (num1 >= 0 && num1 <= 5) {
					break;
				} else {
					System.out.print("输入错误，请用户输入选择：");
					num1 = scan.nextInt();
					continue for1;
				}
			}
			System.out.println();

			// 根据用户输入进行功能选择
			switch (num1) {

			case 1: // 1、显示所有学员信息
				
				if (names.length == 0) {
					System.out.println("无任何学员信息！");
					break;
				}
				
				for (int i = 0; i < names.length; ++i) {
					if (names[i] != null) {
						System.out.println(
								"学员类型：" + types[i] + "\t姓名：" + names[i] + "\t\t年龄：" + ages[i] + "\t\t战队：" + teams[i]);
					}
				}
				break;

			case 2: // 2、根据年龄从小到大排列
				
				if (names.length == 0) {
					System.out.println("无任何学员信息可供排序！");
					break;
				}
				
				for (int i = 0; i < ages.length - 1; ++i) {
					for (int j = 0; j < ages.length - 1 - i; ++j) {
						if (ages[j] > ages[j + 1]) {

							// 学员类型更换位置
							String tmp1 = types[j + 1];
							types[j + 1] = types[j];
							types[j] = tmp1;

							// 姓名更换位置
							String tmp2 = names[j + 1];
							names[j + 1] = names[j];
							names[j] = tmp2;

							// 年龄更换位置
							int tmp3 = ages[j + 1];
							ages[j + 1] = ages[j];
							ages[j] = tmp3;

							// 战队更换位置
							String tmp4 = teams[j + 1];
							teams[j + 1] = teams[j];
							teams[j] = tmp4;
						}
					}
				}

				break;
			case 3: // 3、随机观看学员技能展示
				
				if (names.length == 0) {
					System.out.println("无任何学员信息！");
					break;
				}
				
				int i = (int) (Math.random() * 5 + 1);
				System.out.println("现在展示的是第" + i + "号学员信息：");
				System.out.println("学员类型：" + types[i - 1] + "\t姓名：" + names[i - 1] + "\t\t年龄：" + ages[i - 1] + "\t\t战队："
						+ teams[i - 1]);

				break;
			case 4: // 4、删除学员
				// 加入删除限制——无任何学员时，提示无学员，跳出case

				if (names.length == 0) {
					System.out.println("已无任何学员，无法删除！");
					break;
				}

				int numd = 0;
				do {
					for (int i1 = 0; i1 < types.length; ++i1) {
						System.out.println("序号：" + (1 + i1) + "\t\t学员类型：" + types[i1] + "\t姓名：" + names[i1] + "\t\t年龄："
								+ ages[i1] + "\t\t战队：" + teams[i1]);
					}
					System.out.println("请输入想要删除的学员序号：");
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

			case 5: // 5、添加学员
				types = Arrays.copyOf(types, types.length + 1);
				ages = Arrays.copyOf(ages, ages.length + 1);
				names = Arrays.copyOf(names, names.length + 1);
				teams = Arrays.copyOf(teams, teams.length + 1);

				System.out.print("请输入想要添加的学员姓名：");
				String namea = scan.next();
				for1: for (int k = 0; k < types.length; ++k) {
					if (namea.equals(names[k])) {
						System.out.print("该学员已存在，请重新输入想要添加的学员姓名：");
						namea = scan.next();
						continue for1;
					} else {
						names[names.length - 1] = namea;
						System.out.print("请输入学员类型：");
						types[types.length - 1] = scan.next();

						System.out.print("请输入学员年龄：");
						ages[ages.length - 1] = scan.nextInt();

						System.out.print("请输入学员战队：");
						teams[teams.length - 1] = scan.next();
						break for1;
					}
				}

				System.out.println("添加学员成功！");
				for (int m = 0; m < names.length; ++m) {
					if (names[m] != null) {
						System.out.println(
								"学员类型：" + types[m] + "\t姓名：" + names[m] + "\t\t年龄：" + ages[m] + "\t\t战队：" + teams[m]);
					}
				}

				break;

			case 0: // 退出
				break;

			default: // 退出
				break;
			}

		} while (num1 > 0 && num1 <= 5);
		scan.close();
	}
}
