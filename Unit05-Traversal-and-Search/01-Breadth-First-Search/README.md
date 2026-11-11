# Breadth First Search (BFS)

## Aim
To implement Breadth First Search using Java.

## Problem Statement
BFS is a graph traversal algorithm that visits
vertices level by level.

It uses a Queue data structure.

## Algorithm
1. Create a visited array.
2. Create an empty queue.
3. Mark the starting vertex as visited.
4. Insert the starting vertex into the queue.
5. Remove a vertex from the queue and print it.
6. Visit all its unvisited neighbours.
7. Add those neighbours to the queue.
8. Repeat until the queue becomes empty.

## Sample Input
Starting Vertex: 0

Graph Edges:
0-1, 0-2, 1-3, 1-4, 2-5

## Sample Output
BFS Traversal:
0 1 2 3 4 5

## Time Complexity
O(V + E)

## Space Complexity
O(V)

## Learning Outcome
Learned graph traversal using the Queue data structure.
