package hackerrank;

import java.util.Scanner;

/*
    Java String Reverse

A palindrome is a word, phrase, number, or other sequence of
characters which reads the same backward or forward.

Given a string A, print Yes if it is a palindrome, print No otherwise.

Constraints:
    . A will consist at most 50 lower case english letters.

Sample Input:
    madam

Sample Output:
    Yes

 */


public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        String ingreso = A.toLowerCase();
        String cadenaInvertida="";

        for (int i=A.length()-1; i>=0;i--){
            cadenaInvertida=cadenaInvertida+ingreso.charAt(i);
        }

        String resultado = (ingreso.equals(cadenaInvertida)) ?"Yes" : "No";

        System.out.println(resultado);

    }
}
