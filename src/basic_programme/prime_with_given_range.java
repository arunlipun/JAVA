package basic_programme;

public class prime_with_given_range {
    public static void main(String[] args) {
        int n = 30;

        boolean[] prime = new boolean[n + 1];

        for (int i = 2; i <= n; i++)
            prime[i] = true;

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i)
                    prime[j] = false;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i])
                System.out.print(i + " ");
        }
    }
}
