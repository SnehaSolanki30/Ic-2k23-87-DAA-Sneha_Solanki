public class RabinKarp {

    static final int PRIME = 101;
    static final int BASE = 256;

    public static void search(String text, String pattern) {

        int n = text.length();
        int m = pattern.length();

        if (m == 0) {
            System.out.println("Empty pattern.");
            return;
        }

        if (m > n) {
            System.out.println("Pattern not found.");
            return;
        }

        int patternHash = 0;
        int textHash = 0;
        int h = 1;

        boolean found = false;

        // Calculate BASE^(m-1) % PRIME
        for (int i = 0; i < m - 1; i++) {
            h = (h * BASE) % PRIME;
        }

        // Calculate initial hash values
        for (int i = 0; i < m; i++) {

            patternHash =
                (BASE * patternHash + pattern.charAt(i)) % PRIME;

            textHash =
                (BASE * textHash + text.charAt(i)) % PRIME;
        }

        // Slide pattern over text
        for (int i = 0; i <= n - m; i++) {

            // Check hash values
            if (patternHash == textHash) {

                // Verify characters to avoid hash collision
                int j;

                for (j = 0; j < m; j++) {

                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        break;
                    }
                }

                if (j == m) {

                    System.out.println(
                        "Pattern found at index: " + i
                    );

                    found = true;
                }
            }

            // Calculate hash for next window
            if (i < n - m) {

                textHash = (
                    BASE * (textHash
                    - text.charAt(i) * h)
                    + text.charAt(i + m)
                ) % PRIME;

                if (textHash < 0) {
                    textHash += PRIME;
                }
            }
        }

        if (!found) {
            System.out.println("Pattern not found.");
        }
    }

    public static void main(String[] args) {

        String text = "ABCCDDAEFG";
        String pattern = "CDD";

        System.out.println("Text: " + text);
        System.out.println("Pattern: " + pattern);

        search(text, pattern);
    }
}
