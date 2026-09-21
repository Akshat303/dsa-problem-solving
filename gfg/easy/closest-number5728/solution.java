class Solution {
    static int closestNumber(int n, int m) {
        // Standard integer division truncates toward zero in Java
        int q = n / m;

        // First candidate multiple
        int n1 = m * q;

        // Second candidate multiple
        int n2 = (n * m > 0) ? (m * (q + 1)) : (m * (q - 1));

        // Distances from n
        int d1 = Math.abs(n - n1);
        int d2 = Math.abs(n - n2);

        // Return candidate with the smaller distance
        if (d1 < d2) {
            return n1;
        } else if (d2 < d1) {
            return n2;
        }

        // Tie-breaker: return the candidate with maximum absolute value
        return (Math.abs(n1) > Math.abs(n2)) ? n1 : n2;
    }
}