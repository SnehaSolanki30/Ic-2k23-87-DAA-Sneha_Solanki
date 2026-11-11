# Depth First Search (DFS)

## Aim
To implement Depth First Search using Java.

## Problem Statement
DFS is a graph traversal algorithm that explores
one path as deeply as possible before backtracking.

It uses recursion or a Stack data structure.

## Algorithm
1. Create a visited array.
2. Start from the given vertex.
3. Mark the current vertex as visited.
4. Print the current vertex.
5. Visit each unvisited neighbour recursively.
6. Continue until all reachable vertices are visited.

## Sample Input
Starting Vertex: 0

Graph Edges:
0-1, 0-2, 1-3, 1-4, 2-5

## Sample Output
DFS Traversal:
0 1 3 4 2 5

## Time Complexity
O(V + E)

## Space Complexity
O(V)

## Learning Outcome
Learned graph traversal using recursion and
backtracking.
