package ArrayZuoye;

import java.util.Scanner;

/*һ�������ɴ�С���еĳ���Ϊ6�����飨85,63,49,22,10����
�������һ��Ԫ��û�и�ֵ������Ҫ����һ����ֵ���������У�
�Ա��������е����ݰ����ɴ�С���С��������ǰ�������Ԫ��
*/
public class Zuoye10 {

	public static void main(String[] args) {
		int[] arr = { 85, 63, 49, 22, 10, 0 };
		Scanner scan = new Scanner(System.in);
		System.out.print("������Ҫ�����Ԫ�أ�");
		int num = scan.nextInt();
		arr[5] = num;
		scan.close();
		for (int i = 5; i > 0; --i) {
			int tmp = 0;
			if (arr[i] > arr[i - 1]) {
				tmp = arr[i - 1];
				arr[i - 1] = arr[i];
				arr[i] = tmp;
			}
		}
		for (int i = 0; i < arr.length; ++i) {
			if (num == arr[i]) {
				System.out.println("����ǰһ��Ԫ���ǣ�" + arr[i - 1]);
				System.out.println("�����һ��Ԫ���ǣ�" + arr[i + 1]);
			}
		}
	}
}
