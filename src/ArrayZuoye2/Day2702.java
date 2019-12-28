package ArrayZuoye2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 二、	有一个数列：8，4，2，1，23，344，12
a)	循环输出数列的值
b)	求数列中所有数值的和
c)	猜数游戏：从键盘中任意输入一个数据，判断数列中是否包含此数

 */
public class Day2702 {

	public static void main(String[] args) {
		
		int[] a= {8,4,2,1,23,344,12};
		
		//输出数组元素
		System.out.print("数组元素为：");
		System.out.println(Arrays.toString(a));
		
		//数列所有元素和
		int sum=0;
		for(int b:a) {
			sum+=b;
		}
		System.out.println("元素和为："+sum);
		
		
		//猜键盘输入的值是否在数组中
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int c=scan.nextInt();
		scan.close();
		int i=0;
		for1:for(int b:a) {
			if(b==c) {
				System.out.println("有相同元素："+c);
				++i;
				break for1;
			}
		}
		while(i==0) {
			System.out.println("无相同元素");
			break;
		}
	}
}
