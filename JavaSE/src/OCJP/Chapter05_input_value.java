package OCJP;

import java.util.Scanner;//Scanner sınıfı burada eklenmelidir

public class Chapter05_input_value {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);//System.in ifadesi ile klavyeden girilen değerli tutar
		System.out.print("Name: ");
		String name=input.next();//String tipinde değer alır
		System.out.println("Welcome "+name);
		
		System.out.print("First Number:");
		int number1=input.nextInt();//integer tipinde değer alır
		System.out.print("Second Number: ");
		int number2=input.nextInt();
		int sum=number1+number2;
		System.out.println("Sum: "+sum);
	}

}
