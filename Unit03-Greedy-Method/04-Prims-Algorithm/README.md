# Prim's Algorithm

## Aim
To find the Minimum Spanning Tree of a connected weighted graph.

## Introduction
Prim's Algorithm is a Greedy algorithm. It starts from one vertex and repeatedly selects the minimum weight edge that connects a visited vertex to an unvisited vertex.

## Algorithm
1. Start from vertex 0.
2. Mark it as visited.
3. Find the minimum weight edge connecting visited and unvisited vertices.
4. Add that edge to the Minimum Spanning Tree.
5. Repeat until all vertices are visited.
6. Display the total weight.

## Time Complexity
O(V²) using an adjacency matrix.

## Space Complexity
O(V²) for the graph matrix and O(V) for auxiliary arrays.

## Sample Output
Minimum Spanning Tree:
0 - 1 : 2
1 - 2 : 3
0 - 3 : 6
1 - 4 : 5
Total Weight = 16

## Conclusion
Prim's Algorithm finds a Minimum Spanning Tree by selecting the smallest valid edge at each step.
