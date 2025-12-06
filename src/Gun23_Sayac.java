import java.util.Scanner;

public class Gun23_Sayac {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);

        System.out.println("Sayaç programına hoşgeldiniz");
        System.out.println();
        System.out.print("Geriye saymak istediğiniz sayıyı giriniz: ");
        int sayi1 = tara.nextInt();

        if (sayi1 <= 0) {
            System.out.println("Lütfen sıfırdan büyük bir sayı giriniz!");
        } else {
            while (sayi1 > 0) {
                System.out.println("Sayı: " + sayi1);
                sayi1--;
            }
            System.out.println("Sayaç bitti!");
        }
    }
}
