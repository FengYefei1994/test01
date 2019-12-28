package ArrayZuoye2;
/*
 * 一、	计算全班（30人）的平均分
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
		System.out.println("30人的平均成绩是："+aver);
	}

}
