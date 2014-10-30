package OCJP;

class Kup{//Kup adında sınıf oluşturulur
	double genislik, yukseklik, derinlik;//sınıfa ait genislik, yukseklik ve derinlik adında değişkenler oluşturulur
	
	void hacim(){//küpün hacmini hesaplamak için void(değer döndürmeyen) parametre almayan metot oluşturulur.
		System.out.print("Hacim ");
		System.out.println(genislik*yukseklik*derinlik);
	}
	
	void setDim(double genislik, double yukseklik, double derinlik){//değişkenlere değer atamak için parametre ile değerler gönderilir
		this.genislik=genislik;//this.genislik ifadesinde ki this anahtarı sınıfın başında oluşturduğumuz genislik değişkenini işaret eder. genislik değişkeni ise parametre olarak gelen değeri ifade eder. 
		this.yukseklik=yukseklik;
		this.derinlik=derinlik;
	}
	
}

public class Chapter13_Class_Sınıflar {

	public static void main(String[] args) {
		Kup kup1= new Kup();//Kup sınıfına ait nesne oluşturulur. new Kup() ifadesine parantez içerisinde ise yapıcı metot kullanılması durumunda parametreler yazılır.
		double hacim;
		
		kup1.setDim(15, 20, 25);//küpün genişlik, yükseklik ve derinlik deişkenlerine setDim metotu aracılığı ile paraemetreler gönderilir.
		
		kup1.hacim();//küpe ait hacim hesaplayan metot çalıştırılır
		
		kup1=null;
		
		Chapter13_Class_Sınıflar cc=new Chapter13_Class_Sınıflar();
		cc.finalize();//cc nesnesine ait sınıfta kullanılmayan nesnlere ait bellekteki yerin boşaltılma işlemi başlamadna önce finalize metodu oluşturularak istenilen işlemler yapılır.
		System.gc();//hafızadan null değere sahip çöpler bellekten yerleri atılır.
		
		
	}
	
	protected void finalize(){
		System.out.println("Güle güle dünya!");
	}

}
