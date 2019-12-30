package ArrayZuoye;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//5.8 一个长度为5的数组，输入所有元素，判断这个数组中是否存在相同的元素，
//如果存在相同的元素则输出“有重复元素”，否则输出“没有重复元素”。

public class Zuoye08 {

	public static void main(String[] args) throws IOException {

		/*
		 * FileReader reader=new FileReader("src/ArrayZuoye/Zuoye08Secret.txt");
		 * //读取文件；引号中是文件路径，用"/"即可 char[] arr=new char[6]; //建立一个数组放密码 reader.read(arr);
		 * //读取文件中密码 String pwd=new String(); reader.close(); //关闭文件
		 */

		// 实现一个数组中元素重复与否判断
		// 已实现判断是否有相同元素
		// 未实现输出相同元素
		int[] a = new int[0];
		Scanner input = new Scanner(System.in);

		int[] b = Arrays.copyOf(a, 5);
		System.out.print("请输入5个整数：");
		for (int i = 0; i < 5; ++i) {
			b[i] = input.nextInt();
		}
		int k = 0;
		for1: for (int i = 0; i < b.length - 1; ++i) {
			for (int j = i + 1; j < b.length; ++j) {
				if ((b[i] == b[j])) {
					++k;
					System.out.println("存在相同元素：" + b[i]);
					continue for1; // 带标签的break、continue用法
				}
			}
		}
		if (k == 0) {
			System.out.println("不存在相同元素");
		}
	}
}
