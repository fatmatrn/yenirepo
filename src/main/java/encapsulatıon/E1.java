package encapsulatıon;

public class E1 {
    // 1- bir Account sınıfı oluşturunuz, fieldları accountNumber ve balance (bakiye).
    // 2- bir consructor ekleyiniz.
    // 3- Account sınıfına deposit (ParaEkle) metodu ekleyiniz.
    // 4- Account sınıfına withdraw (ParaÇıkar) metodu ekleyiniz.
    // 5- withdraw de 5000 inin üzerine Günlük limiti aştınız uyarısı verelim
    // 6- main metodunda  account oluşturarak ihtimalleri deneyiniz.

    private String accountNumber = "";
    private long balance = 0;

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public E1(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long deposit(long... paraMiktari) {
        long sum = 0;
        for (long w : paraMiktari) {
            sum += w;
        }
        balance+=sum;
        System.out.println("hesap bakiyeniz: "+balance);
        return balance;
    }

    public long wirhDraw(long... cekilenPara) {
        long sum = 0;
        for (int i = 0; i < cekilenPara.length; i++) {
            sum+=cekilenPara[i];
            if (sum>5000){
                System.out.println("Gunluk limiti astiniz");
            }
              break;
        }
        balance-= sum;
        System.out.println("Kalan bakiye: "+balance);
        return balance;
    }


}
