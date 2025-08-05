// User function Template for Java
class Solution {
    public static int LCM(int a, int b) {

        // write your code here
        int lcm=Math.max(a,b);
        while(true){
        if(lcm%a==0 && lcm%b==0){
            return lcm;
        }
        lcm++;
        }

        // return LCM of a and b
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Integer a=sc.nextInt();
        Integer b=sc.nextInt();
        System.out.println(LCM(a,b));
    }
}