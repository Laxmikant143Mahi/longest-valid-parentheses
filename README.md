# Longest Valid Parentheses

## Problem
Given a string containing only '(' and ')', find the length of the longest valid parentheses substring.

## Approach
Used Stack-based approach:
- Push index of '('
- For ')', pop and calculate length
- Maintain base index for edge cases

## Time Complexity
O(n)

## Space Complexity
O(n)

## Example
Input: "(()"
Output: 2

Input: ")()())"
Output: 4
