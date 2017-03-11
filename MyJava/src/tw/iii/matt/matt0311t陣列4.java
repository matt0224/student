package tw.iii.matt;

public class matt0311t陣列4 {    //陣列跟文字都是物件

	public static void main(String[] args) {
		                                    //陣列三演變
		 int[]p =new int[6]; //0-5=>0
		for (int i=0 ;i<100;i++){
			int dice = (int)(Math.random()*6+1);  //1-6
			p[dice]++;
		
			}
		for (int i=0; i<p.length;i++){
			System.out.println((i+1)+"點出現"+p[i]+"次");
		}
	 }
	}

