import java.util.Scanner;

public class Gun14_PalindromKelime {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in); // Kullanıcıdan veri alan kütüphaneyi sistemimize dahil ettik

        System.out.println("Palindrom kelime kontrol uygulamasına hoşgeldiniz"); // Kullanıcıyı selamladık

        System.out.print("Bir kelime giriniz: "); // Kullanıcıdan bir kelime girmesini istedik
        String kelime = tara.nextLine(); // Kullanıcının girdiği kelimeyi taradık

        String tersKelime = new StringBuilder(kelime).reverse().toString(); // Kullanıcının girdiği kelimeyi ters çevirdik

        if(kelime.equalsIgnoreCase(tersKelime)) { // Eğer kelimenin normal hali ile tersten yazılışı aynı ise
            System.out.println("Girdiğiniz kelime bir palindrom kelimedir");  // Ekrana kullanıcının girdiği kelimenin palindrom kelime olduğunu yazdırdık
        } else { // Eğer kelimenin normal hali ile tersten yazılışı aynı değil ise
            System.out.println("Girdiğiniz kelime palindrom kelime değildir"); // Ekrana kullanıcının girdiği kelimenin palindrom kelime olmadığını yazdırdık
        }
    }
}
