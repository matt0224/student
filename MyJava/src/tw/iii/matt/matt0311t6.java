package tw.iii.matt;

public class matt0311t6 {

	public static void main(String[] args) {
		  int  month = 13;// (int)(Math.random()*11+1);
		  System.out.println(month);	  
		switch(month){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			  System.out.println(31);
		 // break;
			  default:
				 System.out.println("XX");  
		case 4: case 6: case 9: case 11:   //有default 值是o 找到
			  System.out.println(27);      //sysout 執行找到break 跳出去
		  break;
		case 2:  
			  System.out.println(28);
		  break;     
		                            //default: 只要是用在例外處理   /
		  }

	}
}
