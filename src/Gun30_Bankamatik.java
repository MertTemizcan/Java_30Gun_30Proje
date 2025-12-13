import java.util.Scanner;

public class Gun30_Bankamatik {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in); // Kullanıcıdan veri alan kütüphaneyi sistemimize dahil ettik

        System.out.print("Hesap bakiyenizi giriniz: "); // Kullanıcıdan hesap bakiyesini girmesini istedik
        int hesapBakiyesi = tara.nextInt(); // Kullanıcının girdiği değeri taradık

        tara.nextLine(); // Programın hata vermemesi için boşluğu temizledik

        System.out.print("Yapmak istediğiniz işlemi giriniz para yatırma, para çekme, havale : "); // Kullanıcıdan hangi islemi yapmak istediğini seçmesini istedik
        String yapilacakIslem = tara.nextLine().toLowerCase(); // Kullanıcının girdiği değeri taradık


        switch (yapilacakIslem) {
            case "para yatırma": // Kullanıcı para yatırma işlemi yapmak isterse

                System.out.print("Yatırmak istediğiniz tutarı giriniz: "); // Kullanıcıdan yatırmak istediği tutarı girmesini istedik
                int yatirilacakPara = tara.nextInt(); // Kullanıcının girdiği değeri taradık

                if(yatirilacakPara <= 0) { // Kullanıcı 0 veya negatif bir değer girerse
                    System.out.println("Lütfen pozitif bir değer giriniz"); // Ekrana hata mesajı yazdırılır
                } else {
                    int guncelBakiye = (hesapBakiyesi + yatirilacakPara); // Güncel bakiye işleminin formülünü tanımladık

                    System.out.println("İşlem sonrası güncel bakiyeniz: " + guncelBakiye + " TL"); // Ekrana işlem sonrası güncel bakiyeyi yazdırdık
                } break;



            case "para çekme": // Kullanıcı para çekme işlemi yapmak isterse

                System.out.print("Çekmek istediğiniz tutarı giriniz: "); // Kullanıcıdan çekmek istediği para tutarını girmesini istedik
                int cekilenPara = tara.nextInt(); // Kullanıcının girdiği değeri taradık

                if(cekilenPara == 0) { // Eğer kullanıcı 0 veya negatif bir değer girerse
                    System.out.println("Lütfen pozitif bir değer giriniz"); // Ekrana hata mesajı yazdırılır
                } else if (cekilenPara > hesapBakiyesi) { // Eğer kullanıcı bakiyesinden fazla bir miktarı çekmek isterse
                    System.out.println("Yetersiz bakiye"); // Ekrana bakiyenin yetersiz olduğu yazdırılır
                } else {
                    int eksilenBakiye = (hesapBakiyesi - cekilenPara); // Para çekildikten sonraki bakiye miktarını tanımladık

                    System.out.println("İşlem sonrası güncel bakiyeniz: " + eksilenBakiye + " TL"); // Ekrana işlem sonrası güncel bakiyeyi yazdırdık

                } break;

            case "havale": // Kullanıcı havale işlemi yapmak isterse

                System.out.print("Havale yapmak istediğiniz kişinin adını ve soyadını giriniz: "); // Kullanıcıdan havale yapmak istediği kişinini adını ve soyadını girmesini istedik
                String havaleAdSoyad = tara.nextLine(); // Kullanıcının girdiği değeri taradık

                System.out.print("Havale yapmak istediğiniz tutarı giriniz: "); // Kullanıcıdan havale yapmak istediği tutarı girmesini istedik
                int havaleTutari = tara.nextInt(); // Kullanıcının girdiği değeri taradık

                if (havaleTutari <= 0) { // Eğer kullanıcı negatif bir değer girerse
                    System.out.println("Lütfen pozitif bir değer giriniz."); // Ekrana hata mesajı yazdırılır
                } else if (havaleTutari > hesapBakiyesi) { // Eğer kullanıcı bakiyesinden fazla bir miktarı göndermek isterse
                    System.out.println("Yetersiz bakiye."); // Ekrana bakiyenin yetersiz olduğu yazdırılır
                } else {
                    int havaleBakiyesi = (hesapBakiyesi - havaleTutari); // Havale sonrası güncel bakiyenin formülünü tanımladık

                    System.out.println(havaleAdSoyad + " adlı kişiye " + havaleTutari + " tl transfer işlemi gerçekleşmiştir"); // Ekrana havale işleminin detayları yazdırılır
                    System.out.println("İşlem sonrası güncel bakiyeniz: " + havaleBakiyesi + " TL"); // Ekrana işlem sonrası güncel bakiye yazdırılır

                } break;





            default:
                System.out.println("Hatalı bir tuşlama yaptınız");
                break;
        }
    }
}
