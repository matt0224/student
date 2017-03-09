package tw.iii.matt;

public class matt030904 {

	public static void main(String[] args) {
		int[] point= new int[6]; //0-5
		for(int i=0; i<100; i++){
		point[(int)(Math.random()*6)]++;

	}
     for (int i=0 ; i<point.length;i++){
    	 System.out.println((i+1)+"ÂI¬Û¥["+point[i]);
     }
}
}