package hackerrank;

import java.util.Scanner;

/*
    Java Anagrams

Two strings, a and b, are called anagrams if they contain all the same
characters in the same frequencies. For this challenge, the test is not
case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac,
TCA, aTC, and CtA.

Function Description:
    Complete the isAnagram function in the editor.
    isAnagram has the following parameters:
        .string a: the first string
        .string b: the second string

Returns:
    boolean: If a and b are case-insensitive anagrams, return true.
    Otherwise, return false.

Input Format:
    The first line contains a string a.
    The second line contains a string b.

Sample Input 0:
    anagram
    margana

Sample Output 0:
    Anagrams

Sample Input 1:
    anagramm
    marganaa

Sample Output 1:
    Not Anagrams
 */

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );



    }


    public static int cantCaracteres(String cadena, char letra){
        int cont=0;
        cadena = cadena.toLowerCase();
        letra = Character.toLowerCase(letra);
        for(int i=0; i<cadena.length(); i++){

            if(cadena.charAt(i) == letra){
                cont=cont+1;
            }
        }
        return cont;

    }

    public static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean anagrama = false;

        if(a.length() != b.length()){
            return anagrama;

        }else{
            for(int i=0;i<a.length(); i++){
                if(cantCaracteres(a, a.charAt(i)) == cantCaracteres(b, a.charAt(i))){
                    anagrama =true;
                }else{
                    anagrama = false;
                }



            }
            return anagrama;
        }

    }
}
