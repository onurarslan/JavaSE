package OCJP;

import java.util.Scanner;

public class Chapter06_Application1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//kullanıcıdan ismini alıp hoşgeldin isim yazan
		//kullanıcıdan aldığı 2 sayı aralığında ki sayıların çift ve tek olduklarını ekrana yazdıran programı yazalım
		Scanner input=new Scanner(System.in);
		System.out.print("Name: ");
		String name=input.next();
		System.out.println("Welcome "+name);
		
		System.out.print("First Number: ");
		int number1=input.nextInt();
		
		System.out.print("Second Number: ");
		int number2=input.nextInt();
		
		String message;
		for(int i=number1;i<number2;i++){
			if(i%2==0){ message="even";}
			else if(i%2==1){ message="odd";}
			else{ message="Error!";}
			System.out.println(i + ":" + message);
		}

	}

}
