
# How did we come up with `4 * N` for the Segment Tree's length?

When we store our Segment Array in an array, we're storing a complete binary tree built on top of a array of size `n`.

The height of a binary tree is log<sub>2</sub>(n) i.e. h = log<sub>2</sub>(n) 
A full binary tree of height h has 2<sup>(h + 1)</sup> - 1 nodes, because h = log<sub>2</sub>x => x = 2<sup>h</sup>.

But n may not be a perfect power of 2. 
Example: If `n = 6`
    The next power of 2 is 8, 
    so the full tree will have 2*8 - 1 = 15 nodes.


We don't want to dynamically resize the tree `tree[]`, so 
we take the safe upperbound of 4 x n.

This 4n trick is a standard constant-factor safety net.
In reality, most trees use ~2n space when n is power of two. 

# How do we know which node to go to? 

