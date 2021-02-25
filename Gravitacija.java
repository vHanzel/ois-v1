import java.util.Scanner;

public class Gravitacija {

	
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double v = sc.nextInt();
		double CM = 3.9857 * Math.pow(10, 14);
		double r = 6.371 * Math.pow(10, 6);
		
		double imenovalec = (r + v) * (r + v);
		double gravPospesek = CM/imenovalec;
        izpis(v,gravPospesek);

    }
   public static void izpis(double visina, double pospesek) {
        System.out.println(visina);
        System.out.println(pospesek);

   }
}
    

