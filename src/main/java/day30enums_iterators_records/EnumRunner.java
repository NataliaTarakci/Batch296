package day30enums_iterators_records;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {

    public static void main(String[] args) {

        //Cities cities = new Cities();

        Cities c1 = Cities.ANKARA;
        System.out.println("c1 = " + c1);
        System.out.println("City Name = " + c1.getCityName());
        System.out.println("City Name = " + Cities.KONYA.getCityName());

        String cityName = Cities.KONYA.getCityName();
        System.out.println("city Name = " + cityName);

        int plateCode1 = Cities.ANTALYA.getPlateCode();
        System.out.println("plateCode = " + plateCode1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the plate code to check which city it belongs to!");
        int plateCode2 = scanner.nextInt();

        Cities[] allValues = Cities.values();
        // System.out.println(Arrays.toString(allValues));

        if (plateCode2<0 || plateCode2>81){
            System.out.println("Enter a valid plate code please");
        }else {
            for (Cities w : allValues){
                // System.out.println(w.getCityName());
                if (plateCode2 == w.getPlateCode()){
                    System.out.println(w.getCityName());
                    System.out.println("This plate code "+plateCode2+" belongs to "+w.getCityName()+ " city.");
                }
            }
        }


    }
}
