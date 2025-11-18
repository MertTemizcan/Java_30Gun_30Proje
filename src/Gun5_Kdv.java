public class Gun5_Kdv {
    public static void main(String[] args) {
        int birinciUrun = 100; // Birinci ürünün normal fiyatını tanımladık
        float ikinciUrun = 260.25f; // İkinci ürünün normal fiyatını tanımladık
        float ucuncuUrun = 227.65f; // Üçüncü ürünün normal fiyatını tanımladık
        float dorduncuUrun = 462.86f; // Dördüncü ürünün normal fiyatını tanımladık
        float kdvOrani = 0.86f; // Kdv oranını tanımladık

        double birinciUrunFiyati = (birinciUrun * kdvOrani + birinciUrun); // Birinci ürünün kdv li fiyatını tanımladık
        double ikiciUrunFiyati = (ikinciUrun * kdvOrani + ikinciUrun); // İkinci ürünün kdv li fiyatnı tanımladık
        double ucuncuUrunFiyati = (ucuncuUrun * kdvOrani + ucuncuUrun); // Üçüncü ürünün kdv li fiyatını tanımladık
        double dorduncuUrunFiyati = (dorduncuUrun * kdvOrani + dorduncuUrun); // Dördüncü ürünün kdv li fiyatını tanımladık

        System.out.println("Birinci ürünün normal fiyatı: " + birinciUrun + " kdv li fiyat: " + birinciUrunFiyati + " TL"); // Birinci ürünün fiyatlarını ekrana yazdırdık
        System.out.println("İkinci ürünün normal fiyatı: " + ikinciUrun + " kdv li fiyat: " + ikiciUrunFiyati + " TL"); // İkinci ürünün fiyatlarını ekrana yazdırdık
        System.out.println("Üçüncü ürünün normal fiyatı: " + ucuncuUrun + " kdv li fiyat: " + ucuncuUrunFiyati + " TL"); // Üçüncü ürünün fiyatlarını ekrana yazdırdık
        System.out.println("Dördüncü ürünün normal fiyatı: " + dorduncuUrun + " kdv li fiyat: " + dorduncuUrunFiyati + " TL"); // Dördüncü  ürünün fiyatlarını ekrana yazdırdık

    }
}
