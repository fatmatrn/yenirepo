package inheritance;

public class Car {
    public int ilan;
    public String marka;
    public String model;
    public int yil;
    public int fiyat;

    public void hiz(int maxhiz){
        System.out.println("Araba max "+ maxhiz+ " km hız yapar");
    }
    public void yakit(String yakitturu){
        System.out.println("Araba yakıt olarak " +yakitturu + " kullanır");
    }
    public Car(){// parametresiz yer burası bu body içinde ne varsa o çlışır
        System.out.println("Burası boş olan Constructor");
    }
    public Car(int ilan, String marka, String model, int yil, int fiyat){  // Car(main içindeki datalar burası ile uyumlu olacak ki buraya gelsin)
        this.ilan = ilan;
        this. marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
        System.out.println(model + " "+yil);
    }
    public Car(String marka){
        this.marka = marka;
        System.out.println(marka);
    }
}
