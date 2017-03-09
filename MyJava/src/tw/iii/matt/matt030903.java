package tw.iii.matt;

public class matt030903 {

	public static void main(String[] args) {
		for(int k=0; k<=1; k++){
			for (int y=1; y<=9; y++){
				for (int i=2; i<=5 ; i++){
					int newi = i+ k*4;
					int result = newi*y ;
					System.out.print(newi+"*"+y+"="+result+"\t");
				}
		        System.out.println();
			  }
			System.out.println("-------------------");
		}
		
	}

}
