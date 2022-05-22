package nod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        findCommonDivisor(a,b);
    }

    public static void findCommonDivisor(int a, int b) {
        int res = 0;
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

       for (int i = 1; i < max; i++) {
           if((a % i == 0) && (b % i == 0)) {
               res = i;
           }
       }
        System.out.println(res);
    }
}
