package even_and_odd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int even = 0;
        int odd = 0;

        while (x > 0) {
            int buf = x % 10;
            if (buf % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            x /= 10;
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
