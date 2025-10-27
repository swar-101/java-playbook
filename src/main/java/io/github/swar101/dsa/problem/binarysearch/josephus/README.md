


The Josephus problem is a theoretical problem related to a certain elimination game. 
The problem can be described as follows:

$$J(n, k) = (J(n - 1, k) + k) \% n$$


Where:
- `n` is the number of people in the circle.
- `k` is the step size (how many people to skip before eliminating one).
- Base case: `J(1, k) = 0` (if there's only one person, they are the last remaining).


Let's say we kill every other person, so the step size `k` is `2`. 
The problem can be solved using the following recursive formula:

$$J(n) = (J(n - 1) + 2) \% n$$

Example: n = 5, k = 2
Let's trace it step by step:
 
1. J(1) = 0
2. J(2) = (J(1) + 2) % 2 = (0 + 2) % 2 = 0
3. J(3) = (J(2) + 2) % 3 = (0 + 2) % 3 = 2
4. J(4) = (J(3) + 2) % 4 = (2 + 2) % 4 = 0
5. J(5) = (J(4) + 2) % 5 = (0 + 2) % 5 = 2

This gives us the position of the last person remaining (0-indexed).
