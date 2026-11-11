# Job Sequencing with Deadlines

## Aim
To schedule jobs before their deadlines and maximize total profit.

## Introduction
Each job has a deadline and profit. Only one job can be completed in one time slot.

## Algorithm
1. Sort jobs in descending order of profit.
2. Find the maximum deadline.
3. Create time slots.
4. Select jobs according to profit.
5. Place each job in the latest available slot before its deadline.
6. Calculate total profit.

## Time Complexity
O(n log n + n × d), where d is the maximum deadline.

## Space Complexity
O(d) for the slot array.

## Sample Output
Selected Jobs:
J3 J1 J5
Total Profit = 142

## Conclusion
Job Sequencing uses the Greedy Method to select profitable jobs within their deadlines.
