import java.util.Scanner;

public class Gun6_KullaniciyiSelamla {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in); // Kullanıcıdan veri alan kütüphaneyi sistemimize ekledik

        System.out.print("Adınızı giriniz: "); // Kullanıcıdan adını girmesini istedik
        String ad = tara.nextLine(); // Kullanıcının girdiği değeri taradık

        System.out.print("Soyadınızı giriniz: "); // Kullanıcıdan soyadını girmesini istedik
        String soyad = tara.nextLine(); // Kullanıcının girdiği değeri taradık

        System.out.println("Merhaba " + ad + " " + soyad); // Kullanıcının girdiği değerleri ekrana yazarak kullancıyı selamladık
    }
}
