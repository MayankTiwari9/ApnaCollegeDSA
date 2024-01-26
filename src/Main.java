public class Main {

    public static long findSmallestN(long K, long M) {
        long N = 1;

        while (M > 0) {
            long count = 0;
            long curr = N, next = N + 1;

            while (curr <= M) {
                count += Math.min(M + 1, next) - curr;
                curr *= 10;
                next *= 10;
            }

            if (count >= M) {
                N *= 10;
            } else {
                M -= count;
                N++;
            }
        }

        return N;
    }

    public static void main(String[] args) {
        long K1 = 2, M1 = 4;
        long result1 = findSmallestN(K1, M1);
        System.out.println("Input: " + K1 + " " + M1);
        System.out.println("Output: " + result1);

        long K2 = 2, M2 = 1;
        long result2 = findSmallestN(K2, M2);
        System.out.println("\nInput: " + K2 + " " + M2);
        System.out.println("Output: " + result2);
    }
}
