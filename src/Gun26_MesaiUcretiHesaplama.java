import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Gun26_MesaiUcretiHesaplama {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        tara.useLocale(Locale.US);

        try {
            System.out.println("Mesai ücreti hesaplayan programa hoşgeldiniz"); // Kullanıcıyı selamladık

            System.out.print("Saatlik ücretinizi giriniz: "); // Kullanıcıdan saatlik ücretini girmesini istedik
            double saatlikUcret = tara.nextDouble(); // Kullanıcının girdiği değeri taradık

            System.out.print("Kaç saat çalıştığınızı giriniz: "); // Kullanıcıdan kaç saat çalıştığını girmesini istedik
            double saat = tara.nextDouble(); // Kullanıcının girdiği değeri taradık

            System.out.print("Haftada kaç gün çalıştığınızı giriniz: "); // Kullanıcıdan haftada kaç gün çalıştığını girmesini istedik
            int haftalikGun = tara.nextInt(); // Kullanıcının girdiği değeri taradık

            double gunlukUcret = saatlikUcret * saat; // Günlük ücretin formülünü tanımladık
            double haftalikUcret = gunlukUcret * haftalikGun; // Haftalık ücretin formülünü tanımladık
            double aylikUcret = haftalikUcret * 4; // Aylık ücretin formülünü tanımladık

            System.out.printf("Günlük ücretiniz: %.1f TL%n", gunlukUcret); // Ekrana kullanıcının günlük ücretini yazdırdık
            System.out.printf("Haftalık ücretiniz: %.1f TL%n", haftalikUcret); // Ekrana kullanıcının haftalık ücretini yazdırdık
            System.out.printf("Aylık ücretiniz: %.1f TL%n", aylikUcret); // Ekrana kullanıcının aylık ücretini yazdırdık

        } catch (InputMismatchException e) { // Hatalı bir giriş yapılması halinde
            System.out.println("Hatalı giriş yaptınız Lütfen sayı giriniz."); // Ekrana hata mesajı yazdırılır
        }

    }
}
