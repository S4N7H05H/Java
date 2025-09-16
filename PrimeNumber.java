import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sc.nextInt();
        boolean p = true;
        if (n <= 1) {
            p = false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                p = false;
                break;
            }
        }
        if (p) {
            System.out.println(n+" is a Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
        
        sc.close();
    }
}
