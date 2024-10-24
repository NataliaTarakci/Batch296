package day20constructors_date_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime_HW {

    public static void main(String[] args) {

         /*
        Task 1:

        Type the code that find out how many months Ali lived.
        Date of birth of Ali is 4th of June 1997.
        Remember When you calculate, the order is very important.

        Hint for Task 1:  Use ChronoUnit.MONTHS.between() method to get the number of months between the two dates

         */

        LocalDate currentDate1 = LocalDate.now();
        LocalDate dateOfBirth = LocalDate.of(1997, 6, 4);
        System.out.println("Ali lived = " + ChronoUnit.MONTHS.between(dateOfBirth, currentDate1) + " months");


         /*
        Task 2:
         Tom was born 45 years, 8 months and 5 days after 29 October 1923.
         Veli was born 24 years, 2 months and 11 days before 15 September 1993.
         Type code to calculate the exact date of birth of Tom and Veli
         Type code to check if the date of birth of Tome and Veli is the same or not.

         */
        LocalDate dayOfBirthTom = LocalDate.of(1923, 10, 29).plusYears(45).plusMonths(8).plusDays(5);
        System.out.println("dayOfBirthTom = " + dayOfBirthTom);
        LocalDate dayOfBirthVeli = LocalDate.of(1993, 9, 15).minusYears(24).minusMonths(2).minusDays(11);
        System.out.println("dayOfBirthVeli = " + dayOfBirthVeli);
        System.out.println("dayOfBirthTom.equals(dayOfBirthVeli) = " + dayOfBirthTom.equals(dayOfBirthVeli));


         /*
         Task 3:
         Type code to find the time difference in hours between Japan time zone
         and Germany time zone.
         */

        LocalTime timeJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("timeJapan = " + timeJapan);
        LocalTime timeGermany = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println("timeGermany = " + timeGermany);
        System.out.println("ChronoUnit.HOURS.between(timeJapan, timeGermany) = " + ChronoUnit.HOURS.between(timeJapan, timeGermany));



        System.out.println("===HW Solution from Saima===");
        System.out.println("Task 1");

                   /*
        Task 1:

        Type the code that find out how many months Ali lived.
        Date of birth of Ali is 4th of June 1997.
        Remember When you calculate, the order is very important.

        HINT: Use ChronoUnit.MONTHS.between() method to get the number of months between the two dates
         */

        LocalDate dobAli = LocalDate.of(1997, Month.JUNE, 4);
        LocalDate currentDate = LocalDate.now();
        System.out.println("currentDate = " + currentDate);

        long numOfMonths = ChronoUnit.MONTHS.between(dobAli,currentDate);
        System.out.println("numOfMonths = " + numOfMonths);


        System.out.println("Task 2");
        /*
        Task 2:
         Tom was born 45 years, 8 months and 5 days after 29 October 1923.
         Veli was born 24 years, 2 months and 11 days before 15 September 1993.
         Type code to calculate the exact date of birth of Tom and Veli
         Type code to check if the date of birth of Tome and Veli is the same or not.

         */

        LocalDate dobTom = LocalDate.of(1923, 10,29).plusYears(45).plusMonths(8).plusDays(5);
        System.out.println("dobTom = " + dobTom);

        LocalDate dobVeli = LocalDate.of(1993, 9, 15).minusYears(24).minusMonths(2).minusDays(11);
        System.out.println("dobVeli = " + dobVeli);

        boolean isSame = dobTom.isEqual(dobVeli);
        System.out.println(isSame);


        System.out.println("Task 3");
        /*
         Task 3:
         Type code to find the time difference in hours between Japan time zone
         and Germany time zone.
         */

        LocalTime timeInJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("timeInJapan = " + timeInJapan);

        LocalTime timeInGermany = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println("timeInGermany = " + timeInGermany);

        System.out.println(timeInGermany.getHour() - timeInJapan.getHour());



    }
}
