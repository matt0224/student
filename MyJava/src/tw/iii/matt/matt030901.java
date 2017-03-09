package tw.iii.matt;

public class matt030901 {

	public static void main(String[] args) {
		int sum = 0 ;
		int i = 1;
		do{
			sum += i++;  // 0+1 sum=1  後側 先做do一次
			
		}while(i<=10);
		System.out.println("1+2+...10"+sum);

	}

}
