import java.util.Scanner;

class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s;
        int n;
        float f;
        int ff; // To Store floor of float variable f

        // code here
        s = sc.nextLine();
        n = sc.nextInt();
        f = sc.nextFloat();
        ff = (int) Math.floor(f);

        System.out.println(s);
        System.out.println(n);
        System.out.println(ff);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna