package day30customexceptions;

public class InvalidStudentGradeException extends Exception{

    public InvalidStudentGradeException(String message){
        super(message);
    }
}
