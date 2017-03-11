package tw.iii.matt;

public class matt0311t99 {

	public static void main(String[] args) {
		 int result ;
		 for(int k=0 ; k<2 ; k++){ //2代表兩個橫列
			 for(int j=1; j<=9 ; j++){
				 for(int i=2 ; i<=5 ; i++){   //\t隔開字元 一列有4個 2.3.4.5 所以才*4
					 int newi = i+k*4;   //因為一列有4個  因為第一圈k是o 第二圈才會執行
					 result= newi*j ;
					
				  System.out.print(newi+"* "+j+" ="+result+"\t");
				 }
				 System.out.println();
			 }
			 System.out.println("---------------------------------------");
	  }	 
	}

}
