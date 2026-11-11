# Kruskal's Algorithm

## Aim
To find the Minimum Spanning Tree of a connected weighted graph.

## Introduction
Kruskal's Algorithm is a Greedy algorithm. It selects edges in increasing order of weight and avoids cycles.

## Algorithm
1. Sort all edges by increasing weight.
2. Create a separate set for each vertex.
3. Select the smallest edge.
4. Check whether it creates a cycle.
5. If no cycle is formed, add the edge to the MST.
6. Repeat until V-1 edges are selected.

## Time Complexity
O(E log E), where E is the number of edges.

## Space Complexity
O(V) for the parent array, excluding the graph storage.

## Sample Output
Minimum Spanning Tree:
2 - 3 : 4
0 - 3 : 5
0 - 1 : 10
Total Weight = 19

## Conclusion
Kruskal's Algorithm builds a Minimum Spanning Tree by selecting edges with the smallest weights without forming cycles.
