import java.util.Scanner;
public class PrimeNumberChecker {
    public static void main(String args[]) {
        System.out.println("Welcome to Java Lab");
        System.out.println("Prime Number Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid number");
        int n = sc.nextInt();
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is not a Prime Number");
        }
    }
}
