import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		double xKeyfi=200;
		double eps=0.001;
		double us=0;
		double usAlınacakSayı ;
		double sonuc =0;

		Scanner sc= new Scanner(System.in);
		System.out.println("usAlınacakSayı gir");
		usAlınacakSayı= sc.nextDouble();

		System.out.println("us gir");
		us=sc.nextDouble();

while (Math.abs(fx(xKeyfi,us,usAlınacakSayı) )>eps){
	sonuc = xKeyfi - fx(xKeyfi, us, usAlınacakSayı) / fxtrv(xKeyfi, us);
	xKeyfi=sonuc;
}
System.out.println(sonuc);

	}
	public static  double fx(double xKeyfi, double us, double usAlinacakSayi) { // f(x) fonksiyonu . [ f(x) function ]
		return (usfonk(xKeyfi, us) - usAlinacakSayi);
	}
	public static double fxtrv(double xKeyfi, double us) {  // f(x) fonksiyonun türevi.[  f(x)'s differential function  ]
		return (us * usfonk(xKeyfi, us - 1));
	}
	public static double usfonk(double x, double y) { // üssü pozitif lan sayilarda recursive ile pow fonksiyonu .[ this function is recursive function when the power of the base > 0( pozitive ) ]
		if (y == 1) {
			return x;
		}
		else if (y == 0) {
			return 1;
		}
		else {
			return x * usfonk(x, y - 1);
		}
	}
}