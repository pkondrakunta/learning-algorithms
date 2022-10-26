# Learning Algorithms

My working repository to learn data structures and algorithms. Includes important notes to help review some concepts tp brush up.

## Data Structures

## Sorting

Elementary Sorts:

1. Insertion Sort
2. Selection Sort
3. Bubble Sort
4. Shell Sort


### Stability in Sorting
A stable sort is one where, in the event of two equal keys, we maintain the original order.

| Sorting Algorithm | Stability |
| --- | --- |
| Insertion Sort | Stable |
| Selection Sort | Not Stable |
| Shell Sort | Not Stable |
| Merge Sort | Stable |

### Comparison

| Sort | Stable | Adaptive | Average Comparisons | Swaps |
| --- | --- | --- | --- | --- |
| Selection Sort | No | No | $ 1 \over 2$ $ N(N-1) $ | $ N-1 $|
| Insertion Sort | Yes | Yes | $ 1 \over 4$ $ N(N-1) $ |  $ 1 \over 4$ $ N(N-1) $|

[Time Complexities for Data Structures](https://www.geeksforgeeks.org/time-complexities-of-different-data-structures/)

!(Sorting times)[image.png]

<!-- | sorting | inplace| stable | best | average | worst | remarks |
| --- | ---| --- | --- | --- | --- | --- |
| selection | Yes | No | $ 1 \over 2 $ $N ^ 2 $| $ 1 \over 2 $ $N ^ 2 $| $ 1 \over 2 $ $N ^ 2 $ |N swaps |
| insertion | Yes | Yes | $ N $| $ 1 \over 4 $ $N ^ 2 $| $ 1 \over 2 $ $N ^ 2 $ | use for small $N$ or partially ordered|
| shell | Yes | No | $ N log \base 3\N$| $ 1 \over 4 $ $N ^ 2 $| $ 1 \over 2 $ $N ^ 2 $ | use for small $N$ or partially ordered| -->
