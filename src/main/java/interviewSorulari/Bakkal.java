package interviewSorulari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bakkal {

    //TASK -2:
    //     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
    //     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
    //     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
    //     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
    //     *
    //     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
    //     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
    //     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList’e ekle.
    //     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
    //     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
    //     *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
    //     *           ortalama kazançtan yüksekse o günleri return yap.
    //     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
    //     *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
    //     *           ortalama kazançtan aşağıysa o günleri return yap. (edited)


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("monday");
        list.add("tuesday");
        list.add("wednesday");
        list.add("thursday");
        list.add("friday");
        list.add("saturday");
        list.add("sunday");

        Scanner input = new Scanner(System.in);
        List<Double> earning = new ArrayList<>();
        int i = 0;
        while(i<list.size()){
            System.out.println("Please enter your earnings for  "+list.get(i));
            earning.add(input.nextDouble());
            i++;
        }
        double average = getAverageEarnings(earning);
        System.out.println(average);
        getMoreThanAverage(list,earning,average);
        getLessThanAverage(list,earning,average);

    }

    public static double getAverageEarnings (List<Double> a) {
        double sum = 0;
        for (double w:a){
            sum = sum + w;
        }
        double averageEarnings = sum/a.size();
        return averageEarnings;

    }

    public static void getMoreThanAverage (List<String> a, List<Double> b, double average){
        List<String> moreThanAverage = new ArrayList<>();


        for (int i=0; i<b.size(); i++){
            if (b.get(i)>average){
                moreThanAverage.add(a.get(i));
            }

        }
        System.out.println("moreThanAverage = " + moreThanAverage);
    }


    public static void getLessThanAverage (List<String> a, List<Double> b, double average){
        List<String> lessThanAverage = new ArrayList<>();


        for (int i=0; i<b.size(); i++){
            if (b.get(i)<average){
                lessThanAverage.add(a.get(i));
            }

        }
        System.out.println("lessThanAverage = " + lessThanAverage);
    }


}

