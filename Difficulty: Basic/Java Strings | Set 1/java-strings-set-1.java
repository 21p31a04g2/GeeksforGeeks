// User function template for Java
import java.util.Scanner;
class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        String con=S1.concat(S2);
        String rev="";
        for(int i=con.length()-1;i>=0;i--){
            rev+=con.charAt(i);
        }
        return rev;
    }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            String S1=sc.next();
            String S2=sc.next();
            System.out.println(conRevstr(S1,S2));
        }
}