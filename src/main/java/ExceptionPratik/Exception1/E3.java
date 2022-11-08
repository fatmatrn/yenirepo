package ExceptionPratik.Exception1;

public class E3 {
    public static void main(String[] args) {
     String s1 ="ali";
     writeLength(s1);
     String s2 =null;
     writeLength(s2);
     String s3 ="";
     writeLength(s3);


        }

    public static void writeLength(String s){
        try{
            System.out.println(s.length());
        }catch (NullPointerException e){
            System.out.println("bos string"+e.getMessage());
            e.getStackTrace();
            System.err.println("renkli mesaj");
        }

    }
}
