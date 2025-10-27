package io.github.swar101.dsa.problem.binarysearch.josephus;

public class Josephus {

    public int getSurvivor(int n) {
        if (n == 1)
            return 0;
        return (getSurvivor(n - 1) + 2) % n;
    }

    public static void main(String[] args) {
        Josephus j = new Josephus();
        System.out.println(j.getSurvivor(5));
    }
}