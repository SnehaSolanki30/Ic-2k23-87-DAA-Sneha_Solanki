# Binary Search using Divide and Conquer

## Aim
To search an element in a sorted array using the Divide and Conquer technique.

## Algorithm
1. Find the middle element.
2. Compare the middle element with the search key.
3. If equal, return its position.
4. If the key is smaller, search the left half.
5. Otherwise, search the right half.
6. Repeat until found or the search range becomes empty.

## Time Complexity
- Best Case: O(1)
- Average Case: O(log n)
- Worst Case: O(log n)

## Space Complexity
O(log n) due to recursion.

## Sample Input
5
10 20 30 40 50
30

## Sample Output
Element found at index: 2

## Conclusion
Binary Search reduces the search area into half at every step.
