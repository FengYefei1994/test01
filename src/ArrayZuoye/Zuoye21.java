package ArrayZuoye;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 5.21	����һ��4��4�еĶ�ά���飬����Ӽ�������ֵ��Ȼ�󽫵�1�к͵�4�е����ݽ��н�����
 * ����2�к͵�3�е����ݽ��н���
 */
public class Zuoye21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[][] a = new int[4][4];

		for (int i = 0; i < 4; ++i) {
			for (int j = 0; j < 4; ++j) {
				// a[i][j]=(int) (Math.random()*30);
				a[i][j] = scan.nextInt();
			}
		}
		scan.close();
		// ��������齻��ǰ
		for (int i = 0; i < 4; ++i) {
			System.out.println();
			for (int j = 0; j < 4; ++j) {
				System.out.print(a[i][j] + "\t");
			}
		}

		// ȡ�ɵķ����������ʱ�����������
		for (int i = 3; i >= 0; --i) {
			System.out.println();
			for (int j = 0; j < 4; ++j) {
				System.out.print(a[i][j] + "\t");
			}
		}

		// ��ֱ�ӵķ�������Ӧ����ֵ����
		/*
		 * //����1/4�У�2/3�н��� int[] c=new int[4]; int[] d=Arrays.copyOf(c, 4); for(int
		 * i=0;i<4;++i) { c[i]=a[0][i]; a[0][i]=a[3][i]; a[3][i]=c[i];
		 * 
		 * d[i]=a[1][i]; a[1][i]=a[2][i]; a[2][i]=d[i]; }
		 * 
		 * //������������� for(int i=0;i<4;++i) { System.out.println(); for(int j=0;j<4;++j) {
		 * System.out.print(a[i][j]+"\t"); } }
		 */
	}
}
