package tw.iii.matt;

public class matt0311tapokerv1 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();  //處理時間的秒速
		  int[] poker = new int[52] ; //0-51
		  for (int i=0 ; i<52 ; i++){
			  int temp = (int) (Math.random()*52);
			  //檢查機制  是否有重複
			 boolean isRepeat = false;
			  for(int j=0; j<i;j++){           //檢查前面是否跟I重複
				  if (poker[j]==temp){
					  isRepeat = true;
					  break;        //這關如果沒過就是錯的 跳出
				  }
			  }
			  if(!isRepeat){
				  poker[i] =temp;
				 System.out.println(poker[i]);
			  }else{
				  i--;    //重複的部分再進去跑
				  
			  }
			
		  }
        System.out.println(System.currentTimeMillis()-start);
	}

}
