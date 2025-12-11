import java.util.Scanner;
import java.util.InputMismatchException;

public class Gun28_SporSalonuUyeligi {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in); // Kullanıcıdan veri alan kütüphaneyi sistemimize dahil ettik

        try{
            System.out.println("Merhaba spor salonumuza hoşgeldiniz"); // Kullanıcıyı selamladık
            System.out.println("Salonumuzun aylık ücreti 1500 tl dir"); // Kullanıcıya aylık ücreti belirttil
            System.out.println("Eğer 6 ay gelirseniz %5, 12 ay gelirseniz %15 indirim uygulanır"); // Kullanıcıya indirim tarifesini belirttik

            System.out.print("Kaç aylık üyelik almak istiyorsunuz:"); // Kullanıcıya kaç aylık üyelik almak istediğini sorduk
            byte ay = tara.nextByte(); // Kullanıcının girdiği değeri taradık

            int aylikUcret = 1500; // Aylık ücreti tanımladık
            int uyelikUcreti = aylikUcret * ay; // Üyelik ücreti tarifesini tanımladık
            int yuzdeBesIndirimliFiyat = uyelikUcreti - (int)(uyelikUcreti * 0.05); // Yüzde beş indirimli ücret tarifesini tanımladık
            int yuzdeOnbesIndirimliFiyat = uyelikUcreti - (int) (uyelikUcreti * 0.15); // Yüzde 15 indirimli ücret tarifesini tanımladık

            if(ay <= 0) { // Eğer kullanıcı 0 veya 0 dan küçük bir değer girerse
                System.out.println("Ay negatif bir değer alamaz lütfen pozitif bir değer giriniz"); // Ekrana uyarı mesajı yazdırılır

            } else if (ay == 6) { // Eğer kullanıcı 6 aylık üyelik alırsa
                System.out.println("6 aylık üyelik aldığınız için indirimli fiyatınız: " + yuzdeBesIndirimliFiyat + " tl"); // Ekrana 6 aylık ücret tarifesi yazdırılır
            } else if (ay == 12) { // Eğer kullanıcı 12 aylık üyelik alırsa
                System.out.println("12 aylık üyelik aldığınız için indirimli fiyatınız: " + yuzdeOnbesIndirimliFiyat + " tl"); // Ekrana 12 aylık ücret tarifesi yazdırılır
            }else { // Eğer kullanıcı 6 ay ya da 12 aylık üyelik almazsa
                System.out.println(ay + " aylık üyeliğin fiyatı: " + uyelikUcreti + " tl"); // Ekrana normal ücret tarifesi yazdırılır
            }
        } catch (InputMismatchException e) { // Eğer hatalı bir giriş yapılırsa
            System.out.println("Yanlış bir değer girdiniz lütfen tekrar deneyiniz"); // Ekrana hata mesajı yazdırılır
        }


    }
}
