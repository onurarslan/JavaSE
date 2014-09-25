package OCJP;

public class Chapter3_Control_Statement_if_else {

	public static void main(String[] args) {
		//şartı bağlaı program yazarken if bloğuna girmemesi durumunda bir işlem yapılması isteniyorsa
		//else bloğu açılır
		int temperature=27;//sıcaklık değişkenine 27 değeri atandı
		if(temperature>0){//eğer değişkendeki değer 0 değerinden büyük ise  bu kod bloğunu çalıştır
			System.out.println("hot");
		}
		else{//eğer değilse bu kod bloğunu çalıştır
			System.out.println("cold");
		}
		
		
		//birden fazla şart olduğu zaman if-else if durumu kullanılır
		int money=257;
		if(money<=0) System.out.println("Your is poor.");//eğer money değişken değeri 0dan küçük ise
		else if(money>0 && money<5000) System.out.println("Good");//eğer money değeri 0dan büyük ve 5000den küçük ise
		else if(money>5000) System.out.println("Your is rich.");//eğer money 5000den büyük ise
		else System.out.println("Error: Wrong value !");//hiçbir şart uymuyorsa
		//ilgili kod bloklarını çalıştır.
		
		

	}

}
