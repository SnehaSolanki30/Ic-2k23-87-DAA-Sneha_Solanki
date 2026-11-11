# 15-Puzzle using Branch and Bound

## Aim
To solve the 15-Puzzle Problem using
Branch and Bound with A* search.

## Problem Statement
The 15-Puzzle consists of a 4x4 board containing
15 numbered tiles and one empty space.

The objective is to arrange the tiles in order
by moving tiles into the empty space.

## Algorithm
1. Read the initial puzzle configuration.
2. Calculate the Manhattan Distance heuristic.
3. Insert the initial state into a priority queue.
4. Select the state with minimum estimated cost.
5. Generate possible movements of the empty space.
6. Calculate the cost of each new state.
7. Avoid revisiting states with a higher cost.
8. Continue until the goal state is reached.

## Heuristic Function
f(n) = g(n) + h(n)

Where:
- g(n) = Cost of moves made so far.
- h(n) = Manhattan Distance from the goal state.
- f(n) = Estimated total cost.

## Sample Input

1  2  3  4
5  6  7  8
9  10 11 12
13 14 0  15

## Sample Output

Solution Found!

Move: Start

1  2  3  4
5  6  7  8
9  10 11 12
13 14 0  15

Move: Right

1  2  3  4
5  6  7  8
9  10 11 12
13 14 15 0

Total Moves = 1

## Time Complexity
Worst-case time complexity is exponential
in the search depth.

## Space Complexity
Worst-case space complexity is exponential
because generated states are stored.

## Learning Outcome
Learned how Branch and Bound and heuristic
search can solve the 15-Puzzle Problem.
