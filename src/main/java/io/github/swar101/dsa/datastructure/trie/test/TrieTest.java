package io.github.swar101.dsa.datastructure.trie.test;


import org.swar101.dsa.datastructure.trie.Trie;

public class TrieTest {
    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("cat");
        trie.insert("card");
        trie.insert("car");
        trie.insert("cap");
        trie.insert("do");

        System.out.println(trie.search("cat"));
        System.out.println(trie.search("cart"));
        System.out.println(trie.search("car"));
        System.out.println(trie.search("cap"));
        System.out.println(trie.search("do"));
    }
}
