package tw.iii.matt;

import javax.swing.JOptionPane; //執行JOP ATL+/自動出現

public class matt031103 {

	public static void main(String[] args) {    //這邊通常不會很多城市
	      String input = JOptionPane.showInputDialog("輸入年");   // 對話框
		
	     // int year = 2017;                    //這邊是基本型別
	      int year = Integer.parseInt(input);    //從api看 從字串傳回int  valueof是傳回物件傳回integer
	      
	      if(year%4==0){
	    	  if (year%100==0){
	    		  if(year%400==0){                     //全部插進if 裡面 
	    			  //29                        
	    		  }else{
	    			  //28 
	    		  }
	    		                                  
	    	  
	    	  }else{
	    		  //29    // 
	    	  }
	    	  
	      }else{
	    	  // 28       //1 先找28天                              //大部分年分都落在/4
	    	  
	      }
		  

	}
}
