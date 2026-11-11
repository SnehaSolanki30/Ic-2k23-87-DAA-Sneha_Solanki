import java.util.PriorityQueue;

public class HuffmanCoding {

    static class Node {
        char ch;
        int freq;
        Node left, right;

        Node(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }

        Node(Node left, Node right) {
            this.ch = '\0';
            this.freq = left.freq + right.freq;
            this.left = left;
            this.right = right;
        }
    }

    static void printCodes(Node root, String code) {

        if (root == null)
            return;

        if (root.left == null && root.right == null) {
            System.out.println(root.ch + " : " + code);
            return;
        }

        printCodes(root.left, code + "0");
        printCodes(root.right, code + "1");
    }

    public static void main(String[] args) {

        char[] chars = {'A', 'B', 'C', 'D', 'E', 'F'};
        int[] freq = {5, 9, 12, 13, 16, 45};

        PriorityQueue<Node> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.freq, b.freq)
        );

        for (int i = 0; i < chars.length; i++)
            pq.add(new Node(chars[i], freq[i]));

        while (pq.size() > 1) {

            Node left = pq.poll();
            Node right = pq.poll();

            Node parent = new Node(left, right);

            pq.add(parent);
        }

        Node root = pq.poll();

        System.out.println("Huffman Codes:");

        printCodes(root, "");
    }
}
