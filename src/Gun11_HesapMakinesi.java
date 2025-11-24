import java.util.Scanner;

public class Gun11_HesapMakinesi {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in); // Kullanıcıdan veri alan kütüphaneyi sistemimize dahil ettik

        System.out.println("Basit hesap makinesi programına hoşgeldiniz"); // Kullanıcıyı selamladık

        System.out.print("Birinci sayıyı giriniz: "); // Kullanıcıdan birinci sayıyı girmesini istedik
        int sayi1 = tara.nextInt(); // Kullanıcının girdiği değeri taradık

        System.out.print("İkinci sayıyı giriniz: "); // Kullanıcıdan ikinci sayıyı girmesini istedik
        int sayi2 = tara.nextInt();  // Kullanıcının girdiği değeri taradık

        System.out.print("Lütfen yapmak istediğiniz işlemi giriniz(+ - / *): "); // Kullanıcıdan yapmak istediği işlemi girmesini istedik
        char karakter = tara.next().charAt(0); // Kullanıcını yapmak istediği işlemi taradık

        int toplamaIslemi = sayi1 + sayi2; // Toplama işlemini tanımladık
        int cikarmaIslemi = sayi1 - sayi2; // Çıkarma işlemini tanımladık
        int carpmaIslemi = sayi1 * sayi2; // Çarpma işlemini tanımladık
        double bolmeIslemi = (double) sayi1 / sayi2; // Bölme işlemini tanımladık

        switch (karakter) {
            case '+': // Eğer kullanıcı + sembolünü seçerse
                System.out.println("Toplama işleminin sonucu: " + toplamaIslemi); break; // Ekrana toplama işleminin sonucu yazdırılır
            case '-': // Eğer kullanıcı - sembolünü seçerse
                System.out.println("Çıkarma işleminini sonucu: " + cikarmaIslemi); break; // Ekrana çıkarma işleminin sonucu yazdırılır
            case '*': // Eğer kullanıcı * sembolünü seçerse
                System.out.println("Çarpma işleminin sonucu: " + carpmaIslemi); break; // Ekrana çarpma işleminin sonucu yazdırılır
            case '/': // Eğer kullanıcı / sembolünü seçerse
                if(sayi2 !=0) { // Ve ikinci sayı 0 değilse
                    System.out.println("Bölme işleminin sonucu: " + bolmeIslemi); // Ekrana bölme işleminin sonucu yazdırılır
                }else{ // Eğer ikinci sayı 0 ise
                    System.out.println("Bir sayı sıfıra bölünemez"); // Ekrana sayının sıfıra bölünemyeceği yazdırılır
                } break;

            default:
                System.out.println("Hatalı bir karakter girdiniz"); // Eğer hatalı bir karakter girilirse ekrana hata mesajı yazdırılır
        }

    }
}
