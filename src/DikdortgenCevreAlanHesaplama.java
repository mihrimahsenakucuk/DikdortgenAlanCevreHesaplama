import java.util.Scanner;

public class DikdortgenCevreAlanHesaplama {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Uzun kenarı giriniz.");
        double kenar1 = scan.nextDouble();

        System.out.println("Kısa kenarı giriniz.");
        double kenar2 = scan.nextDouble();

        double alan = kenar1 * kenar2;
        double cevre = 2 * (kenar1 + kenar2);

        System.out.println("Dikdörtgenin alanı: " + alan + " Dikdörtgenin çevresi: " + cevre);

    }
}
