package OCJP;

public class Chapter12_Control_Statement_Switch_Case {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//switch-case ifadeleri if-else gibidir. genelde tek şartlı ve uzun kontrollü ifadelerde kullanılır.
		int day=5;//day değişkenine haftanın 5.günü anlamına gelen 5 sayısı atandı
		String message=null;//message değişkeni için henüz bellekte yer tutulmadı
		switch(day){//day değişkeninin değerini kontrol et
		case 1://1 ise break komutuna kadar olan işlemleri yap ve break ile diğerlerini kontrol etmeden çıkış yap.
			message="Monday"; break;
		case 2:
			message="Tuesday"; break;
		case 3:
			message="Wednesday"; break;
		case 4:
			message="Thursday"; break;
		case 5:
			message="Friday"; break;
		case 6:
			message="Saturday"; break;
		case 7:
			message="Sunday"; break;
		default:
			message="Error!";	
		}
		System.out.println(message);
		/////////////////////////////////////////////////////////////////
		
		int mount=1;//mount değişkenine ocak ayı anlamına gelen 1 sayısı atandı
		String season=null;//season dğeişkeni null değer atandı.
		
		switch(mount){//mount değişkeninin değerini kontrol et
		case 12:
		case 1:
		case 2://eğer değişken 12,1 veya 2 den biriyse season değişkenine Winter ata ve diğerlerini kontro letmemek için break ile kontorlü sonlandır.
			season="Winter"; break;
		case 3:
		case 4:
		case 5:
			season="Spring"; break;
		case 6:
		case 7:
		case 8:
			season="Summer"; break;
		case 9:
		case 10:
		case 11:
			season="Autumn"; break;
		default:
			season="Error!"; break;				
		}
		
		System.out.println(season);

	}

}
