# Heap Sort

## Aim
To sort an array using the Heap Sort algorithm.

## Algorithm
1. Build a Max Heap.
2. Swap the root element with the last element.
3. Reduce the heap size.
4. Apply heapify again.
5. Repeat until the array is sorted.

## Time Complexity
- Best Case: O(n log n)
- Average Case: O(n log n)
- Worst Case: O(n log n)

## Space Complexity
O(1) auxiliary space for this implementation.

## Sample Input
4 10 3 5 1

## Sample Output
[1, 3, 4, 5, 10]

## Conclusion
Heap Sort uses a Max Heap data structure to arrange elements in ascending order.
