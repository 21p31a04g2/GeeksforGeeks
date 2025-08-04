import java.util.Scanner;
class Solution {
    public static String average(int arr[]) {
        // code here
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            
        }
        double avg=sum/ arr.length;
        return String.format("%.2f",avg);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Integer n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    average(arr);
        
    }
}
    