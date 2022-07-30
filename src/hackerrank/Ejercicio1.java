package hackerrank;

import java.util.Scanner;

/*
Java Loops II

Input Format:
The first line contains an integer,q , denoting the number of queries.
Each line i of the q subsequent lines contains three space-separated
integers describing the respective ,a ,b and n values for that query.

Output Format:
For each query, print the corresponding series on a new line. Each series
must be printed in order as a single line of n space-separated integers.

Explanation:

We have two queries:

1.We use a=0, b=2, and n=10 to produce some series s0,s1,.....sn-1:
    .s0 = 0 + 1.2 = 2
    .s1 = 0 + 1.2 + 2.2 = 6
    .s2 = 0 + 1.2 + 2.2 + 4.2 = 14

    ... and so on.

Once we hit n=10, we print the first ten terms as a single line of space-separated integers.

2.We use a=5, b=3, and n=5 to produce some series s0,s1,.....sn-1:
    .s0 = 5 + 1.3 = 8
    .s1 = 5 + 1.3 + 2.3 = 14
    .s2 = 5 + 1.3 + 2.3 + 4.3 = 26
    .s3 = 5 + 1.3 + 2.3 + 4.3 + 8.3 = 50
    .s4 = 5 + 1.3 + 2.3 + 4.3 + 8.3 + 16.3 = 98

We then print each element of our series as a single line of space-separated values.

*/

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        StringBuilder total = new StringBuilder();
        for(int i=0;i<t;i++){
            StringBuilder res = new StringBuilder();
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int resultado = 0;
            int multi = 1;
            for(int j = 0 ; j < n ; j++){

                if(j==0 ){
                    resultado += a + multi*b;
                }else{
                    resultado += multi*b;
                }
                res.append(resultado+" ");


                multi *= 2;
            }
            total.append(res).append("\n");
        }

        System.out.println(total.toString());



        in.close();

    }



}
