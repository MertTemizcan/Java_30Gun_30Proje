import java.util.Scanner;

public class Gun18_FaktoriyelHesaplama {
        public static void main(String[] args) {
            Scanner tara = new Scanner(System.in); // Kullanıcıdan veri alan kütüphaneyi sistemimze dahil ettik

            System.out.print("Faktöriyeli hesaplanıcak sayıyı giriniz: "); // Kullanıcıdan faktöriyelini hesaplatmak istediği sayıyı girmesini istedik
            int sayi = tara.nextInt(); // Kullanıcının girdiği değeri taradık

            int sayac = 1; // Sayaç değişkeninin başlangıç değerine 1 atadık
            long faktoriyel = 1; // Faktöriyel değişkeninin başlangıç değerine 1 atadık
            while (sayac <= sayi){
                faktoriyel *= sayac;
                sayac ++;
            }
            System.out.print(sayi + " sayısının faktöriyeli: " + faktoriyel); // Ekrana kullanıcının girdiği sayının faktöriyelini yazdırdık
        }
    }


