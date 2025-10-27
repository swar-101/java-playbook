package io.github.swar101.dsa.datastructure.trie;


public class Trie {

    private TrieNode node = new TrieNode();

    public void insert(String word) {
        for (char letter : word.toCharArray()) {

            if (!node.children.containsKey(letter)) {
                node.children.put(letter, new TrieNode());
            }
            node = node.children.get(letter);
        }
        node.isEndOfWord = true;
    }

    public boolean search(String word) {
        for (char letter: word.toCharArray()) {
            if (node.children.containsKey(letter)) {
                node = node.children.get(letter);
            } else return false;
        }
        return node.isEndOfWord;
    }
}
