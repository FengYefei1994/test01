package RandomTri;

import java.util.Scanner;

public class Par2604 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入一个值：");
		int a=scan.nextInt();
		scan.close();
		for(int i=0;i<=a;++i){
			System.out.println(i+"+"+(a-i)+"="+a);
		}
	}
}
