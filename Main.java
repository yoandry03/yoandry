import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int efectivo = 0;
        System.out.println("Entre su dinero efectivo");
        Scanner sc = new Scanner(System.in);
        efectivo = Integer.parseInt(sc.nextLine());
        int ramos = efectivo / 70;
        double restoRamos = efectivo % 70;
        System.out.println("Puedes comprar " + ramos + " ramos y te sobran " + restoRamos + " pesos");
    }
}