public class NaiveStringMatching {

    public static void search(String text, String pattern) {

        int n = text.length();
        int m = pattern.length();

        boolean found = false;

        if (m == 0) {
            System.out.println("Empty pattern.");
            return;
        }

        for (int i = 0; i <= n - m; i++) {

            int j;

            // Compare pattern with text
            for (j = 0; j < m; j++) {

                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            // Pattern found
            if (j == m) {

                System.out.println(
                    "Pattern found at index: " + i
                );

                found = true;
            }
        }

        if (!found) {
            System.out.println("Pattern not found.");
        }
    }

    public static void main(String[] args) {

        String text = "AABAACAADAABAABA";
        String pattern = "AABA";

        System.out.println("Text: " + text);
        System.out.println("Pattern: " + pattern);

        search(text, pattern);
    }
}
