package ArrayZuoye2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * ����	��һ�����У�8��4��2��1��23��344��12
a)	ѭ��������е�ֵ
b)	��������������ֵ�ĺ�
c)	������Ϸ���Ӽ�������������һ�����ݣ��ж��������Ƿ��������

 */
public class Day2702 {

	public static void main(String[] args) {
		
		int[] a= {8,4,2,1,23,344,12};
		
		//�������Ԫ��
		System.out.print("����Ԫ��Ϊ��");
		System.out.println(Arrays.toString(a));
		
		//��������Ԫ�غ�
		int sum=0;
		for(int b:a) {
			sum+=b;
		}
		System.out.println("Ԫ�غ�Ϊ��"+sum);
		
		
		//�¼��������ֵ�Ƿ���������
		Scanner scan=new Scanner(System.in);
		System.out.print("������һ��������");
		int c=scan.nextInt();
		scan.close();
		int i=0;
		for1:for(int b:a) {
			if(b==c) {
				System.out.println("����ͬԪ�أ�"+c);
				++i;
				break for1;
			}
		}
		while(i==0) {
			System.out.println("����ͬԪ��");
			break;
		}
	}
}
