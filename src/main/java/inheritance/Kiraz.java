package inheritance;

public class Kiraz extends Agaclar{

    private String  std = "hgfhjguhg";


    public int a = 1;




    public void grow(){
        System.out.println("cherries grow");
    }

    public Kiraz(){
        System.out.println("kiraz");
    }

    @Override
    public void drink() {
        System.out.println("cherries drink");
    }

    public String getStd() {
        return std;
    }
}

