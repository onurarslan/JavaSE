package OCJP;

import java.util.Random;

public class Chapter11_Arrays_Diziler {

	public static void main(String[] args) {
		//arrays(tek boyutlu diziler)
		//günleri yazan program
		String gunler[]={"Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"};
		System.out.println("Haftanın İlk Günü: "+gunler[0]);

		//ayları yazan program
		String aylar[];
		aylar=new String[12];
		aylar[0]="Ocak";
		aylar[1]="Şubat";
		aylar[2]="Mart";
		aylar[3]="Nisan";
		aylar[4]="Mayıs";
		aylar[5]="Haziran";
		aylar[6]="Temmuz";
		aylar[7]="Ağustos";
		aylar[8]="Eylül";
		aylar[9]="Ekim";
		aylar[10]="Kasım";
		aylar[11]="Aralık";
		
		System.out.println("Yaz Mevsiminin İlk Ayı: "+aylar[5]);
		
		//mevsimleri yazan program
		String[] mevsimler=new String[4];
		mevsimler[0]="Sonbahar";
		mevsimler[1]="Kış";
		mevsimler[2]="İlkbahar";
		mevsimler[3]="Yaz";
		
		System.out.println("Yılın ilk ayı olan "+aylar[0]+" ayının mevsimi "+mevsimler[1]+" mevsimidir.");
		
		//hfatanın günlerini rakam ile yazan program
		int[] gunSayisi=new int[7];
		for(int i=0;i<7;i++) gunSayisi[i]=i+1;
		System.out.println("-----Haftanın Günleri------");
		for(int i=0;i<7;i++){
			System.out.println(gunSayisi[i]+". "+gunler[i]);
		}

		//multiarrays(çok boyutlu diziler) genelde matris işlemleri yapılır
		System.out.println("\n-----Çarpım Tablosu---");
		int carpimTablosu[][]=new int[10][10];//ilk 10 satır sayısını ikinci 10 sütunsayısını tanımlar.
		int birinciSayi=1;
		int ikinciSayi=1;
		for(int i=0;i<10;i++){//satır
			for(int j=0;j<10;j++){//sütun
				carpimTablosu[i][j]=birinciSayi*ikinciSayi;
				System.out.println(birinciSayi+" * "+ikinciSayi+" = "+carpimTablosu[i][j]);
				ikinciSayi++;
			}
			ikinciSayi=1;
			birinciSayi++;
		}
		
		//rastgele 0-100 arasında 10 sayı üretip diziye atama
		Random rnd=new Random();//Random sınıfı rastgele sayı üretmede kullanılır
		final int RANDOM_LENGTH=10;//RANDOM_LENGTH büyük harfler ve final kullanıldığı zaman sabitler anlamına gelemtkedir. yani 10 değeri program boyunca değiştirilemez.
		int[] rastgeleSayilar=new int[RANDOM_LENGTH];//dizi ve boyutu oluşturuluyor
		for(int i=0;i<rastgeleSayilar.length;i++){//length dizinin uzunluğunu verir
			rastgeleSayilar[i]=rnd.nextInt(100);//nextInt() metodu ile 100 e kadar rastgele sayı üretir. eğer yazılamzsa aralık olmadan üretir.
			System.out.println(i+1+". rastgele sayı: "+rastgeleSayilar[i]);
		}
		///////////////////////////////
		for (int i = 0; i < 100; i++) {
			if (i==10) break;//break ile şart sağlanması ile döngüden çıkılır
		}
		/////////////////////////////////
		boolean isBlock=true;
		bir:{
			iki:{
				uc:{
					System.out.println("Üçüncü Blok");
					if(isBlock) break iki;//iki etiketine sahip bloktan çıkar. bir yazan bloktan devam eder
				}
				System.out.println("İkinci Blok");		
			}
			System.out.println("Birinci Blok");
		}
		//////////////////////////////
		for (int i = 0; i < 50; i++) {
			System.out.print(i + " ");
			if (i%2==0) continue;//şart sğalandığında alt satıra geçmeyip döngünün ilk satırana geçerek işlemleri tekrarlar
			System.out.println();
		}
		///////////
		
		boolean isExit=true;
		System.out.println("return metodu çalışmadan önce ki kod");
		if(isExit) return;//şart sğalanması takdirinde return ile program sonlandırılır. ayrıca return değer döndürmede de kuallnılır.
		System.out.println("return metodu çalıştıktan sonra ki kod");
		

	}

}
