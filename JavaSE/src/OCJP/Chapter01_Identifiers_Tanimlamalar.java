package OCJP;
public class Chapter01_Identifiers_Tanimlamalar {
	public static void main(String[] args) {
		//legal identifiers. kurallara uygun tanımlamalar
		int number=1;
		int number2=2;
		int _number3=3;
		int $number4=4;
		
		System.out.println(number+number2+_number3+$number4);
		
		/*illegal identifiers. kurallara uygun olmayan tanımlamalar
		 * int 1number=1;
		 * int :number2=2;
		 * int #number3=3;
		 * int .number4=4;
		 * int +number5=5;
		 * int -number6=6;
		 * int int=7;
		 * int char=8; 
		 */
	}
}
