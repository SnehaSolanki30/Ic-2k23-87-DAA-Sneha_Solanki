# Floyd-Warshall Algorithm

## Aim
To find shortest paths between all pairs of vertices
using the Floyd-Warshall Algorithm.

## Problem Statement
Given a weighted graph, find the shortest distance
between every pair of vertices.

The algorithm can work with negative edge weights,
but not with negative weight cycles.

## Algorithm
1. Create a distance matrix.
2. Copy the graph into the distance matrix.
3. Consider every vertex as an intermediate vertex.
4. Check whether the path through that vertex
   gives a shorter distance.
5. Update the distance matrix.
6. Display the final matrix.

## Sample Input
A graph with 4 vertices is given in the Java program.

## Sample Output
Shortest Distance Matrix:

0   5   8   9
INF 0   3   4
INF INF 0   1
INF INF INF 0

## Time Complexity
O(V^3)

## Space Complexity
O(V^2)

## Learning Outcome
Learned how to calculate shortest paths between
all pairs of vertices.
