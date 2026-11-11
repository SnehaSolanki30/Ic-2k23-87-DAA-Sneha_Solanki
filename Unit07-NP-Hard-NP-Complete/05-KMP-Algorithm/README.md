# Knuth-Morris-Pratt (KMP) Algorithm

## Aim
To implement the KMP String Matching Algorithm
using Java.

## Problem Statement
Given a text and a pattern, find all occurrences
of the pattern efficiently.

KMP avoids unnecessary character comparisons
by using the LPS array.

## What is LPS?
LPS stands for Longest Prefix Suffix.

It stores the length of the longest proper prefix
which is also a suffix for each pattern position.

## Algorithm
1. Read the text and pattern.
2. Create the LPS array.
3. Compare characters of text and pattern.
4. If characters match, move both pointers.
5. If a mismatch occurs, use the LPS array
   to decide the next pattern position.
6. Print the index whenever the complete
   pattern is found.

## Sample Input
Text: ABABDABACDABABCABAB
Pattern: ABABCABAB

## Sample Output
Pattern found at index: 10

## Time Complexity
O(n + m)

## Space Complexity
O(m)

## Learning Outcome
Learned how the LPS array reduces unnecessary
comparisons in string matching.
