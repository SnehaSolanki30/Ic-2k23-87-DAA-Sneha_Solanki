# Naive String Matching Algorithm

## Aim
To implement the Naive String Matching Algorithm
using Java.

## Problem Statement
Given a text and a pattern, find all occurrences
of the pattern in the text.

The algorithm checks the pattern at every possible
position in the text.

## Algorithm
1. Read the text and pattern.
2. Start comparing from the first text position.
3. Compare each character of the pattern with
   the corresponding text character.
4. If all characters match, print the index.
5. Otherwise, shift the pattern by one position.
6. Repeat until all possible positions are checked.

## Sample Input
Text: AABAACAADAABAABA
Pattern: AABA

## Sample Output
Pattern found at index: 0
Pattern found at index: 9
Pattern found at index: 12

## Time Complexity
Best Case: O(n)
Worst Case: O(n * m)

## Space Complexity
O(1) auxiliary space.

## Learning Outcome
Learned how to find pattern occurrences using
the simple Naive String Matching technique.
