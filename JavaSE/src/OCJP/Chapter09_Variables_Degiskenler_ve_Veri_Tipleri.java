package OCJP;

public class Chapter09_Variables_Degiskenler_ve_Veri_Tipleri {

	public static void main(String[] args) {
		byte variables1=127;//byte veri tipi -128 ile 127 arasında ki sayıları kabul eder. ağ ve dosya işlemlerinde kullanılır
		short variables2=32767;// short veri tipi 3-32.768 ile 32.767 arasında ki sayıları kabul eder
		//JavaSE7 ile büyük sayıların arasına alt tire konabilir. derlerken alt tireler değerlendirilmez.
		int variables3=2_147_483_647;//int veri tipi 2.147.483.647 ile 2.147.483.648 arasında ki sayıları kabul eder.
		long variables4=4564654565465456L;//long veri tipi int tipinin yetmediği aralıklarda kullanılır ve sayılarının sonuna L ifadesi eklenekerek LONG olduğu anlaşılması sağlanır. bunun içinde sayıların int tipini geçmiş olması gerekmektedir.
		System.out.println("byte: "+variables1+" short: "+variables2+ " int: "+variables3+" long: "+variables4);
		
		float variable5=5.6f;//float tanımlarken sonuna f eklenmelidir
		double variable6=2689.46;
		System.out.println("float: "+variable5+" double: "+variable6);
		
		char variable7='A';
		char variable8=65;//A harfini verir.
		System.out.println("Char 1: "+variable7+" Char 2: "+variable8);
		
		String variable9="Onur";
		System.out.println("String: "+variable9);
		
		boolean variable10=true;
		boolean variable11=false;
		System.out.println("Boolean 1: "+variable10+" Boolean 2: "+variable11);
		
	}

}
