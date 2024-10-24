package day30customexceptions;

public class CustomException {

    public static void main(String[] args) {

        checkGrade(80);
        System.out.println(checkNameFormat("Ali"));

    }

//    public static void checkGrade(int grade){
//        if (grade < 0 || grade > 100){
//            throw new IllegalArgumentException("Grades can't be less than 0 or greater than 100");
//        }else {
//            System.out.println("grade = " + grade);
//        }
//    }

    public static void checkGrade(int grade){
        if (grade < 0 || grade > 100){
            try {
                throw new InvalidStudentGradeException("Grades can't be less than 0 or greater than 100");
            } catch (InvalidStudentGradeException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("grade = " + grade);
        }
    }

    public static boolean checkNameFormat(String name){
        if (name.charAt(0)>= 'A' && name.charAt(0)<='Z'){
            return true;
        }else {
            try {
                throw new NameFormatException("Names must start with an UpperCase");
            } catch (NameFormatException e) {
                e.printStackTrace();
                return false;
            }
        }
    }

}
