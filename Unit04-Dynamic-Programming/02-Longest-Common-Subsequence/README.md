# Longest Common Subsequence (LCS)

## Aim
To find the Longest Common Subsequence using
Dynamic Programming.

## Problem Statement
Given two strings, find the longest sequence of
characters that appears in both strings in the
same order.

Characters do not need to be continuous.

## Algorithm
1. Read two input strings.
2. Create a DP table.
3. Compare characters of both strings.
4. If characters match, add 1 to the diagonal value.
5. Otherwise, take the maximum of the upper and
   left values.
6. Return the final DP table value.

## Sample Input
String 1: AGGTAB
String 2: GXTXAYB

## Sample Output
Length of LCS = 4

## Time Complexity
O(m * n)

## Space Complexity
O(m * n)

## Learning Outcome
Learned how to compare two strings and find their
Longest Common Subsequence using DP.
