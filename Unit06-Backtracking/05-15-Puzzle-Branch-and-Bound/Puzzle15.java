import java.util.*;

public class Puzzle15 {

    static final int N = 4;
    static final int MAX_NODES = 200000;

    static class Node {
        int[][] board;
        int zero;
        int g, h;
        Node parent;
        String move;

        Node(int[][] board, int zero, int g,
             Node parent, String move) {

            this.board = board;
            this.zero = zero;
            this.g = g;
            this.h = calculateHeuristic(board);
            this.parent = parent;
            this.move = move;
        }

        int f() {
            return g + h;
        }
    }

    static int calculateHeuristic(int[][] board) {

        int distance = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                int value = board[i][j];

                if (value != 0) {

                    int goalRow = (value - 1) / N;
                    int goalCol = (value - 1) % N;

                    distance += Math.abs(i - goalRow)
                              + Math.abs(j - goalCol);
                }
            }
        }

        return distance;
    }

    static String getKey(int[][] board) {
        return Arrays.deepToString(board);
    }

    static boolean isSolvable(int[][] board) {

        int[] values = new int[N * N];
        int index = 0;
        int blankRow = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                values[index++] = board[i][j];

                if (board[i][j] == 0) {
                    blankRow = i;
                }
            }
        }

        int inversions = 0;

        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {

                if (values[i] != 0 && values[j] != 0
                    && values[i] > values[j]) {

                    inversions++;
                }
            }
        }

        int blankRowFromBottom = N - blankRow;

        return (inversions + blankRowFromBottom) % 2 == 1;
    }

    static void printBoard(int[][] board) {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%2d ", board[i][j]);
            }
            System.out.println();
        }

        System.out.println();
    }

    static void addNode(
        Node current,
        int newRow,
        int newCol,
        String move,
        PriorityQueue<Node> pq,
        Map<String, Integer> bestCost) {

        if (newRow < 0 || newRow >= N ||
            newCol < 0 || newCol >= N) {
            return;
        }

        int[][] newBoard = new int[N][N];

        for (int i = 0; i < N; i++) {
            newBoard[i] = current.board[i].clone();
        }

        int row = current.zero / N;
        int col = current.zero % N;

        // Move blank tile
        newBoard[row][col] = newBoard[newRow][newCol];
        newBoard[newRow][newCol] = 0;

        int newZero = newRow * N + newCol;
        int newG = current.g + 1;

        String key = getKey(newBoard);

        if (newG < bestCost.getOrDefault(key, Integer.MAX_VALUE)) {

            bestCost.put(key, newG);

            Node next = new Node(
                newBoard, newZero, newG, current, move
            );

            pq.add(next);
        }
    }

    static void solve(int[][] initial) {

        if (!isSolvable(initial)) {
            System.out.println("Puzzle is not solvable.");
            return;
        }

        int zero = -1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if (initial[i][j] == 0) {
                    zero = i * N + j;
                }
            }
        }

        PriorityQueue<Node> pq = new PriorityQueue<>(
            Comparator.comparingInt(Node::f)
        );

        Map<String, Integer> bestCost = new HashMap<>();

        Node start = new Node(initial, zero, 0, null, "Start");

        pq.add(start);
        bestCost.put(getKey(initial), 0);

        int explored = 0;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        String[] moves = {"Up", "Down", "Left", "Right"};

        while (!pq.isEmpty()) {

            if (explored >= MAX_NODES) {
                System.out.println(
                    "Search limit reached. Try an easier puzzle."
                );
                return;
            }

            Node current = pq.poll();

            String key = getKey(current.board);

            if (current.g != bestCost.getOrDefault(
                key, Integer.MAX_VALUE)) {
                continue;
            }

            explored++;

            if (current.h == 0) {

                List<Node> path = new ArrayList<>();

                Node temp = current;

                while (temp != null) {
                    path.add(temp);
                    temp = temp.parent;
                }

                Collections.reverse(path);

                System.out.println("Solution Found!");

                for (Node step : path) {

                    if (!step.move.equals("Start")) {
                        System.out.println("Move: " + step.move);
                    }

                    printBoard(step.board);
                }

                System.out.println(
                    "Total Moves = " + current.g
                );

                System.out.println(
                    "Explored Nodes = " + explored
                );

                return;
            }

            int row = current.zero / N;
            int col = current.zero % N;

            for (int i = 0; i < 4; i++) {

                addNode(
                    current,
                    row + dr[i],
                    col + dc[i],
                    moves[i],
                    pq,
                    bestCost
                );
            }
        }

        System.out.println("No solution found.");
    }

    public static void main(String[] args) {

        int[][] initial = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12},
            {13, 14, 0, 15}
        };

        System.out.println("Initial Puzzle:");

        printBoard(initial);

        solve(initial);
    }
}
