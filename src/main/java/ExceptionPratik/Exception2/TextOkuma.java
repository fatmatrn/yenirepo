package ExceptionPratik.Exception2;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TextOkuma {
    public static void main(String[] args) throws IOException {
        readTheText();
        readText();
    }

    public static void readTheText() throws IOException {
        FileInputStream fis = new FileInputStream("src\\main\\java\\ExceptionPratik\\Exception2\\Text");

        int k=0;

        while ((k=fis.read())!=-1){
            System.out.print((char) k);
        }
    }

    public static  void readText(){
        try {
            FileInputStream fis= new FileInputStream("src\\main\\java\\ExceptionPratik\\Exception2\\Text");

            int k = 0;
            while ((k=fis.read())!=-1){
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya'nin adresi ve varligi ile ilgili bir problem var");
        } catch (IOException e) {
            System.out.println("Dosya da okunamayan bir karakter var");
        }
    }
}
