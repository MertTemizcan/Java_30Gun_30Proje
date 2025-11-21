import java.util.Scanner;

public class Gun8_TekmiCiftmi {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in); // Kullanıcıdan veri alan kütüphaneyi sistemimize ekledik

        System.out.print("Birinci sayıyı giriniz: "); // Kullanıcıdan birinci sayıyı girmesini istedik
        int sayi1 = tara.nextInt(); // Kullanıcının girdiği değeri taradık

        System.out.print("İkinci sayıyı giriniz: "); // Kullanıcıdan ikinci sayıyı girmesini istedik
        int sayi2 = tara.nextInt(); // Kullanıcının girdiği değeri taradık

        if(sayi1 % 2 == 0 && sayi2 % 2 == 0) { // Eğer birinci sayı ve ikinci sayının 2 ile bölümünden kalan 0 ise
            System.out.println("Birinci ve ikinci sayı çift sayıdır"); // Ekrana girilen her 2 sayının çift olduğunu yazdırdık
        } else if (sayi1 % 2 != 0 && sayi2 % 2 == 0) { // Eğer birinci sayının 2 ile bölümünden kalan 0 değil ise
            System.out.println("Birinci sayı tek ikinci sayı çift sayıdır"); // Ekrana birinci sayının tek ikinci sayının çift olduğunu yazdırdık
        } else if (sayi1 % 2 == 0 && sayi2 % 2 != 0) { // Eğer ikinci sayının 2 ile bölümünden kalan 0 değil ise
            System.out.println("Birinci sayı çift ikinci sayı tek sayıdır"); // Ekrana birinci sayının çift ikinci sayının tek olduğunu yazdırdık
        }else { // Eğer hiçbir koşul sağlanmıyorsa
            System.out.println("Birinci sayı ve ikinci sayı tek sayıdır"); // Ekrana birinci sayı ve ikinci sayının tek olduğunu yazdırdık
         }
    }
}
