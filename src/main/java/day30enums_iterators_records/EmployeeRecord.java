package day30enums_iterators_records;

public record EmployeeRecord(String employeeName, int employeeNum) { // works like a parameterised constructor

    /*
     Notes about RECORDS in Java

       In Java, Records were introduced in Java 14 (Preview) and became a standard feature in
       Java 16. They are a concise way to create classes that are primarily used to hold data.

     - all records are final by default
     - Record object are IMMUTABLE... can't be changed
     - Records don't allow setters (because they are IMMUTABLE)

     */
}
