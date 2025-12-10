import java.util.Scanner;
import java.util.InputMismatchException;
public class Gun27_GirilenSayiyaKadarToplama {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);

        try {
            System.out.println("Seçtiğiniz sayıya kadar olan sayıların toplamını hesaplayan programa hoşgeldiniz"); // Kullanıcıyı selamladık

            System.out.print("Bir tam sayı giriniz: "); // Kullanıcıdan bir tam sayı girmesini istedik
            int girilenSayi = tara.nextInt(); // Kullanıcının girdiği değeri taradık
            int toplam = 0; // Toplam değişkenini tanımladık ve başlangıç değerine 0 atadık

            if(girilenSayi < 0) { // Eğer kullanıcının girdiği sayı sıfırdan küçükse
                System.out.println("Lütfen pozitif bir sayı giriniz"); // Ekrana kullanıcının pozitif sayı girmesi gerektiği yazdırılır
                return;
            } else { // Eğer kullanıcı pozitif bir tam sayı girerse burası çalışır
                for(int i = 0; i <= girilenSayi; i++) {
                    toplam += i; //


                }
            }
            System.out.println("Toplam: " + toplam); // Ekrana sonucu yazdırdık
        } catch (InputMismatchException e) { // Hatalı bir giriş yapılması halinde
            System.out.println("Yanlış bir değer girdiniz lütfen bir sayı giriniz"); // Ekrana hata mesajı yazdırılır
        }
    }
}
