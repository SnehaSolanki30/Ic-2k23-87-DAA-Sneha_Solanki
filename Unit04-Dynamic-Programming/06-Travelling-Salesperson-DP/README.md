# Travelling Salesperson Problem using DP

## Aim
To solve the Travelling Salesperson Problem using
Dynamic Programming and Bitmasking.

## Problem Statement
A salesperson has to visit every city exactly once
and return to the starting city.

The objective is to find the minimum travelling cost.

## Algorithm
1. Read the cost matrix.
2. Start from city 0.
3. Create a DP table using bitmasking.
4. Mark visited cities using bits.
5. Calculate the minimum cost of visiting
   unvisited cities.
6. After visiting all cities, return to city 0.
7. Display the minimum travelling cost.

## Sample Input
Cost matrix:

0  10 15 20
10 0  35 25
15 35 0  30
20 25 30 0

## Sample Output
Minimum Travelling Cost = 80

## Time Complexity
O(n^2 * 2^n)

## Space Complexity
O(n * 2^n)

## Learning Outcome
Learned how Dynamic Programming and Bitmasking
can solve the Travelling Salesperson Problem.
