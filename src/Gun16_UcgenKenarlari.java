import java.util.Scanner;

public class Gun16_UcgenKenarlari {
    public static void main(String[] args) {
            Scanner tara = new Scanner(System.in); // Kullanıcıdan veri alan kütüphaneyi sistemimize dahil ettik

            System.out.print("Üçgenin birinci kenarını giriniz: "); // Kullanıcıdan üçgenin birinci kenarını girmesini istedik
            int birinciKenar = tara.nextInt(); // Kullanıcının girdiği değeri taradık

            System.out.print("Üçgenin ikinci kenarını giriniz: "); // Kullanıcıdan üçgenin ikinci kenarını girmesini istedik
            int ikinciKenar = tara.nextInt(); // Kullanıcının girdiği değeri taradık

            System.out.print("Üçgenin üçüncü kenarını giriniz: "); // Kullanıcıdan üçgenin üçüncü kenarını girmesini istedik
            int ucuncuKenar = tara.nextInt(); // Kullanıcının girdiği değeri taradık

            if((birinciKenar == ikinciKenar) && (birinciKenar == ucuncuKenar)){ // Eğer bütün kenarlar birbirine eşitse
                System.out.println("Eşkenar üçgen"); // Ekrana eşkenar üçgen yazdırılır
            }else if((birinciKenar != ikinciKenar) && (birinciKenar!= ucuncuKenar) && (ikinciKenar != ucuncuKenar)){ // Eğer hiçbir kenar birbirine eşit değilse
                System.out.println("Çeşit kenar üçgen"); // Ekrana çeşit kenar üçgen yazdırılır
            }else{ // Eğer herhangi iki kenar birbirine eşitse
                System.out.println("İkizkenar üçgen"); // Ekrana ikizkenar üçgen yazdırılır
            }


        }
    }

