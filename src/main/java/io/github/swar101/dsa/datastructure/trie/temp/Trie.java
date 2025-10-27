package io.github.swar101.dsa.datastructure.trie.temp;


public class Trie {

    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char letter : word.toCharArray()) {
            if (!node.children.containsKey(letter)) {
                node.children.putIfAbsent(letter, new TrieNode());
            }
            node = node.children.get(letter);
        }
        node.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for (char letter : word.toCharArray()) {
            if (!node.children.containsKey(letter))
                return false;

            node = node.children.get(letter);
        }

        return false;
    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (char letter : prefix.toCharArray()) {
            if (!node.children.containsKey(letter))
                return false;
            node = node.children.get(letter);
        }
        return true;
    }
}