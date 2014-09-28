package OCJP;

public class Chapter07_Aritmetic_Aritmetik_Islemler {
	//aritmetik işlemlerde tam ve ondalıklı sayılar kullanımaktaadır.
	//aşağıdak i her örnekte tam sayı(int) ve ondalıklı(double) sayıların kullanıldığı örneklerden yararlanılmıştır
	public static void main(String[] args) {
		//sum(toplama)
		int sum1=15+24;
		
		int num1=15, num2=24;
		int sum2=num1+num2;
		
		double sum3=2.8+5.3;
		double dnum1=2.8, dnum2=5.3;
		double sum4=dnum1+dnum2;
		
		System.out.println("sum1: "+sum1+" sum2: "+sum2);
		System.out.println("dsum1: "+sum3+" dsum2: "+sum4);
		
		System.out.println();
		//subtraction(çıkartma)
		int sub1=25-15;
		
		int num3=25, num4=15;
		int sub2=num3-num4;
		
		double sub3=41.6-24.2;
		double dnum3=41.6, dnum4=24.2;
		double sub4=dnum3-dnum4;
		
		System.out.println("sub1: "+sub1+" sub2: "+sub2);
		System.out.println("dsub1: "+sub3+" dsub2: "+sub4);
		
		System.out.println();
		//multiplacation(çarpma)
		int multiplication1=5*9;
		
		int num5=5;
		int num6=9;
		int multiplacation2=num5*num6;
		
		double multiplacation3=2.3*5.2;
		double dnum5=2.3, dnum6=5.2;
		double multiplacation4=dnum5*dnum6;
		
		System.out.println("multiplacation1: "+multiplication1+ " multiplacation2: "+multiplacation2);
		System.out.println("dmultiplacation1: "+multiplacation3+ " dmultiplacation2: "+multiplacation4);
		
		System.out.println();
		//division(bölme)
		int div1=24/8;
		
		int num7=24,num8=8;
		int div2=num7/num8;
		
		double div3=11.1/3.3;
		double dnum7=11.1, dnum8=3.3;
		double div4=dnum7*dnum8;
		
		System.out.println("division1: "+div1+" division2: "+div2);
		System.out.println("ddivision1: "+div3+" ddivision2: "+div4);
		
		System.out.println();
		//remainder(mod alma-kalanı verir)
		int remainder1=56%5;
		
		int num9=56, num10=5;
		int remainder2=num9%num10;
		
		double remainder3=8.2%5.1;
		double dnum9=8.2, dnum10=5.1;
		double remainder4=dnum9%dnum10;
		
		System.out.println("remainder1: "+remainder1+" remainder2: "+remainder2);
		System.out.println("dremainder1: "+remainder3+" dremainder2: "+remainder4);
		
		double bilimsel=6.2E3;
		System.out.println(bilimsel);
		
		int number1=10;
		System.out.println("number1: "+number1);
		number1++;
		System.out.println("number1++: "+number1);
		number1--;
		System.out.println("number1--: "+number1);
		
		number1+=5;
		System.out.println("number1+=5: "+number1);
		
		number1-=5;
		System.out.println("number1-=5: "+number1);
		
		number1*=2;
		System.out.println("number1*=2: "+number1);
		
		number1/=2;
		System.out.println("number1/=2: "+number1);
		

	}

}
