# Graph Coloring Problem

## Aim
To solve the Graph Coloring Problem using Backtracking.

## Problem Statement
The objective is to assign colors to the vertices
of a graph so that no two adjacent vertices
have the same color.

The maximum number of available colors is M.

## Algorithm
1. Start from the first vertex.
2. Try assigning a color from 1 to M.
3. Check whether the color is safe.
4. If safe, assign the color to the vertex.
5. Move to the next vertex recursively.
6. If no color is possible, backtrack.
7. Continue until all vertices are colored.

## Sample Input
Vertices: 4
Available Colors: 3

## Sample Output
Graph Coloring Solution:

Vertex 0 -> Color 1
Vertex 1 -> Color 2
Vertex 2 -> Color 3
Vertex 3 -> Color 2

## Time Complexity
O(M^V * V)

## Space Complexity
O(V)

## Learning Outcome
Learned how to assign colors to graph vertices
using Backtracking.
