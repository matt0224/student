package tw.iii.matt;

import java.util.Scanner;

public class matt030902 {

	public static void main(String[] args) {
	    int number1 = (int)(Math.random()*12+1);
	    System.out.println("��J�Ʀr");
	    System.out.println(number1);
	    do{
	    	guess();
	    }while(number1 !=guess());  //�u�n�����󪺸��~��
	    System.out.println("�q��F");
	}
	    static int guess(){
		 System.out.println("�п�J�@��1~5���Ʀr");
		 Scanner number = new Scanner(System.in);
		 int numberguess = number.nextInt();
		 return numberguess;
		
	 }
	}

