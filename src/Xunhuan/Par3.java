package Xunhuan;

import java.util.Scanner;

public class Par3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("����һ��������������������Χ��");
		int c=scan.nextInt();
		int count=0;
		System.out.print(c+"���ڵ������ǣ�");
		for(int i=2;i<=c;++i) {
		if(Par31.isPrimeNormal(i)) {
			System.out.print(i+"��");
			++count;
		}
		}
		System.out.println();
		System.out.print(c+"������������"+count);
		scan.close();
	}
}
