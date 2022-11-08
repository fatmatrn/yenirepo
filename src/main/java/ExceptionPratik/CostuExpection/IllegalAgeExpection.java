package ExceptionPratik.CostuExpection;

public class IllegalAgeExpection extends RuntimeException{
    public IllegalAgeExpection(String message){
        super(message);
    }
}
