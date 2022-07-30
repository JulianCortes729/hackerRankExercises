package hackerrank;

import java.util.Scanner;

/*
Java Substring Comparisons

Given a string, s, and an integer, k, complete the function so that it
finds the lexicographically smallest and largest substrings of length k.

Function Description:
    Complete the getSmallestAndLargest function in the editor below.
    getSmallestAndLargest has the following parameters:

        -string s: a string
        -int k: the length of the substrings to find

Returns:
    string: the string ' + "\n" + ' where and are the two substrings

Input Format:
    The first line contains a string denoting s.
    The second line contains an integer denoting k.

Sample Input 0:
    welcometojava
    3

Sample Output 0:
    ava
    wel
 */

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

     String s = scan.next();
     int k = scan.nextInt();
     scan.close();
     System.out.println(getSmallestAndLargest(s, k));


    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        for(int i = 0 ; i<s.length()-k ; i++){

            String substring1 = s.substring(i, i + k);

            if(substring1.compareTo(smallest) < 0){
                smallest = substring1;
            }
            if(substring1.compareTo(largest) > 0){
                largest = substring1;
            }
        }
        for(int i =s.length()-k ; i > 0 ; i--){

            String substring2 = s.substring(i, i + k);

            if(substring2.compareTo(smallest) < 0){
                smallest = substring2;
            }
            if(substring2.compareTo(largest) > 0){
                largest = substring2;
            }
        }
        return smallest + "\n" + largest;
    }

}
