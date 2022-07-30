package hackerrank;

import java.time.LocalDate;
/*
Java Date and Time

The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of
calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as
getting the date of the next week.

You are given a date. You just need to write the method, getDay, which returns the day on that date. To simplify your task, we
have provided a portion of the code in the editor.

Example:
    month=8
    day=14
    year=2017

The method should return MONDAY as the day on that date.
*/

public class Ejercicio13 {

    public static void main(String[] args) {
        System.out.println(findDay(8, 14, 2017));
    }

    public static String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().name();
    }

}
