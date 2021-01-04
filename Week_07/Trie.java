/**
 * 208. 实现 Trie (前缀树)
 */
public class Trie {

    private boolean isEnd;

    private Trie[] next;

    private final int R = 26;


    /** Initialize your data structure here. */
    public Trie() {
        isEnd = false;
        next = new Trie[R];
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        if (word == null || word.length() == 0) {
            return;
        }
        Trie cur = this;
        char[] words = word.toCharArray();
        for (int i = 0; i < words.length; i++) {
            int n = words[i] - 'a';
            if (cur.next[n] == null) {
                cur.next[n] = new Trie();
            }
        }
        isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie node = searchPrefix(word);
        return node != null && isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie node = searchPrefix(word);
        return node != null;
    }

    private Trie searchPrefix(String word) {
        Trie node = this;
        char[] words = word.toCharArray();
        for (int i = 0;i < words.length;i++) {
            node = node.next[words[i] - 'a'];
            if (node == null) return null;
        }
        return node;
    }
}