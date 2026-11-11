# N-Queens Problem

## Aim
To solve the N-Queens Problem using Backtracking.

## Problem Statement
Place N queens on an N x N chessboard so that
no two queens attack each other.

No two queens should be in the same row,
column, or diagonal.

## Algorithm
1. Start from the first row.
2. Try placing a queen in each column.
3. Check whether the position is safe.
4. If safe, place the queen.
5. Move to the next row recursively.
6. If no position is safe, remove the previous queen.
7. Continue until all queens are placed.

## Sample Input
N = 4

## Sample Output
N-Queens Solution:

0 1 0 0
0 0 0 1
1 0 0 0
0 0 1 0

## Time Complexity
O(N!)

## Space Complexity
O(N^2) for the board,
with O(N) recursion depth.

## Learning Outcome
Learned how to use Backtracking to solve
the N-Queens Problem.
