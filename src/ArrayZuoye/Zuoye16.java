package ArrayZuoye;

public class Zuoye16 {

	/*
	 * 5.16 ������һ��������ת�ɶ����ƣ���ʾ��ʮ����ת�ɶ����Ƶķ����ǳ�2ȡ�࣬ ���Խ���������һ��32����int�����У����������
	 */
	public static void main(String[] args) {
		int a = (int) (Math.random() * 100);
		int[] b = new int[32];
		System.out.println(a);
		for (int i = 0; i < 32; ++i) {
			b[i] = a % 2;
			a = a / 2;
		}
		for (int i = 31; i > 0; --i) {
			if (b[i] == 1) {
				for (; i >= 0; --i) {
					System.out.print(b[i]);
				}
				break;
			}
		}
	}
}
