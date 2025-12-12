import java.util.Scanner;

public class Gun29_DovizIslemleri {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);

        System.out.println("Para birimi dönüştüren programa hoşgeldiniz");

        System.out.println("Ne kadar tl dönüştürmek istediğinizi giriniz: ");
        double tlBirimi = tara.nextDouble();

        tara.nextLine();

        System.out.println("Dönüştürmek istediğiniz para birimini giriniz: ");
        String paraBirimi = tara.nextLine().toLowerCase();

        double euro = 50.18;
        double dolar = 42.62;

        switch (paraBirimi) {
            case "euro":
                double donusenEuro = tlBirimi / euro;
                System.out.printf("%.2f TL'nin euro karşılığı: %.2f euro%n", tlBirimi, donusenEuro);
                break;

            case "dolar":
                double donusenDolar = tlBirimi / dolar;
                System.out.printf("%.2f TL'nin dolar karşılığı: %.2f dolar%n", tlBirimi, donusenDolar);
                break;

            default:
                System.out.println("Hatalı giriş yaptınız, lütfen tekrar deneyin.");
                break;
        }

    }
}
