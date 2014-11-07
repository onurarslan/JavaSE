package OCJP;

import java.io.ObjectInputStream.GetField;

class Not{
	private int vizeSinavi, finalSinavi;
	int ogrenciSayisi=0;
	int okulNo;
	String ogrenciAdi, ogrenciSoyadi, ogrenciSinifi;
	
	public Not(int okulNo, String ogrenciAdi, String ogrenciSoyadi, String ogrenciSinifi){
		this.okulNo=okulNo;
		this.ogrenciAdi=ogrenciAdi;
		this.ogrenciSoyadi=ogrenciSoyadi;
		this.ogrenciSinifi=ogrenciSinifi;
	}
	
	public static void getSinif(Not[] not, String ogrenciSinifi){
		for (int i = 0; i < not.length; i++) {
			if (not[i].ogrenciSinifi==ogrenciSinifi) {
				System.out.print(not[i].okulNo);
				System.out.print(" "+not[i].ogrenciAdi+" ");
				System.out.println(not[i].ogrenciSoyadi);
				
			}
			else
				System.out.println("Aranan Kayıt Bulunamadı!");
		}
		
	}
	
	public int ortalamaHesapla(){
		++ogrenciSayisi;
		return (int) (vizeHesapla()+finalHesapla());
	}
	
	private double vizeHesapla(){
		return this.vizeSinavi*0.3;
	}
	
	private double finalHesapla(){
		return this.finalSinavi*0.7;
	}
	
	public void setVizeSinavi(int vizeSinavi){
		this.vizeSinavi=vizeSinavi;
	}
	
	public int getVizeSinavi(){
		return this.vizeSinavi;
	}
	
	public void setFinalSinavi(int finalSinavi){
		this.finalSinavi=finalSinavi;
	}
	
	public int getFinalSinavi(){
		return this.finalSinavi;
	}
	
}

public class Chapter14_Big_Project {

	public static void main(String[] args) {
		
		Not not1= new Not(1,"Onur","ARSLAN","BTBS3");
		
		not1.setVizeSinavi(50);
		not1.setFinalSinavi(80);
		System.out.println(not1.ortalamaHesapla());
		
		Not not2=new Not(2, "Yalçın", "KAZAN", "BTBS3");
		
		Not not3=new Not(3,"Hasan","ŞENTÜRK","BTBS1");
		
		Not[] notDizisi=new Not[10];
		notDizisi[0]=not1;
		notDizisi[1]=not2;
		notDizisi[2]=not3;
		
		
		Not.getSinif(notDizisi, "BTBS3");
		
		
		int grade=80;
		switch (grade/10) {
		case 10:
		case 9:
			System.out.println("AA");break;
		case 8:
			System.out.println("BB"); break;
		case 7:
			System.out.println("CC"); break;
		case 6:
			System.out.println("DD"); break;
		default:
			System.out.println("Geçersiz");
			break;
		}

	}

}
