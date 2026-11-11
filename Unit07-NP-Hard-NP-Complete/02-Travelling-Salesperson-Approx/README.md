# Travelling Salesperson Problem (2-Approximation)

## Aim
To solve the Travelling Salesperson Problem using
an MST-based 2-Approximation Algorithm.

## Problem Statement
A salesperson must visit every city exactly once
and return to the starting city.

The objective is to find a low-cost tour.

## Algorithm
1. Create all edges of the weighted graph.
2. Sort the edges by increasing weight.
3. Construct a Minimum Spanning Tree using Kruskal's
   Algorithm.
4. Perform preorder traversal of the MST.
5. Add each visited city to the tour.
6. Return to the starting city.
7. Calculate and display the tour cost.

## Sample Input
A complete weighted graph with 4 cities is
given in the Java program.

## Sample Output
Approximate TSP Tour:
0 -> 1 -> 3 -> 2 -> 0

Approximate Tour Cost = 80

## Time Complexity
O(E log E + V)

## Space Complexity
O(V + E)

## Approximation Ratio
The MST preorder algorithm gives a 2-approximation
when the graph satisfies the triangle inequality.

## Learning Outcome
Learned how Minimum Spanning Tree can be used
to find an approximate TSP tour.
