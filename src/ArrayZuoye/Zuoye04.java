package ArrayZuoye;

import java.util.Scanner;

public class Zuoye04 {

	public static void main(String[] args) {
		// 5.4 任意输入5个人名，在其中查找一个指定的人

		Scanner scan = new Scanner(System.in);
		String[] array = new String[] { "张三", "李四", "网二", "李麻子", "王五" };
		System.out.print("请输入想查找的名字：");
		String name = scan.next();
		scan.close();
		for (String j : array) {
			if (j.equals(name)) {
				System.out.println("有" + name + "这个人！");
				break;
			} else if (j.equals(array[array.length - 1])) {
				System.out.println("没有" + name + "这个人！");
			}
		}
	}

}
