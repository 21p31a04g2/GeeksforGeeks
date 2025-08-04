import java.util.Scanner;
class Solution {
    static String revStr(String s) {
        // code here
        String rev="";
        return new StringBuilder(s).reverse().toString();
    }
        
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            System.out.println(revStr(s));
        }
}