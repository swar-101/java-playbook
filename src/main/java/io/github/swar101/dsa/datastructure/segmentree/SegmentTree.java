package io.github.swar101.dsa.datastructure.segmentree;

public class SegmentTree {
    int[] tree;
    int n;
    int[] arr;

    public SegmentTree(int[] arr) {
        n = arr.length;
        this.arr = arr;
        tree = new int[4 * n];
        build(arr, 0, n - 1, 0);
    }

    private void build(int[] arr, int start, int end, int node) {
        if (start == end) {
            tree[node] = arr[start];
            return;
        }

        int mid = (start + end) / 2;
        build(arr, start, mid, 2 * node + 1);
        build(arr, mid + 1, end, 2 * node + 2);

        tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
    }

    public int query(int node, int start, int end, int l, int r) {
        // complete overlap
        if (l <= start && r >= end) {
            return tree[node];
        }
        // no overlap
        if (r < start || l > end) {
            return 0;
        }

        // partial overlap
        int mid = (start + end) / 2;
        int leftSum = query(2 * node + 1, start, mid, l, r);
        int rightSum = query(2 * node + 2, mid + 1, end, l, r);
        return leftSum + rightSum;
    }

    public void update(int node, int start, int end, int index, int value) {
        if (start == end) {
            tree[node] = value;
            arr[start] = value;
            return;
        }

        int mid = (start + end) / 2;
        if (index <= mid) {
            update(2 * node + 1, start, mid, index, value);
        } else {
            update(2 * node + 2, mid + 1, end, index, value);
        }

        tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
    }
}