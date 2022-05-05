package Trie;

public class TrieClient {
    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("ravi");
        t.insert("apple");
        t.insert("mango");
        t.insert("ram");
        System.out.println(t.search("app"));
        System.out.println(t.startsWith("app"));
        System.out.println(t.search("mango"));
        System.out.println(t.search("man"));

    }
}
