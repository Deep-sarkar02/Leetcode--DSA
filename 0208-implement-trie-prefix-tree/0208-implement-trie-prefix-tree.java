class Trie {
    Trie child[] = new Trie[26];
    boolean eow;
    Trie root; // root reference

    public Trie() {
        for(int i = 0; i < 26; i++) {
            child[i] = null;
        }
        eow = false;
        root = this;   // the first node acts as the root
    }
    
    public void insert(String word) {
        Trie curr = root;
        for(int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if(curr.child[idx] == null) {
                curr.child[idx] = new Trie();
            }
            curr = curr.child[idx];
        }
        curr.eow = true;
    }
    
    public boolean search(String word) {
        Trie curr = root;
        for(int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if(curr.child[idx] == null) {
                return false;
            }
            curr = curr.child[idx];
        }
        return curr.eow;
    }
    
    public boolean startsWith(String prefix) {
        Trie curr = root;
        for(int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if(curr.child[idx] == null) {
                return false;
            }
            curr = curr.child[idx];
        }
        return true;
    }
}
