# Rabin-Karp String Matching Algorithm

## Aim
To implement the Rabin-Karp String Matching
Algorithm using Java.

## Problem Statement
Given a text and a pattern, find all occurrences
of the pattern using hash values.

The algorithm compares hash values instead of
comparing all characters at every position.

## Algorithm
1. Read the text and pattern.
2. Calculate the hash value of the pattern.
3. Calculate the hash value of the first text window.
4. Compare both hash values.
5. If hashes match, compare actual characters.
6. Calculate the next window hash using rolling hash.
7. Repeat until all positions are checked.

## Sample Input
Text: ABCCDDAEFG
Pattern: CDD

## Sample Output
Pattern found at index: 2

## Time Complexity
Average Case: O(n + m)
Worst Case: O(n * m)

## Space Complexity
O(1) auxiliary space.

## Learning Outcome
Learned how hashing and rolling hash are used
for efficient string matching.
