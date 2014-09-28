package OCJP;

public class Chapter10_Type_Casting_Tip_Donusumu {

	public static void main(String[] args) {
		byte number1=127;
		int cast1=number1;//byte sayı aralığı int sayı aralığından küçük olduğu için otomatik tip dönüşümü yapılır
		System.out.println("number1: "+number1+ " cast1: "+cast1);
		
		int number2=1400;
		byte cast2=(byte)number2;//int sayı aralığı byte tipinden büyük olduğu için byte dönüştürülürken sayı önüne (byte) yazılmalıdır.
		System.out.println("number2: "+number2+" cast2: "+cast2);//byte aralığı yetersiz kaldığı için int dönüştürülürken mod işlemi uygulanır ve veri kaybı yaşandığı gözlemlenebilir 

	}

}
