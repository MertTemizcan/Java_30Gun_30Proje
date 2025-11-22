import java.util.Scanner;

public class Gun9_PozitifmiNegatifmi {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in); // Kullanıcıdan veri alan kütüphaneyi sistemimize dahil ettik


        System.out.print("Birinci sayıyı giriniz: "); // Kullanıcıdan birinci sayıyı girmesini istedik
        int sayi1 = tara.nextInt(); // Kullanıcının girdiği sayıyı taradık

        System.out.print("İkinci sayıyı giriniz: "); // Kullanıcıdan ikinci sayıyı girmesini istedik
        int sayi2 = tara.nextInt(); // Kullanıcının girdiği değeri taradık

        if(sayi1 > 0 && sayi2 > 0) { // Eğer iki sayıda sıfırdan büyükse
            System.out.println("Birinci sayı ve ikinci sayı pozitif"); // Ekrana iki sayınında pozitif olduğunu yazdırdık
        } else if (sayi1 > 0 && sayi2 < 0) { // Eğer birinci sayı sıfırdan büyük ikinci sayı sıfırdan küçükse
            System.out.println("Birinci sayı pozitif ikinci sayı negatif"); // Ekrana birinci sayının pozitif ikinci sayının negatif olduğunu yazdırdık
        } else if (sayi1 < 0 && sayi2 > 0) { // Eğer birinci sayı sıfırdan küçükse ve ikinci sayı sıfırdan büyükse
            System.out.println("Birinci sayı negatif ikinci sayı pozitif"); // Ekrana birinci sayının negatif ikinci sayının pozitif olduğunu yazdırdık
        } else if (sayi1 < 0 && sayi2 < 0) { // Eğer birinci sayı ve ikinci sayı sıfırdan küçükse
            System.out.println("Birinci sayı ve ikinci sayı negatif"); // Ekrana iki sayınında sıfırdan küçük olduğunu yazdırdık
        } else if (sayi1 == 0 && sayi2 > 0) { // Eğer birinci sayı sıfırsa ve ikinci sayı sıfırdan büyükse
            System.out.println("Birinci sayı sıfır ikinci sayı pozitif"); // ekrana birinci sayının sıfır ikinci sayının pozitif olduğunu yazdırdık
        } else if (sayi1 == 0 && sayi2 < 0) { // Eğer birinci sayı sıfır ve ikinci sayı sıfırdan küçükse
            System.out.println("Birinci sayı sıfır ikinci sayı negatif"); // Ekrana birinci sayının sıfır ikinci sayının negatif olduğunu yazdırdık
        } else if (sayi1 > 0 && sayi2 == 0) { // Eğer birinci sayı sıfırdan büyükse ve ikinci sayı sıfırsa
            System.out.println("Birinci sayı pozitif ikinci sayı sıfır"); // Ekrana birinci sayının pozitif ikinci sayının negatif olduğunu yazdırdık
        } else if (sayi1 < 0 && sayi2 == 0) { // Eğer birinci sayı sıfırdan küçükse ve ikinci sayı sıfırsa
            System.out.println("Birinci sayı negatif ikinci sayı sıfır"); // Ekrana birinci sayının negatif ikinci sayının sıfır olduğunu yazdırdık
        } else if (sayi1 == 0 && sayi2 == 0) { // Eğer birinci sayı ve ikinci sayı sıfırsa
            System.out.println("Birinci sayı ve ikinci sayı sıfır"); // Ekrana birinci ve ikinci sayının sıfır olduğunu yazdırdık
        }
    }
}
