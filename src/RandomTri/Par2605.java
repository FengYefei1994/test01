package RandomTri;

import java.util.Scanner;

public class Par2605 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] b=new int[10];
		int i=0;
		int sum=0;
		do {
			System.out.print("�������"+(i+1)+"��ֵ��");
			b[i]=scan.nextInt();
			sum+=b[i];
			++i;
		}while(i<10);
		scan.close();
		System.out.println("10�����ĺ��ǣ�"+sum);
	}
}
