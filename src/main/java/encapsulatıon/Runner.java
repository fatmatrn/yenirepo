package encapsulatıon;

public class Runner {
    public static void main(String[] args) {
        E1 hesap =  new E1("123456789",2000);
        System.out.println(hesap.getBalance());
        hesap.deposit(1000, 2000, 3000,5000);
        hesap.wirhDraw(1000,1000,1000,1000,1000,1000);

    }
}
