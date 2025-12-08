import java.util.Scanner;

public class Gun25_AsalSayiMi {
    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in); // Kullanıcıdan veri alan kütüphaneyi sistemimize dahil ettik

        System.out.println("Asal sayı kontorlü yapan programa hoşgeldiniz"); // Kullanıcıyı selamladık
        System.out.println();
        System.out.print("Kontrol etmek istediğiniz sayıyı giriniz: "); // Kullanıcıdan kontrol etmek istediği sayıyı girmesini istedik
        int girilenSayi = tara.nextInt(); // Kullanıcının girdiği değeri taradık

        int sayac = 0;

        if (girilenSayi < 2) { // eğer girilen sayı 2 den küçükse
            System.out.println(girilenSayi + " asal sayı değildir"); // Ekrana sayının asal sayı olmadığı yazdırılır
        } else { // Girilen sayı 2 den büyükse else bloğu çalışır
            for (int i = 2; i < girilenSayi; i++) {
                if (girilenSayi % i == 0) {
                    sayac++;
                }
            }


            if (sayac == 0) { // Eğer sayaç değişkeninin değeri 0 ise
                System.out.println(girilenSayi + " asal sayıdır"); // Ekrana kullanıcının girdiği sayının asal olduğu yazdırılır
            } else { // Sayaç değişkeninin değeri 0 dan farklı ise burası çalışır
                System.out.println(girilenSayi + " asal sayı değildir"); // Ekrana kullanıcının girdiği sayının asal olmadığı yazdırılır
            }
        }
    }
}
