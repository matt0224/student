package tw.iii.matt;

import javax.swing.JOptionPane; //����JOP ATL+/�۰ʥX�{

public class matt031103 {

	public static void main(String[] args) {    //�o��q�`���|�ܦh����
	      String input = JOptionPane.showInputDialog("��J�~");   // ��ܮ�
		
	     // int year = 2017;                    //�o��O�򥻫��O
	      int year = Integer.parseInt(input);    //�qapi�� �q�r��Ǧ^int  valueof�O�Ǧ^����Ǧ^integer
	      
	      if(year%4==0){
	    	  if (year%100==0){
	    		  if(year%400==0){                     //�������iif �̭� 
	    			  //29                        
	    		  }else{
	    			  //28 
	    		  }
	    		                                  
	    	  
	    	  }else{
	    		  //29    // 
	    	  }
	    	  
	      }else{
	    	  // 28       //1 ����28��                              //�j�����~�������b/4
	    	  
	      }
		  

	}
}
