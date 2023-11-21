import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sayi;
        int basamakhesaplama = 0;
        System.out.print("sayıyı giriniz : ");
        sayi = scan.nextInt();
        int sifirlama = sayi;
        int kalan;
        int sonuc = 0;
        int ustalma;

        while (sifirlama != 0) {
            basamakhesaplama++;
            sifirlama /= 10;
        }

        sifirlama = sayi;
        while (sayi != 0) {
            kalan = sayi % 10;
            ustalma = 1;
            for (int i = 1; i <= basamakhesaplama; i++) {
                ustalma *= kalan;
            }
            sonuc += ustalma;
            sayi /= 10;
        }

        if (sonuc == sifirlama) {
            System.out.println(sifirlama + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(sifirlama + " sayısı bir Armstrong sayısı değildir.");
        }
    }
}
