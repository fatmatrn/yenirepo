package ExceptionPratik.Exception1;

public class E2 {

    public static void main(String[] args) {
     write("ali",2);
     write("vali",0);
     write("zalim",6);
    }

    public static void write(String s,int idx) {
        try {
            System.out.println(s.substring(idx));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index hatasi"+e.getMessage());
            e.printStackTrace();
            System.err.println("renkli uyari");


        }

    }



}
