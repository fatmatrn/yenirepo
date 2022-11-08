package inheritance;

public class Runner {

    public static void main(String[] args) {

        Kiraz kiraz1 = new Kiraz();
        System.out.println(kiraz1.a);
        System.out.println(kiraz1.b);


        Agaclar kiraz2 = new Kiraz();
        System.out.println(kiraz2.a);
        kiraz2.grow();

        Bitkiler kiraz3 = new Kiraz();
        System.out.println(kiraz3.a);

        Kiraz meyve1 = new Kiraz();
        meyve1.grow();
        meyve1.drink();

        Bitkiler meyve2 = new Agaclar();
        meyve2.grow();

        Bitkiler meyve3 = new Bitkiler();
        meyve3.grow();

        Kiraz kiraz4 = new Kiraz();







    }


}
