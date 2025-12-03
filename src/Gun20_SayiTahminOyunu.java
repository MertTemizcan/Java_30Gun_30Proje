import java.util.Scanner;

public class Gun20_SayiTahminOyunu {
    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in); // Kullanıcıdan veri alan kütüphaneyi sistemimize dahil ettik

        int uretilenSayi = (int) (Math.random() * 101); // Sisteme 1 ile 100 arasında rastgele sayı üretmesini söyledik
        int tahmin = -1; // Tahmin değşikeninin başlangıç değerine -1 atadık
        int tahminEtmeSayisi = 0; // tahmin etme sayısı yani sayıyı kaçıncı denemede bulduğumuzu gösteren değişkenin başlangıç değerine 0 atadık

        while(tahmin != uretilenSayi) { // Tahmin edilen sayı üretilen sayıya eşit olmadığı sürece döngü devam eder

            System.out.print("Tahmininizi giriniz: "); // Kullanıcıdan sayıyı tahmin etmesini istedik
            tahmin = tara.nextInt(); // Kullanıcının girdiği değeri taradık
            tahminEtmeSayisi++; // Tahmin etme sayısını 1 arttırdık

            if(tahmin == uretilenSayi) { // Eğer tahmin edilen sayı üretilen sayıya eşitse
                System.out.println("Tebrikler ! " + tahminEtmeSayisi + " seferde sayıyı buldunuz"); // Ekrana kullanıcının sayıyı bulduğu ve kaç seferde bulduğu yazdırılır

            } else if (tahmin > uretilenSayi) { // Tahmin edilen sayı üretilen sayıdan büyükse
                System.out.println("Tahmin ettiğiniz sayı yüksek, düşürün"); // Kullanıcıya tahmin ettiği sayıyı düşürmesi gerektiğini söyledik
            }else { // Eğer 2 durumda çalışmazsa
                System.out.println("Tahmin ettiğiniz sayı düşük, yükseltin"); //  Kullanıcıya tahmin ettiği sayıyı yükseltmesi gerektiğini söyledik
            }

        }
    }
}
