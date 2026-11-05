class Solution {
    List<String> res;
    public List<String> generateParenthesis(int n) {
        res = new ArrayList<>();
        backtrack(0, 0, "", n);
        return res;
    }

    public void backtrack(int l, int r, String s, int n){
        if(l == n && r == n){
            res.add(s);
            return;
        }

        if(l > r){
            s = s + ")";
            backtrack(l, r + 1, s, n);
            s = s.substring(0, s.length() - 1);
        }

        if(l < n){
            s = s + "(";
            backtrack(l + 1, r, s, n);
            s = s.substring(0, s.length() - 1);
        }
    }
}
