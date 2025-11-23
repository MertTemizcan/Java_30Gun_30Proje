import java.util.Scanner;

public class Gun10_VizeFinal {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in); // Kullanıcıdan veri alan kütüphaneyi sistemimize dahil ettik

        System.out.print("Vize notunuzu giriniz: "); // Kullanıcıdan vize notunu girmesini hesapladık
        int vizeNotu = tara.nextInt(); // Kullanıcının girdiği değeri taradık

        System.out.print("Final notunuzu giriniz: "); // Kullanıcıdan final notunu girmesini istedik
        int finalNotu = tara.nextInt(); // Kullanıcının girdiği değeri taradık

        double ortalama = (vizeNotu * 0.4) + (finalNotu * 0.6); // Ortalamanın formülünü tanımladık

        System.out.println("Ortalamanız: " + ortalama); // Kullanıcıya not ortalamasını yazdırdık

        if(ortalama >= 50) { // Eğer ortalama 50 den büyük veya eşitse
            System.out.println("Geçtiniz"); // Ekrana kullanıcının dersten geçtiği bilgisi yazdırılır
        }else { // Eğer ortalama 50 den küçükse
            System.out.println("Kaldınız"); // Ekrana kullanıcının dersten kaldığı bilgisi yazdırılır
        }
    }
}
