// User function template for Java
import java.util.Scanner;
class Solution {
    static int areAnagram(String S1, String S2) {
        // code here

        char[] ch1 = S1.toCharArray();
        char[] ch2 = S2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (S1.length() == S2.length() && Arrays.equals(ch1, ch2)) {
            return 1;
        }
        else {
            return 0;
        }
    }   
}