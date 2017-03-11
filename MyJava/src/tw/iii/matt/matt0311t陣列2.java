package tw.iii.matt;

public class matt0311t陣列2 {    //陣列跟文字都是物件

	public static void main(String[] args) {
		int p1, p2, p3, p4,p5,p6;
		 p1= p2= p3= p4=p5=p6=0 ;
		for (int i=0 ;i<10;i++){
			int dice = (int)(Math.random()*6+1);  //1-6
			switch(dice){
			case p1: p1++ ; break;
			case p2: p2++ ; break;
			case p3: p3++ ; break;
			case p4: p4++ ; break;
			case p5: p5++ ; break;
			case p6: p6++ ; break;
			  System.out.println("XXX"); break;
		
			}
		}
		
	//	System.out.println(點述幾點);
	}

}
