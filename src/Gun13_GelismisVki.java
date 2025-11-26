import java.util.Locale;
import java.util.Scanner;

public class Gun13_GelismisVki {

        public static void main(String[] args) {
            Scanner tara = new Scanner(System.in); // Kullanıcıdan veri alan kütüphaneyi sistemimize dahil ettik
            tara.useLocale(Locale.US); // Amerika yazım standartlarını sistemimize dahil ettik

            System.out.println("Vücut kitle endeksi programına hoşgeldiniz"); // Kullanıcıyı selamladık

            System.out.print("Boyunuzu metre(m) cinsinden giriniz: "); // Kuulanıcıdan boyunu metre cinsiden girmesini istedik
            float boy = tara.nextFloat(); // Kullanıcının girdiği değeri taradık

            System.out.print("Kilonuzu kilogram (kg) cinsinden giriniz: "); // Kullanıcıdan kilosunu kilogram cinsinden girmesini istedik
            float kilo = tara.nextFloat(); // Kullanıcının girdiği değeri taradık

            float vki = kilo / (boy * boy); // Vücut kitle endeksinin formülünü tanımladık

            System.out.println("Vücut kitle endeksiniz: " + vki); // Ekrana kullanıcının vücut kitle endeksini yazdırdık

            if(vki < 18.5) { // Eğer vücut kitle endeksi 18.5 ten küçükse
                System.out.println("Zayıf"); // Ekrana kullanıcının zayıf olduğu yazdırılır
            }else if (vki >= 18.5 && vki < 24.9) { // Eğer vücut kitle endeksi 18.5 e eşit veya büyükse ve 24.9 dan küçükse
                System.out.println("Normal kilolu"); // Ekrana kullanıcının normal kilolu olduğu yazdırılır
            } else if(vki >= 24.9 && vki < 29.9) { // Eğer vücut kitle endeksi 24.9 a eşit veya büyükse ve 29.9 dan küçükse
                System.out.println("Fazla kilolu"); // Ekrana kullanıcının fazla kilolu olduğu yazdırılır
            }else if(vki >= 29.9 && vki < 34.9) { // Eğer vücut kitle endeksi 29.9 a eşit veya büyükse ve 34.9 dan küçükse
                System.out.println("Obez (1. derece)"); // Ekrana kullanıcının 1. derece obez olduğu yazdırılır
            }else if(vki >= 34.9 && vki < 39.9) { // Eğer vücut kitle endeksi 34.9 a eşit veya büyükse ve 39.9 dan küçükse
                System.out.println("Obez (2. derece)"); // Ekrana kullanıcının 2. derece obez olduğu yazdırılır
            }else if(vki >= 39.9) { // Eğer vücut kitle endeksi 39.9 a eşit veya  büyükse
                System.out.println("Obezite (3. derece)"); // Ekrana kullanıcının 3. derece obez olduğu yazdırılır
            }
        }
    }

