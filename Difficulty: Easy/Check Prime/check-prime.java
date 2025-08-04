import java.util.Scanner;
class Solution {
    public static boolean prime(int n) {
        // Write your code here
        // 0 and 1 are not prime numbers
        if (n <= 1) return false;

        // check from 2 to sqrt(n)
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(prime(n));
    }
}