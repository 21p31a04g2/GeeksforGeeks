//Back-end complete function Template for Java
import java.util.*;
import java.time.Year;

public class Solution {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        // code here
        if (Year.isLeap(year)) {
            System.out.println("True");
        } 
        else {
            System.out.println("False");
        }
        
    }
}