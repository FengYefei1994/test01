package ArrayZuoye;

/*5.15	ʹ���������һ������Ϊ10���������鸳ֵ,Ȼ��������һ�������㷨��10����������
 * �������Ե����ֳɵ����򷽷�����
*/
public class Zuoye15 {

	public static void main(String[] args) {
		int[] a = new int[10];

		for (int i = 0; i < a.length - 1; ++i) {
			a[i] = (int) (Math.random() * 10);
		}
		System.out.print("������飺");
		for (int b : a) {
			System.out.print(b + "��");
		}
		System.out.println();
		// ð��
		for (int i = 1; i < 10; ++i) {
			for (int j = 0; j < a.length - 1; ++j) {
				if (a[j] > a[j + 1]) {
					int tmp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = tmp;
				}
			}
		}

		System.out.print("��������飺");
		for (int b : a) {
			System.out.print(b + "��");
		}
	}
}
