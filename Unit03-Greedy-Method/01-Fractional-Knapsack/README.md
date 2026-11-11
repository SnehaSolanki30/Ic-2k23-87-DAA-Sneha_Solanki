# Fractional Knapsack Problem

## Aim
To maximize the total value of items using the Greedy Method.

## Introduction
In Fractional Knapsack, we can take a complete item or a fraction of an item.

## Algorithm
1. Calculate value/weight ratio of every item.
2. Sort items in descending order of ratio.
3. Select the item with the highest ratio.
4. If the complete item fits, take it.
5. Otherwise, take the required fraction.
6. Calculate the total value.

## Time Complexity
O(n log n) due to sorting.

## Space Complexity
O(n) for storing items.

## Sample Input
Items: (10,60), (20,100), (30,120)
Capacity: 50

## Sample Output
Maximum Value = 240.0

## Conclusion
The Greedy Method selects items according to their value-to-weight ratio to maximize profit.
