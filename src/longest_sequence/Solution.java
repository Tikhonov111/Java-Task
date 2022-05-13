package longest_sequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(reader.readLine());
            list.add(a);
        }
        System.out.println(findLongestSequence(list));
    }

    public static int findLongestSequence(List<Integer> list) {             //   333 22 55555 1 2 3
        int prev = list.get(0);
        int count = 1;
        int result = 0;

         for(int i = 1; i < list.size(); i ++) {

             if(prev == list.get(i)) {
                 count++;

               if(result < count) {
                   result = count;
               }
             } else {
                 count = 1;
             }
             prev = list.get(i);
         }
     return result;
    }
}
