package tw.iii.matt;

public class matt0311t05 {

	public static void main(String[] args) {
		  int a = 10 ;
		  int   b = 10;                       //���D�o���ܦ�  final int b=12 �bCase b:
		  // switch()�򥻫��O�� int�� byte127, short ,int, char
		  switch (a){
			  case 1:                          //case �o�䤣���\CASE b:
				  System.out.println("a");     
				  break ;                      //break �i�H�ٲ�
			  case 10:
				   System.out.println("b");    //
					  break ; 
					
			  case 65536 :
				      System.out.println("c");
						
				default :
					System.out.println("d");
					break ;   
		  }

	}

}
