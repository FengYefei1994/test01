package ArrayZuoye2;

import java.util.Scanner;

public class ArraysTwo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�м����ࣺ");
		int classcount =input.nextInt();                          //������������������ѧ������
		String[][] names=new String[classcount][];                //names�ĳ�����ʵ�����ά�ĳ��ȣ�Ҳ���ǰ༶����Ҳ����classCount
		for(int i=0;i<names.length;++i) {
			System.out.println("��"+(i+1)+"�����ж��ٸ��ˣ�");
			int studentcount =input.nextInt();
			names[i]=new String[studentcount];
		}
		
		for(int i=0;i<names.length;++i) {
			for(int j=0;j<names[i].length;++j) {                 //���嵽�ڼ����������    ������[����].length    ��ʾ
				names[i][j]=(i+1)+"��"+(j+1)+"ѧԱ";
			}
		}
		
		int lostTotal=0;//���а����ȱ������
		int countTotal = 0;//���а��������
		for (int i = 0; i < names.length; i++) {
			int lost = 0;//��i��ȱ������
			System.out.println((i+1)+"�࿪ʼ����------------------------------------");
			for (int j = 0; j < names[i].length; j++) {
				System.out.print(names[i][j]+"�Ƿ�y/n��");
				String answer = input.next();
				if (answer.equals("n")) {
					lost++;
				}
			}
			System.out.println((i+1)+"���������------------------------------------\n");
			System.out.println((i+1)+"�࿼�ڽ����");
			System.out.println("Ӧ��������"+names[i].length);
			System.out.println("ʵ��������"+(names[i].length-lost));
			double rate = (double)(names[i].length-lost)/names[i].length;
			System.out.println("�����ʣ�"+rate*100+"%");
			lostTotal += lost;
			countTotal+= names[i].length;
		}
		System.out.println("\n\n*****************�ܵĿ��ڽ��*****************");
		System.out.println("Ӧ��������"+countTotal);
		System.out.println("ʵ��������"+(countTotal-lostTotal));
		double rate = (double)(countTotal-lostTotal)/countTotal;
		System.out.println("�����ʣ�"+rate*100+"%");

		input.close();
	}

}
