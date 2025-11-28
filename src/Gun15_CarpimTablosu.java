import java.util.Scanner;

public class Gun15_CarpimTablosu {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in); // Kullanıcıdan veri alan kütüphaneyi sistemimize dahil ettik

        System.out.println("Çarpım tablosunu görmek istediğiniz sayıyı giriniz: "); // Kullanıcıdan çarpım tablosunu görmek istediği sayıyı yazmasını istedik
        int sayi1 = tara.nextInt(); // Kullanıcının girdiği değeri taradık

        // Çarpım tablosunu yazdıran döngü
        for (int i = 1; i <= 10; i++) {
            int carpim = sayi1 * i;
            System.out.println(sayi1 + " x " + i + " = " + carpim); // Sonucu ekrana yazdırdık
        }
    }
}
