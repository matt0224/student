package tw.iii.matt;

public class matt0311t陣列 {    //陣列跟文字都是物件

	public static void main(String[] args) {
		  int [] a;      //整數陣列變數名稱是a代表整數陣列  
		  int b[];      //兩個宣告都可以但建議用A
		  int [] d = new int[4];
		  int [] e = new int[]{1,2,3,4} ;     	///宣告同時給值
		  int [] f ={1,2,3,4};
		  
		  int[]g;
		  g= new int[]{1,2,3,4} ;
				  
		  
		  a = new int[3] ;               //看到NEW都是物件  陣列 的3個元素都是int ;記憶體都是線性 a裝的是記憶體的位址
		                                 //記憶體是偏移 第一個是0 沒有偏移 第二個偏離1個位置
		  System.out.println(a.length);   //看到元素長度
		  for (int i=0 ;i<a.length;i++){     ///執行0.1.2 陣列
			 System.out.println(a[i]);    //預設的"值是0,0,0" 
		  }
		
	}

}
