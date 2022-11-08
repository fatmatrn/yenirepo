package bosSayfa;

import java.util.ArrayList;
import java.util.List;

public class A2 {
    public static void main(String[] args) {
        int a =14;
        List<Integer> list = new ArrayList<>();
        int idx = list.size()-1;

        for (int i = a; i > 1; i--) {
            list.set(idx,a%2);
            idx--;
            a /= 2;
            if (idx==0&&a/2<2){
                list.set(0,a/2);
            }


        }
        System.out.println(list);
       /* int i=0;
        do {
            list.add((int) binary1 % 10);

            binary1 /= 10;
            i++;
        } while (binary1 > 0);
        return list;*/
    }
}
