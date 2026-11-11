# Hamiltonian Cycle Problem

## Aim
To find a Hamiltonian Cycle in a graph using
Backtracking.

## Problem Statement
A Hamiltonian Cycle is a cycle that visits every
vertex exactly once and returns to the starting vertex.

The objective is to find such a cycle in a graph.

## Algorithm
1. Start from vertex 0.
2. Add a connected and unused vertex to the path.
3. Check whether the selected vertex is safe.
4. Move to the next position recursively.
5. If all vertices are included, check the edge
   back to the starting vertex.
6. If a valid cycle is not found, backtrack.
7. Display the cycle if it exists.

## Sample Input
A graph with 5 vertices is given in the Java program.

## Sample Output
Hamiltonian Cycle:
0 -> 1 -> 2 -> 4 -> 3 -> 0

## Time Complexity
O(V!)

## Space Complexity
O(V)

## Learning Outcome
Learned how to find a Hamiltonian Cycle using
the Backtracking technique.
