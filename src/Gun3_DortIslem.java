public class Gun3_DortIslem {
    public static void main(String[] args) {
        int sayi1 = 17; // Birinci sayımızı tanımladık
        int sayi2 = 8; // İkinci sayımızı tanımladık

        int toplam = (sayi1 + sayi2); // Sayıları toplayıp sonucu toplam değişkenine atadık
        int cikarma = (sayi1 - sayi2); // Sayıları çıkarıp sonucy cikarma değişkenine atadık
        int carpma =  (sayi1 * sayi2); // Sayıları çarpıp sonucu carpma değişkenine atadık
        int bolme = (sayi1 / sayi2); // Sayıları bölüp sonucu bolme değişkenine atadık
        int modu = (sayi1 % sayi2); // Sayıların bölümünden kalanu modu değişkenine atadık

        System.out.println("Toplamları:" + toplam); // Sayıların toplamlarını ekrana yazdırdık
        System.out.println("Farkları:" + cikarma); // Sayıların farklarını ekrana yazdırdık
        System.out.println("Çarpımları:" + carpma); // Sayıların çarpımlarını ekrana yazdırdık
        System.out.println("Bölümleri:" + bolme); // Sayıların bölümünü ekrana yazdırdık
        System.out.println("Bölümünden kalan:" + modu); // Sayıların bölümünden kalanı ekrana yazdırdık
    }
}
