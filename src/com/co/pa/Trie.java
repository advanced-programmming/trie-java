package com.co.pa;

public class Trie {

    private Node root;

    public Trie(){
        root = new Node('\0'); //It's empty character
    }

    public Trie(String word){
        root = new Node('\0'); //It's empty character
        insert(word);
    }

    public void insert(String word){
        Node current = root;

        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(current.children[c - 'a'] == null) current.children[c - 'a'] = new Node(c);
            current = current.children[c - 'a'];
        }

        current.isWord = true;
    }

    public boolean search(String word){
        Node node = getNode(word);
        return node != null && node.isWord;
    }

    public boolean startsWith(String prefix){
        return getNode(prefix) != null;
    }

    private Node getNode(String word){
        Node current = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if (current.children[c - 'a'] == null) return null;
            current = current.children[c - 'a'];
        }
        return current;
    }
}
