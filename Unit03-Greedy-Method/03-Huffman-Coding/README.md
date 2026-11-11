# Huffman Coding

## Aim
To generate Huffman codes for characters using their frequencies.

## Introduction
Huffman Coding is a Greedy algorithm used in lossless data compression. Characters with higher frequency generally receive shorter codes.

## Algorithm
1. Create a leaf node for each character.
2. Insert all nodes into a priority queue.
3. Remove the two nodes with the lowest frequency.
4. Combine them into a new node.
5. Insert the new node into the queue.
6. Repeat until only one node remains.
7. Generate codes by traversing the Huffman tree.

## Time Complexity
O(n log n), where n is the number of characters.

## Space Complexity
O(n) for the Huffman tree and priority queue.

## Sample Input
A:5, B:9, C:12, D:13, E:16, F:45

## Sample Output
The program displays a binary code for each character.
The exact codes can vary if multiple nodes have equal frequencies.

## Conclusion
Huffman Coding generates variable-length binary codes and is used for lossless data compression.
