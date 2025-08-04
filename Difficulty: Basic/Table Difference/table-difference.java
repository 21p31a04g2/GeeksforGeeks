import java.util.*;
import java.util.Scanner;
public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sp=new Scanner(System.in);
        Integer n1=sp.nextInt();
        Integer n2=sp.nextInt();
        int t1=1;
        int t2=1;
        for(int i=1;i<=10;i++){
            t1=n1*i;
        }
        for(int j=1;j<=10;j++){
            t2=n2*j;
        }
        System.out.println(t1-t2);
    }
}