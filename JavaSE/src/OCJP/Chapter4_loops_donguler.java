package OCJP;

public class Chapter4_loops_donguler {

	public static void main(String[] args) {
		//while döngüsü belirtilen şart sağlanana kadar blok içerisinde ki kodların çalıştırılmasını sağlar.
		int number=10;
		while(number>0){
			System.out.print(number-- + " ");
		}
		System.out.println();
		
		//for döngüsünde ilk noktalı birgül öncesinde bir bşalangıç değeri verilir.
		//ikinci kısmında şart yazılır
		//üçüncü kısımda şartın sağlanması durumunda döngü değeri arttırılır yada azaltılır
		for(int i=0;i<50;i++){
			if(i%2==0){//% ifadesi mod yani kalanı verir. kalanlar 0'a eşit ise yani çift ise ekrana yazdırır
				System.out.print(i + " ");
			}
		}

	}

}
