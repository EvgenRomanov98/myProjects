import java.util.Scanner;

public class Uf {
    public static void main(String[] args) {
       for(;;)
       {
           System.out.println("Ввелите число(или 0 для выхода)");
           Scanner scn = new Scanner(System.in);
           double scnr = scn.nextDouble();
           if (scnr == 0) break;
           System.out.println("Число увеличенное на 10: \n" + uf(scnr));

       }
    }

    public static double uf(double n) {
        double res = n + (n * 10 / 100);
        return res;
    }
}
