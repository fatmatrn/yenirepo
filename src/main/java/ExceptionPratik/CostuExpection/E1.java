package ExceptionPratik.CostuExpection;

public class E1 {
    public static void main(String[] args) throws IllegalGradeExpection {

        checkedAge(-5);
        checkedGrade(-10);
    }
    public static boolean checkedAge(int age){
        if (age>=0){
            return true;
        }else {
            throw new IllegalAgeExpection("yas sifirdan baslar");
        }
    }
    public static void checkedGrade(int grade) throws IllegalGradeExpection {
        if (grade>0){
            System.out.println(grade);
        }else {
            throw new IllegalGradeExpection("not sifirdan buyuk olur");
            }
        }
    }

