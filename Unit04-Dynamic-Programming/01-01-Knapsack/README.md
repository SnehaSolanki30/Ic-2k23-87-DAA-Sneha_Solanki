# 0/1 Knapsack Problem

## Aim
To solve the 0/1 Knapsack Problem using Dynamic Programming.

## Problem Statement
Given a set of items, each having a weight and value,
select items to get maximum value without exceeding
the given capacity of the knapsack.

Each item can either be selected completely or not selected.

## Algorithm
1. Read the weight and value of each item.
2. Create a DP table.
3. Check whether the current item can fit.
4. If it fits, choose the maximum value between
   including and excluding the item.
5. Return the final maximum value.

## Sample Input
Weights: 1, 3, 4, 5
Values: 1, 4, 5, 7
Capacity: 7

## Sample Output
Maximum Value = 9

## Time Complexity
O(n * W)

## Space Complexity
O(n * W)

## Learning Outcome
Learned how Dynamic Programming solves the
0/1 Knapsack Problem efficiently.
