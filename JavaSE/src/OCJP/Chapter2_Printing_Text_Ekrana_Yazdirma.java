package OCJP;

public class Chapter2_Printing_Text_Ekrana_Yazdirma {

	public static void main(String[] args) {
		System.out.print("Onur ");//print() metodu ekrana yazdırdıktan sonra alt satıra geçmez
		System.out.println("Arslan");//println() metodu ekrana yazdırdıktan sonra alt satıra geçer
		System.out.println("JavaSE");
		System.out.println("JavaME\nJavaEE");//\n ifadesinden sonra gelen metinler alt satıra yazdırılır
		System.out.println("\tParagraf başı bir tab ileri başlar.");//\t ile bir tab ileri gidilir.
		System.out.println("\tParagraf başı bir tab ileri başlar ve\bu metin alt satıra geçer ve satır başına yazılır.");//\r ifadesindne sonra ki metin alt satıra ve satır başından yazar.
		System.out.println("\\Solda yatık çizginin ekrana yazdırılması için çizgi başına bizçizgi daha eklenir.");
		System.out.println("\"Çift tırnak\" açabilmek için önce sola yatık sonra çift tırnak eklenir.");
		
		int number1=50;
		int number2=20;
		int sum=number1 + number2;
		System.out.println(number1 + "+" + number2 + "=" + sum);//değişkenler kullanılarakda ekrana yazdırılabilir
		System.out.printf("%s\n%s\n","Adı","Soyad");//%s ile sırası ile ifadeler eşleştirilir.
		
		String name1="Onur";
		String name2="Ali";
		String name3="Kemal";
		System.out.println(name1 + " " + name2 + " " + name3);//arada birer boşluk bırakarak yazdırıdk

	}

}
