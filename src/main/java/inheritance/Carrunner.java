package inheritance;

public class Carrunner {
    public static void main(String[] args) {
        Car car1 = new Car();// buradan constructor a gider ama Car() boş olduğu için parametresiz constructora gier
        car1.ilan = 1001;
        car1.model = "corolla";
        car1.marka = "toyota";
        car1.yil =2010;
        car1.fiyat =88000;
        car1.hiz(200);
        car1.yakit("dizel");
        System.out.println(car1.ilan + " "+car1.model+" "+car1.marka+ " "+ car1.yil+" "+car1.fiyat);
        Car car2 = new Car(500,"audi","A5",2015,805000);
        Car car3 = new Car("BMW");
    }
}
