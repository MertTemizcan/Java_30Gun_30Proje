import java.util.Scanner;

public class Gun7_KullaniciUrunFiyati {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in); // Kullanıcıdan veri alan kütüphaneyi sistemimize dahil ettik

        System.out.print("Birinci ürünün fiyatını giriniz: "); // Kullanıcıdan birinci ürünün fiyatınnı girmesini istedik
        double urun1 = tara.nextDouble(); // Kullanıcının girdiği değeri taradık

        System.out.print("İkinci ürünün fiyatını giriniz: "); // Kullanıcıdan ikinci ürünün fiyatını girmesini istedik
        double urun2 = tara.nextDouble(); // Kullanıcının girdiği değeri taradık

        System.out.print("Üçüncü ürünün fiyatını giriniz: "); // Kullanıcıdan üçüncü ürünün fiyatını girmesini istedik
        double urun3 = tara.nextDouble(); // Kullanıcının girdiği değeri taradık

        System.out.print("Uygulamak istediğiniz kdv tutarını giriniz: "); // Kullanıcıdan kdv tutarını girmesini istedik
        double kdvOrani = tara.nextDouble(); // Kullanıcının girdiği değeri taradık

        double urun1Kdvli = (urun1 * kdvOrani) + urun1; // Birinci ürünün kdv li tutarını hesapladık
        double urun2Kdvli = (urun2 * kdvOrani) + urun2; // İkinci ürünün kdv li tutarını hesapladık
        double urun3Kdvli = (urun3 * kdvOrani) + urun3; // Üçüncü ürünün kdv li tutarını hesapladık

        System.out.println("Birinci ürünün normal fiyatı: " + urun1 + " TL " + "Kdv li fiyatı: " + urun1Kdvli + " TL"); // Birinci ürünün normal fiyatını ve kdv li fiyatını ekrana yazdırdık
        System.out.println("İkinci ürünün normal fiyatı: " + urun2 + " TL " + "Kdv li fiyatı: " + urun2Kdvli + " TL"); // İkinci ürünün normal fiyatını ve kdv li fiyatını ekrana yazdırdık
        System.out.println("Üçüncü ürünün normal fiyatı: " + urun3 + " TL " + "Kdv li fiyatı: " + urun3Kdvli + " TL"); // Üçüncü ürünün normal fiyatını ve kdv li fiyatını ekrana yazdırdık
    }
}
