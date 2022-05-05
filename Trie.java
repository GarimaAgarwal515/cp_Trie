package Trie;

import java.util.HashMap;

public class Trie {
    public class Node {
        char ch;
        HashMap<Character, Node> children;
        boolean isterminal;

        public Node(char ch) {
            this.ch = ch;
            children = new HashMap<>();
            isterminal = false;

        }
    }
    private Node root;

    public Trie() {
        this.root = new Node('*');
    }
    public void insert(String word) {
        Node curr = this.root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (curr.children.containsKey(ch))
                curr = curr.children.get(ch);
            else {
                Node nn = new Node(ch);
                curr.children.put(ch, nn);
                curr = nn;

            }
        }
        curr.isterminal = true;

    }

    public boolean search(String word) {
        Node curr = this.root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (curr.children.containsKey(ch))
                curr = curr.children.get(ch);
            else
                return false;

        }
        return curr.isterminal;

    }

    public boolean startsWith(String prefix) {
        Node curr = this.root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if (curr.children.containsKey(ch)) {
                curr = curr.children.get(ch);
            } else {
                return false;
            }


        }
        return true;
    }


}

