import java.util.Locale;
import java.util.Scanner;

public class Gun12_VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in); // Kullanıcıdan veri alan kütüphaneyi sistemimize dahil ettik
        tara.useLocale(Locale.US); // Amerika yazım standartlarını sistemimize dahil ettik

        System.out.println("Vücut kitle endeksi programına hoşgeldiniz"); // Kullanıcıyı selamladık

        System.out.print("Boyunuzu metre(m) cinsinden giriniz: "); // Kuulanıcıdan boyunu metre cinsiden girmesini istedik
        float boy = tara.nextFloat(); // Kullanıcının girdiği değeri taradık

        System.out.print("Kilonuzu kilogram (kg) cinsinden giriniz: "); // Kullanıcıdan kilosunu kilogram cinsinden girmesini istedik
        float kilo = tara.nextFloat(); // Kullanıcının girdiği değeri taradık

        float vki = kilo / (boy * boy); // Vücut kitle endeksinin formülünü tanımladık

        System.out.println("Vücut kitle endeksiniz: " + vki); // Ekrana kullanıcının vücut kitle endeksini yazdırdık
    }
}
