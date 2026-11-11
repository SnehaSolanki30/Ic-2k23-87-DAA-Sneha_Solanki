# Sorting Performance Comparison

## Aim
To compare the execution time of Merge Sort, Quick Sort and Heap Sort.

## Introduction
Sorting Performance Comparison helps us understand how different sorting algorithms perform for different input sizes.

## Algorithm
1. Generate random input data.
2. Create copies of the same input for each algorithm.
3. Execute Merge Sort and measure its time.
4. Execute Quick Sort and measure its time.
5. Execute Heap Sort and measure its time.
6. Display the measured execution times.

## Time Complexity

| Algorithm | Average Case | Worst Case |
|---|---|---|
| Merge Sort | O(n log n) | O(n log n) |
| Quick Sort | O(n log n) | O(n²) |
| Heap Sort | O(n log n) | O(n log n) |

## Space Complexity
- Merge Sort: O(n)
- Quick Sort: O(log n) average recursion stack
- Heap Sort: O(1) auxiliary space

## Performance Measurement
Java System.nanoTime() is used to measure execution time.

## Result
Run the program and record the actual execution times for each input size. Results may differ depending on the computer and system load.

## Learning Outcomes
- Learned to measure execution time.
- Understood the performance of sorting algorithms.
- Learned how input size affects execution time.

## Conclusion
The program compares three sorting algorithms using the same input data and helps understand their performance.
