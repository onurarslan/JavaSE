package OCJP;

import java.util.Scanner;

public class Chapter08_Application2 {

	public static void main(String[] args) {
		//ondalıklı 2 sayının girildiği 2 sayının toplamını yapan programı yazınız.
		//ondlaıklı kısmı göstermek için tam sayıdan sonra virügl konmaktadır.
		Scanner input=new Scanner(System.in);
		
		System.out.println("1. Number: ");
		double num1=input.nextDouble();
		
		System.out.println("2. Number: ");
		double num2=input.nextDouble();
		
		double sum=num1+num2;
		
		System.out.println("Sum: "+sum);

	}

}
