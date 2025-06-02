Lucky Seven
-----------

Published by [Deep Xavier](https://edabit.com/user/a777e8chPvJkY3tKa) on [Edabit](https://edabit.com/challenge/jbQDEAk7viqz2x4AX)

Given an array of numbers, return whether it is possible to make the number **7** by adding any _three different numbers_ together.

### Examples

    luckySeven([2, 4, 3, 8, 9, 1]) ➞ true
    
    luckySeven([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) ➞ true
    
    luckySeven([0, 0, 0, 2, 3]) ➞ false
    // You cannot repeat the same number to make 2 + 2 + 3 = 7
    
    luckySeven([4,, 3]) ➞ false
    // You need three different numbers.

### Notes

*   Tests will only include numbers.
*   Trivially, any array with a length of less than two automatically fails the test.