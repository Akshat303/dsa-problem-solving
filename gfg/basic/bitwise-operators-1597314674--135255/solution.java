import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // code here
        int d = a ^ a; // Bitwise XOR of a with itself (always 0)
        int e = c ^ b; // Bitwise XOR of c and b
        int f = a & b; // Bitwise AND of a and b
        int g = ~e;    // Bitwise NOT (One's complement) of e

        System.out.println(d + " " + e + " " + f + " " + g);
    }
}