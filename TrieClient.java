package Trie;

public class TrieClient {
    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("ravi");
        t.insert("ram");
        t.insert("apple");
        t.insert("mango");
        t.insert("rita");

        System.out.println(t.startsWith("apl"));
        System.out.println(t.search("mango"));
        System.out.println(t.search("man"));
    }
}
