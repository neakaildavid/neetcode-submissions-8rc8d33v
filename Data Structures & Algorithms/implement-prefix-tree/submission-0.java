class PrefixTree {
    ArrayList<String> trie;
    public PrefixTree() {
        trie = new ArrayList<String>();
    }

    public void insert(String word) {
        trie.add(word);
    }

    public boolean search(String word) {
        for(int i = 0; i < trie.size(); i++){
            if(trie.get(i).equals(word)){
                return true;
            }
        }
        return false;
    }

    public boolean startsWith(String prefix) {
        int preLen = prefix.length();
        for(int i = 0; i < trie.size(); i++){
            String curWord = trie.get(i);
            if(curWord.length() >= preLen){
                if(checkPre(prefix, curWord) == true){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkPre(String prefix, String word){
        for(int i = 0; i < prefix.length(); i++){
            if(word.charAt(i) != prefix.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
