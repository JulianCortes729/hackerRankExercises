package hackerrank;

import java.util.Scanner;

/*
    Java String Tokens

Given a string, s, matching the regular expression [A-Za-z
!,?._'@]+, split the string into tokens. We define a token to be one
or more consecutive English alphabetic letters. Then, print the
number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this
challenge.

Input Format:
    A single string, s.

Output Format:
    On the first line, print an integer, n, denoting the number of tokens
    in string s (they do not need to be unique). Next, print each of the n
    tokens on a new line in the same order as they appear in input string s.

Sample Input:
    He is a very very good boy, isn't he?

Sample Output:
    10
    He
    is
    a
    very
    very
    good
    boy
    isn
    t
    he
 */

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine()+"\n";
        s = s.trim();//Método que elimina los caracteres blancos iniciales y finales de la cadena, devolviendo una copia de la misma

        if(s.length()==0){
            System.out.println(0);

        }else{

            String[] tokens = s.split("[!,?._'@ \n]+");

            int size = tokens.length;

            System.out.println(size);
            for(String token : tokens){
                System.out.println(token);
            }
            scan.close();
        }

    }


}
