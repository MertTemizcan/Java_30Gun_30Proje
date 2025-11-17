public class Gun4_DikdortgenAlani {
    public static void main(String[] args) {
        int uzunKenar = 20; // Dikdörtgenin uzun kenarını tanımladık
        int kisaKenar = 15; // Dikdörtgenin kısa kenarını tanımladık

        int dikdortgenAlani = (uzunKenar * kisaKenar); // Dökdörtgenin alan hesaplama formülünü tanımladık
        int dikdortgenCevresi = 2 * (uzunKenar + kisaKenar); // Dikdörtgenin çevre hesaplama formülünü tannımladık

        System.out.println("Dikdörtgenin alanı: " + dikdortgenAlani + " metre"); // Dikdörtgenin alanını ekrana yazdırdık

        System.out.println("Dikdörtgenin çevresi: " + dikdortgenCevresi + " metre"); // Dikdörtgenin çevresini ekrana yazdırdık
    }
}
