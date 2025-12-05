import java.util.Scanner;

public class Gun22_GeometrikSekil {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in); // Kullanıcıdan veri alan kütüphaneyi sistemimize dahil ettik

        System.out.println("Geometrik şekillerin alanını hesaplayan programa hoşgeldiniz"); // Kullanıcıyı selamladık
        System.out.println(" ");
        System.out.print("Alanını hesaplamak istediğiniz şekili seçiniz dikdörtgen kare üçgen : "); // Kullanıcıdan bir geometrik şekil seçmesini istedik
        String secim = tara.nextLine().toLowerCase(); // Kullanıcının seçtiği şekli taradık

        switch (secim) {
            case "dikdörtgen": // Kullanıcı dikdörtgeni seçerse burası çalışır
                System.out.print("Dikdörtgenin uzun kenarını giriniz: "); // Kullanıcıdan dikdörtgenin uzun kenarını girmesini istedik
                int dikdortgenUzunKenar = tara.nextInt(); // Kullanıcının girdiği değeri taradık

                System.out.print("Dikdörtgenin kısa kenarını giriniz: "); // Kullanıcıdan dikdörtgenin kısa kenarını girmesini istedik
                int dikdortgenKisaKenar = tara.nextInt(); // Kullanıcının girdiği değeri taradık

                int dikdortgenAlani = dikdortgenUzunKenar * dikdortgenKisaKenar; // Dikdörtgenin alanının formülünü tanımladık
                int dikdortgenCevresi = 2 * (dikdortgenUzunKenar + dikdortgenKisaKenar); // Dikdörtgenin çevresinin formülünü tanımladık

                System.out.println("Dikdörtgenin alanı: " + dikdortgenAlani + " metre " + "çevresi: " + dikdortgenCevresi + " metre"); // Ekrana dikdörtgenin alanını ve çevresini yazdırdık
                break;

            case "kare" : // Kullanıcı kareyi seçerse burası çalışır
                System.out.print("Karenin kenarını giriniz: "); // Kullanıcıdan karenin kenarını girmesini istedik
                int kareKenar = tara.nextInt(); // Kullanıcının girdiği değeri taradık

                int kareAlan = kareKenar * kareKenar; // Karenin alanını tanımladık
                int kareCevre = (4 * kareKenar); // Karenin çevresini tanımladık

                System.out.println("Karenin alanı: " + kareAlan + " metre " + "çevresi: " + kareCevre + " metre"); // Ekrana karenin alanını ve çevresini yazdırdık
                break;

            case "üçgen": // Kullanıcı üçgeni seçerse burası çalışır
                System.out.print("Üçgenin birinci kenarını giriniz: "); // Kullanıcıdan üçgenin birinci kenarını girmesini istedik
                double ucgenBirinciKenar = tara.nextDouble(); // Kullanıcının girdiği değeri taradık

                System.out.print("Üçgenin ikinci kenarını giriniz: "); // Kullanıcıdan üçgenin ikinci kenarını girmesini istedik
                double ucgenIkinciKenar = tara.nextDouble(); // Kullanıcının girdiği değeri taradık

                System.out.print("Üçgenin üçüncü kenarını giriniz: "); // Kullanıcıdan üçgenin üçüncü kenarını girmesini istedik
                double ucgenUcuncuKenar = tara.nextDouble(); // Kullanıcının girdiği değeri taradık

                double ucgenCevre = ucgenBirinciKenar + ucgenIkinciKenar + ucgenUcuncuKenar; // Üçgenin çevresinin formülünü tanımladık
                double ucgenYariCevre = ucgenCevre / 2; // Üçgenin yarım çevresinin formülünü tanımladık
                double ucgenAlan = Math.sqrt(ucgenYariCevre * (ucgenYariCevre - ucgenBirinciKenar) * (ucgenYariCevre - ucgenIkinciKenar) * (ucgenYariCevre - ucgenUcuncuKenar)); // Üçgenin alanının formülünü tanımladık

                System.out.println("Üçgenin alanı: " + ucgenAlan + " metre " + "çevresi: " + ucgenCevre + " metre"); // Ekrana üçgenin alanını ve çevresini yazdırdık
                break;

            default: // Kullanıcı yanlış bir değer seçerse burası çalışır
                System.out.println("Yanlış bir ifadeyi seçtiniz lütfen yeniden seçim yapınız"); // Kullanıcıya yeniden seçim yapmasını söyledik
                break;

        }

    }
}
