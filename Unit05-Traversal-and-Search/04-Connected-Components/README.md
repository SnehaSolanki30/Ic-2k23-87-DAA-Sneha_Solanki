# Connected Components in an Undirected Graph

## Aim
To find the connected components of an undirected graph.

## Problem Statement
A connected component is a group of vertices in which
every vertex can be reached from every other vertex
through a path.

The objective is to count and display all connected
components in an undirected graph.

## Algorithm
1. Create a visited array.
2. Initialize component count to zero.
3. Visit every vertex of the graph.
4. If a vertex is not visited:
   - Increase the component count.
   - Perform DFS from that vertex.
   - Print all reachable vertices.
5. Repeat until all vertices are visited.
6. Display the total number of components.

## Sample Input
Vertices: 7

Edges:
0-1, 1-2, 3-4

Vertices 5 and 6 are isolated.

## Sample Output
Component 1: 0 1 2
Component 2: 3 4
Component 3: 5
Component 4: 6

Total Connected Components = 4

## Time Complexity
O(V + E)

## Space Complexity
O(V)

## Learning Outcome
Learned how to identify and count connected
components using DFS.
