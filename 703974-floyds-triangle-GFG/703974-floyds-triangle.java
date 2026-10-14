import java.util.Scanner;

 class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of rows
        int n = sc.nextInt();

        int num = 1; // starting number

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for printing numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println(); // move to next line
        }

        sc.close();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna