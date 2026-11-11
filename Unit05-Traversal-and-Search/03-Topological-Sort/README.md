# Topological Sorting

## Aim
To implement Topological Sorting using Java.

## Problem Statement
Topological Sorting is a linear ordering of vertices
in a Directed Acyclic Graph (DAG).

For every directed edge u -> v, vertex u must appear
before vertex v.

## Algorithm
1. Calculate the indegree of every vertex.
2. Insert all vertices with indegree zero into a queue.
3. Remove a vertex from the queue.
4. Print the removed vertex.
5. Reduce the indegree of its neighbouring vertices.
6. Add neighbours whose indegree becomes zero.
7. Repeat until the queue is empty.
8. If all vertices are not processed, the graph
   contains a cycle.

## Sample Input
Vertices: 6

Directed Edges:
5->2, 5->0, 4->0, 4->1, 2->3, 3->1

## Sample Output
One valid ordering:
4 5 2 0 3 1

## Time Complexity
O(V + E)

## Space Complexity
O(V)

## Learning Outcome
Learned how to arrange vertices in a DAG using
Topological Sorting and a Queue.
