import java.util.Scanner;

public class Gun19_CarpmaIslemi {
    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in); // Kullanıcıdan veri alan kütüphaneyi sistemimize dahil ettik

        System.out.println("Girdiğiniz sayıları çarpan programa hoşgeldiniz"); // Kullanıcıyı selamladık
        System.out.print("Bir değer giriniz, çıkmak için 0 a basınız: "); // Kullanıcıdan bir değer girmesini çıkması için 0 a basmasını istedik

        int kullaniciDegeri = tara.nextInt(); // Kullanıcının girdiği değeri taradık
        int carpimSonucu = 1; // Çarpım sonucu değişkeninin başlangıç değerine 1 atadık
        boolean hemenCikildimi = true; // hemen çıkıldımı değişkeninin sonucuna true atadık

        while (kullaniciDegeri != 0) { // Kullanıcı değeri 0 dan farklıysa
            carpimSonucu *= kullaniciDegeri; // Kullanıcı değeriyle çarpım sonucu değişkeni çarpılarak sonuç çarpım değişkeninin değerine atanır
            System.out.print("Bir değer giriniz, çıkmak için 0 a basınız: ");
            kullaniciDegeri = tara.nextInt(); // Kullanıcının girdiği değeri taradık

            hemenCikildimi = false;
        }
        if(hemenCikildimi) {
            System.out.println("Uygulamadan hemen çıktınız"); // Eğer kullanıcı sayı girmeden direk 0 a basarsa ekrana uygulamadan hemen çıktığı yazdırılır
        }else {
            System.out.println("Girdiğiniz sayıların çarpımı: " + carpimSonucu); // sayılar girildikten sonra çıkılırsa erkana işlemin sonucu yazdırılır
        }

    }
}


