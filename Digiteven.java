import java.util.*;
public class Digiteven{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count=0;
        for(int i=0;i<n;i++){
            boolean co=true;
            while(arr[i]>0){
                int dig=arr[i]%10;
                if(dig%2!=0){
                    co=false;
                    break;
                }
                arr[i]/=10;
            }
            if(co){
                count++;
            }
        }
        System.out.print("\nCount:"+count);

        sc.close();
    }
}