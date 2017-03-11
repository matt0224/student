package tw.iii.matt;

public class matt0311ta07 {

	public static void main(String[] args) {
		 int[]p =new int[6]; //0-5=>0  //
			for (int i=0 ;i<100;i++){
				int dice = (int)(Math.random()*9);  //0-8  =>6,7,8要處理
			 //	p[(dice>=6)?dice-3:dice]++;        //三元運算式 // boolean 判斷  如果是值A否則值B 
				                                      
			   if(dice>=6){         //
			    p[dice-3]++ ;}
				   else{
				     p[dice]++;
			   }
			   }
				
			for (int i=0; i<p.length;i++){
				System.out.println((i+1)+"點出現"+p[i]+"次");
			}

	 }
	}

