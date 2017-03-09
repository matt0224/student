package tw.iii.matt;

import java.util.Scanner;

public class matt030902 {

	public static void main(String[] args) {
	    int number1 = (int)(Math.random()*12+1);
	    System.out.println("輸入數字");
	    System.out.println(number1);
	    do{
	    	guess();
	    }while(number1 !=guess());  //只要不等於的話繼續做
	    System.out.println("猜對了");
	}
	    static int guess(){
		 System.out.println("請輸入一個1~5的數字");
		 Scanner number = new Scanner(System.in);
		 int numberguess = number.nextInt();
		 return numberguess;
		
	 }
	}

