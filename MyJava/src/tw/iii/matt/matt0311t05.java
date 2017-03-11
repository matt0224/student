package tw.iii.matt;

public class matt0311t05 {

	public static void main(String[] args) {
		  int a = 10 ;
		  int   b = 10;                       //除非這邊變成  final int b=12 在Case b:
		  // switch()基本型別當中 int內 byte127, short ,int, char
		  switch (a){
			  case 1:                          //case 這邊不能擺CASE b:
				  System.out.println("a");     
				  break ;                      //break 可以省略
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
