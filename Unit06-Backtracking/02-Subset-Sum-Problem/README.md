# Subset Sum Problem

## Aim
To solve the Subset Sum Problem using Backtracking.

## Problem Statement
Given a set of positive integers and a target value,
find subsets whose sum is equal to the target.

Each element can be selected only once.

## Algorithm
1. Start from the first array element.
2. Include the current element in the subset.
3. Check whether the target sum is reached.
4. If the target is reached, print the subset.
5. If the target is not reached, explore the next element.
6. Backtrack and explore the case without the element.
7. Stop when all possibilities are checked.

## Sample Input
Array: 3, 4, 5, 2
Target: 9

## Sample Output
Target Sum = 9
Subset: 3 4 2
Subset: 4 5

## Time Complexity
O(2^n)

## Space Complexity
O(n) auxiliary recursion space.

## Learning Outcome
Learned how to find subsets using
the Backtracking technique.
