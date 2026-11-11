# Dijkstra's Single Source Shortest Path

## Aim
To find the shortest distance from one source vertex to all other vertices in a weighted graph.

## Introduction
Dijkstra's Algorithm is a Greedy algorithm used to find shortest paths in graphs with non-negative edge weights.

## Algorithm
1. Set source distance to zero.
2. Set all other distances to infinity.
3. Select the unvisited vertex with the smallest distance.
4. Update the distances of its adjacent vertices.
5. Mark the selected vertex as visited.
6. Repeat until all reachable vertices are processed.
7. Display shortest distances.

## Time Complexity
O(V²) using an adjacency matrix.

## Space Complexity
O(V²) for the graph matrix and O(V) for auxiliary arrays.

## Sample Output
Shortest distances from vertex 0
0 : 0
1 : 4
2 : 12
3 : 19
4 : 21
5 : 16

## Important Note
Dijkstra's Algorithm does not work correctly with negative edge weights.

## Conclusion
Dijkstra's Algorithm finds shortest paths from a source vertex using the Greedy Method.
