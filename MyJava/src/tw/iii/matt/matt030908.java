package tw.iii.matt;

public class matt030908 {

	public static void main(String[] args) {
		
		for (int y=2; y<=5; y++){
			boolean  x = true ;
				for (int i=2; i<y ; i++){
					if (y%i==0){
					x = false;
					  break;
					  }
				}
					  if (x) {
						  System.out.println(y+" ");
					
				}
				
			}
			
		}
	}

