package com.co.pa;

public class Node {

    private static final int ALPHABET_LENGTH = 26;

    char c;
    boolean isWord;
    Node[] children;

    public Node(char c){
        this.c = c;
        this.isWord = false;
        children = new Node[ALPHABET_LENGTH];
    }
}
