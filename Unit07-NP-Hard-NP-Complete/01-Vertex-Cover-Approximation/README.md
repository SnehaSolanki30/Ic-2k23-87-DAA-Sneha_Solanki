# Vertex Cover Problem (2-Approximation)

## Aim
To solve the Vertex Cover Problem using a
2-Approximation Algorithm.

## Problem Statement
Given an undirected graph, find a set of vertices
such that every edge has at least one endpoint
in the selected set.

The objective is to find a small vertex cover.

## Algorithm
1. Start with an empty vertex cover.
2. Select an uncovered edge.
3. Add both endpoints of that edge to the cover.
4. Mark all edges incident to selected vertices
   as covered.
5. Repeat until all edges are covered.
6. Display the selected vertices.

## Sample Input
Vertices: 5

Edges:
0-1, 0-2, 1-2, 1-3, 3-4

## Sample Output
Selected Edges:
0 - 1
3 - 4

Vertex Cover: 0 1 3 4
Cover Size = 4

## Time Complexity
O(V + E) for this implementation.

## Space Complexity
O(V)

## Approximation Ratio
The algorithm provides a 2-approximation
for the minimum vertex cover problem.

## Learning Outcome
Learned how approximation algorithms provide
a practical solution to optimization problems.
