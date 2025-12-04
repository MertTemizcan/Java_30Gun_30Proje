import java.util.Scanner;

public class Gun21_SansOyunu {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in); // Kullanıcıdan veri alan kütüphaneyi sistemimize dahil ettik

        System.out.println("Zar tahmin programına hoşgeldiniz"); // Kullanıcıyı selamladık
        System.out.println(" "); // Bir satır boşluk bıraktık

        int tahminSayisi = 0; // Tahmin sayısı değişkeninin başlangıç değerine 0 atadık
        int tahmin = -1; // Tahmin değişkeninin başlangıç değerine -1 atadık

        int donenSayi = (int) (Math.random() * 7); // Sistemden 1 ile 6 arasında rastgele bir sayı üretmesini istedik

        while(tahmin != donenSayi) { // Tahmim edilen sayı dönen sayıya eşit olmadığı sürece döngü devam eder
            System.out.println("Tahmin ettiğiniz sayıyı giriniz: "); // Kullanıcıdan sayı tahmin etmesini istedik
            tahmin = tara.nextInt(); // Kullanıcının girdiği değeri taradık
            tahminSayisi++; // Tahmin sayısını 1 arttırdık
            if(tahmin == donenSayi) { // Eğer tahmin edilen sayı dönen sayıya eşitse
                System.out.println("Tebrikler " + tahminSayisi + " denemede buldunuz"); // Kullanıcının sayıyı doğru tahmin ettiğini ve ne kadar denemede bulduğunu ekrana yazdırdık

            } else if (tahmin > donenSayi) { // Eğer tahmin edilen sayı dönen sayıdan büyükse
                System.out.println("Tahmininiz büyük biraz daha küçük tahmin yapın"); // Kullanıcının tahmin ettiği sayıyı biraz küçültmesi gerektiğini ekrana yazdırdık
            }else { // Eğer dönen sayı tahmin edilen sayıdan küçükse
                System.out.println("Tahmininiz küçük biraz daha yüksek tahmin yapın"); // Kullanıcının tahmin ettiği sayıyı biraz büyütmesi gerektiğini ekrana yazdırdık
            }

        }
    }
}
