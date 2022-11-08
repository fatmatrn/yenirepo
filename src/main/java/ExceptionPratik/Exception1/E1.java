package ExceptionPratik.Exception1;


public class E1 {
    public static void main(String[] args) {
        divide(5,3);
       divide2(5, 0);

    }
    public static void  divide(double a,double b){
        System.out.println(a / b);
    }

    public static void divide2(int a,int b){
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("payda sifir olamaz"+ e.getMessage());
            e.printStackTrace();
            System.err.println("payda sifir olamaz");
        }

    }

}
