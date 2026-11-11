# Matrix Chain Multiplication

## Aim
To find the minimum number of scalar multiplications
required to multiply a chain of matrices.

## Problem Statement
Given dimensions of matrices, find the best order
of multiplication to minimize the total cost.

The order of matrices remains the same, but
parentheses can be changed.

## Algorithm
1. Read the dimensions of matrices.
2. Create a DP table.
3. Consider different chain lengths.
4. Try every possible splitting position.
5. Calculate multiplication cost.
6. Store the minimum cost in the DP table.

## Sample Input
Dimensions: 10, 20, 30, 40, 30

## Sample Output
Minimum Multiplication Cost = 30000

## Time Complexity
O(n^3)

## Space Complexity
O(n^2)

## Learning Outcome
Learned how Dynamic Programming finds the
optimal multiplication order.
