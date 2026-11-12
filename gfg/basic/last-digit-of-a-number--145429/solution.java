import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        int rem = n % 10;
        int lastDigit = (rem < 0) ? -rem : rem;
        System.out.print(lastDigit);
    }
}