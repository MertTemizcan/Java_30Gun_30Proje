import java.util.Scanner;

public class Gun17_AltSinirUstSinir {
        public static void main(String[] args) {

            Scanner tara = new Scanner(System.in); // Kullanıcıdan veri alan kütüphaneyi sistemimize dahil ettik

            int toplam = 0; // Toplam değişkenine 0 değerini atadık
            System.out.println("Alt sınırı giriniz: "); // Kullanıcıdan alt sayı sınırını girmesini istedik
            int altSinir = tara.nextInt(); // Kullanıcının girdiği değeri taradık
            System.out.println("Üst sınırı giriniz: "); // Kullanıcıdan üst sayı sınırını girmesini istedik
            int ustSinir = tara.nextInt(); // Kullanıcının girdiği değeri taradık

            for(int i = altSinir; i< ustSinir; i++){ // Döngüyü alt sınırdan başlattık üst sınıra kadar gitmesini tanımladık
                toplam += i; // Toplam değişkenini i değişkeni ile toplayıp sonucu toplam değişkenine atadık
            }

            System.out.println(altSinir + " ile " + ustSinir + " arasındaki sayıların toplamı: " + toplam); // Ekrana toplamın sonucunu mesaj olarak yazdırdık
        }
    }

