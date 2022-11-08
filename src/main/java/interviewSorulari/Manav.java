package interviewSorulari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manav {
    // * Basit bir 5 ürünlü manav alisveris programi yaziniz.
    //         *
    //         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
    //         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
    //         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
    //         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
    //         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
    //         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
    //        Ipucu:
    //        Class icinde 3 method olacak
    //         * main() isimli bir method
    //         * musteriSecimi() isimli bir method
    //         * kasa() isimli bir method (edited)
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("portakal");
        list.add("elma");
        list.add("armut");
        list.add("marul");
        list.add("domates");

        List<Double> fiyat = new ArrayList<>();
        fiyat.add(9.99);
        fiyat.add(15.99);
        fiyat.add(19.99);
        fiyat.add(7.5);
        fiyat.add(9.0);

        kasa(musteriSecimi(list, fiyat));

    }

    public static double musteriSecimi(List<String> list, List<Double> fiyat) {

        double toplam = 0;
        double araToplam = 0;
        int counter = 0;


        System.out.println("********Hosgeldiniz*******\nurun eklemek icin h ye alisverisi sonlandirmak icin e ye basiniz");
        System.out.println("Sepetinizde " + counter + " urun var.");
        do {
            counter++;
            char ch = input.next().charAt(0);
            if (ch == 'E' || ch == 'e') {
                break;
            } else if (ch == 'H' || ch == 'h') {


                System.out.println("Urun kodunu giriniz");
                int kod = input.nextInt() - 1;
                System.out.println("Kac kilogram alacaksiniz");
                double kg = input.nextDouble();

                araToplam = fiyat.get(kod) * kg;
                System.out.println(kg + " kg " + list.get(kod) + " tutari= " + araToplam);
                toplam += fiyat.get(kod) * kg;
                System.out.println("toplam tutar= " + toplam);

                System.out.println("Sepetinizde " + counter + " urun var.\nAlisverisinizi sonlandirmak istiyor musunuz?");

            }
        } while (true);
        return toplam;
    }

    public static void kasa(double toplam) {
        System.out.println("Alisverisinizin toplam tutari= " + toplam + "TL'dir.");
    }

}
