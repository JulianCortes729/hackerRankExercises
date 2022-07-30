package hackerrank;

import java.util.Scanner;
/*
Java Output Formatting

Input Format:
Every line of input will contain a String followed by an integer.
Each String will have a maximum of 10 alphabetic characters, and each
integer will be in the inclusive range from 0 to 999.

Output Format:
In each line of output there should be two columns:
The first column contains the String and is left justified using exactly
15 characters.
The second column contains the integer, expressed in exactly 3 digits; if
the original input has less than three digits, you must pad your output's
leading digits with zeroes.


Explanation:
Each String is left-justified with trailing whitespace through the first 15
characters. The leading digit of the integer is the 16th character, and each
integer that was less than  digits now has leading zeroes.

*/
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

            System.out.println("================================");

            String nuevo="";

            String w = null;

            for(int i=0;i<3;i++) {

                String s1=sc.next();
                int x=sc.nextInt();

                if(x<10){
                    w = "00"+x;
                }else if(x<100){
                    w = "0"+x;
                }else{
                    w = String.valueOf(x);
                }

                nuevo += String.format("%-15s%s\n", s1, w);

            }
            System.out.print(nuevo);

            System.out.println("================================");

    }
}
