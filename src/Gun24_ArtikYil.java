import java.util.Scanner;

public class Gun24_ArtikYil {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in); // Kullanıcıdan veri alan kütüphaneyi sistemimize dahil ettik

        System.out.println("Artık yıl hesaplayan programa hoşgeldiniz"); // Kullanıcıyı selamladık
        System.out.println();
        System.out.print("Hesaplamak istediğiniz yılı giriniz: "); // Kullanıcıdan bir yıl girmesini istedik
        int girilenYil = tara.nextInt(); // Kullanıcının girdiği değeri taradık

        if (girilenYil % 400 == 0 || (girilenYil % 4 == 0 && girilenYil % 100 != 0)) { // Eğer girilen yıl 400 e tam bölünüyorsa veya girilen yıl 4 e tam bölünüyorsa ve 100 e tam bölünmüyorsa
            System.out.println("Girdiğiniz yıl " + girilenYil + " bir artık yıldır"); // Ekrana kullanıcının girdiği yılın artık yıl olduğu bilgisi yazdırılır
        } else { // Eğer hiçbir koşul sağlanmıyorsa
            System.out.println("Girdiğiniz yıl bir artık yıl değildir"); // Ekrana kullanıcının girdiği yılın artık yıl olmadığı yazdırılır
        }

    }
}
