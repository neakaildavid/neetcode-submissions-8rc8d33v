class Solution {
    List<String> res;
    public List<String> generateParenthesis(int n) {
        res = new ArrayList<>();
        backtrack(0, 0, n, "");
        return res;
    }

    public void backtrack(int open, int close, int n, String cur){
        if(open + close == n * 2){
            res.add(cur);
            return;
        }

        if(open > close){
            cur = cur + ')';
            backtrack(open, close + 1, n, cur);
            cur = cur.substring(0, cur.length() - 1);
        }

        if(open < n){
            cur = cur + '(';
            backtrack(open + 1, close, n, cur);
            cur = cur.substring(0, cur.length() - 1);
        }
    }
}
