package ArrayZuoye2;
/*
 * һ��	����ȫ�ࣨ30�ˣ���ƽ����
 */
public class Day2701 {

	public static void main(String[] args) {
		
		double[] score=new double[30];
		for(int i=0;i<score.length;++i) {
			score[i]=(int) (Math.random()*100+1);
		}
		double sum=0.0D;
		double aver=0.0D;
		for(double a:score) {
			sum+=a;
		}
		aver=sum/score.length;
		System.out.println("30�˵�ƽ���ɼ��ǣ�"+aver);
	}

}
