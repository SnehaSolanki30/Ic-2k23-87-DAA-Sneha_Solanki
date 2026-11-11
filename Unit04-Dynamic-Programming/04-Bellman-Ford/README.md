# Bellman-Ford Algorithm

## Aim
To find shortest paths from a single source vertex
using the Bellman-Ford Algorithm.

## Problem Statement
Given a weighted graph, find the shortest distance
from a source vertex to all other vertices.

It can handle negative edge weights and can detect
negative weight cycles.

## Algorithm
1. Initialize all distances as infinity.
2. Set source distance to zero.
3. Relax all edges V-1 times.
4. Update distances if a shorter path is found.
5. Check all edges once more.
6. If a distance can still be reduced, a negative
   weight cycle exists.

## Sample Input
Vertices: 5
Source: 0

## Sample Output
Vertex    Distance
0         0
1        -1
2         2
3        -2
4         1

## Time Complexity
O(V * E)

## Space Complexity
O(V)

## Learning Outcome
Learned how to find shortest paths with negative
edge weights and detect negative weight cycles.
