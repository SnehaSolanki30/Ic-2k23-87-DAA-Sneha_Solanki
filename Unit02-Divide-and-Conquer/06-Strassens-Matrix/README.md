# Strassen's Matrix Multiplication

## Aim
To multiply two square matrices using Strassen's algorithm.

## Algorithm
1. Divide both matrices into four smaller submatrices.
2. Calculate seven multiplication products.
3. Use addition and subtraction to calculate four result submatrices.
4. Combine the four submatrices.
5. Display the final matrix.

## Time Complexity
O(n^2.807)

## Space Complexity
O(n²) or more auxiliary storage due to recursive matrix creation.

## Input Condition
Matrix size must be a positive power of 2.

## Sample Input
2

1 2
3 4

5 6
7 8

## Sample Output
19 22
43 50

## Conclusion
Strassen's algorithm multiplies matrices using seven recursive multiplications instead of eight.
