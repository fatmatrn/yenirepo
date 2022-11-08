package bosSayfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {

       long binary1, binary2;
        Scanner in = new Scanner(System.in);
        System.out.println("lutfen iki binary sayi giriniz");
        binary1 = in.nextLong();
        binary2 = in.nextLong();



      //  System.out.println(intYap(listYap(binary1)));
     //  System.out.println(intYap(listYap(binary2)));
        System.out.println(listYap(100010));


    }
    public static List<Integer>   listYap(long binary) {

        List<Integer> list = new ArrayList<>();
        for (int i =list.size()-1; i >=0 ; i--) {
            list.add(i,(int)binary%10);
            binary/=10;
            if (binary==0){
                break;
            }
        }
        return list;
    }
  /* public static int intYap(List<Integer> list){
            int us=0;
            int toplam=0;
        for (int i = list.size()-1; i >=0; i--) {
            toplam+=Math.pow(2,us)*list.get(i);
            us++;
        }

        return toplam;
    }



      public static List<Integer> binaryYap(int a){
           List<Integer> list = new ArrayList<>();
           int idx = list.size()-1;

            for (int i = a; i > 1; i--) {
                list.set(idx,a%2);
                idx--;
                a /= 2;
                if (a/2<2){
                    list.set(0,a/2);
                }
                

            }

          return list;
        }*/

    }

