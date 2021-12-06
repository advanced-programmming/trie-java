package com.co.pa;

public class Main {

    public static void main(String[] args) {
	    String word = "supercalifragislisticoespiralidoso";
        Trie trie = new Trie(word);
        boolean result = trie.startsWith("super");
    }
}
