package ArrayZuoye2;

import java.util.Arrays;
import java.util.Scanner;

/*
 *五、循环录入5位学员成绩，进行升序排列后输出结果，
 *使用java.util.Arrays类的sort()方法
 */
public class Day2705 {

	public static void main(String[] args) {
		
		int[] a= new int[5];
		System.out.println("请输入5个学生成绩：");
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<5;++i) {
			System.out.print("请输入第"+(1+i)+"个学生成绩：");
			a[i]=scan.nextInt();
		}
		scan.close();
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		

	}

}
