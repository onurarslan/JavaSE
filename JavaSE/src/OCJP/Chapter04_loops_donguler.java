package OCJP;

import java.util.Scanner;

public class Chapter04_loops_donguler {

	public static void main(String[] args) {
		//while döngüsü belirtilen şart sağlanana kadar blok içerisinde ki kodların çalıştırılmasını sağlar.
		int number=10;//number değişkenine 10 sayısı atandı
		while(number>0){//number değişkeni 0'dan büyük olduğu sürece döngü bloğu çalışsın
			System.out.print(number-- + " ");//number değişkeninin değerini bir azalt ve ekrana yaz
		}
		System.out.println();
		
		int sayi1=200, sayi2=100;//sayi1 ve sayi2 tam sayı tipinde değişkenlere sayılar atandı
		while(--sayi1>++sayi2);//orta noktayı bulur. sayi1 azaltır ve sayi2yi arttırır şart sağlanmadığında orta nokta buulnmuş olur.
		System.out.println("i="+sayi1+"j="+sayi2);
		System.out.println();
		
		//////////////////////////////////////////////////////////////
		// do-while döngüsünde şart ne olursa olsun bir kere döngü içerisine girdikten sonra while içerisinde ki şarta göre döngü devam eder yada durur
		int buyukSayi=0;
		Scanner scan=new Scanner(System.in);//Scanner sınıfı ile klavyeden giriş yapılması sağlanır.
		do{//while kontrol edilmeden ilk olarak burayı çalıştır
			System.out.print("100'den büyük sayı giriniz: ");//ekrana çıktı verir
			buyukSayi=scan.nextInt();//klavyeden girilen sayıyı integer tipine çevirerek buyukSayi değişkenine atar
		}while(buyukSayi<100);//en son while şartı kontrol edilir.
		/////////////////////////////////////////////////////
		
		//for döngüsünde ilk noktalı birgül öncesinde bir bşalangıç değeri verilir.
		//ikinci kısmında şart yazılır
		//üçüncü kısımda şartın sağlanması durumunda döngü değeri arttırılır yada azaltılır
		for(int i=0;i<50;i++){//döngünün başlangıç değeri 0'dır. 0 sayısı 50'den küçük olduğu sürece döngü döner ve i değişkenin değeri 1 artar.
			if(i%2==0){//% ifadesi mod yani kalanı verir. kalanlar 0'a eşit ise yani çift ise ekrana yazdırır
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		int sayi=2;//sayi değişkenine 2 sayısı atanır.
		for (;sayi!=6;) {//sayi değişkeni 6'ya  eşit olmadığı sürece 1 arttırılır.
			System.out.println(sayi++);
		}
		
		int[] sayilar={1,25,59,68,19,25,146};//sayilar dizisi
		for (int i : sayilar) {//sayilar dizisinin her elemanı sıra ile i değişkenine atanır ve blok içersine girer. dizinin tipi integer olduğu için i değişkeni tipide integerdır.
			System.out.print(i+ " ");
		}
		
		

	}

}
