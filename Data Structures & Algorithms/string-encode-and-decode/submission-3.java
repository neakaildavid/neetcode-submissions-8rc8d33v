class Solution {
    ArrayList<Integer> lengths = new ArrayList<Integer>();
    public String encode(List<String> strs) {
        String finString = "";
        for(int i =0; i < strs.size(); i++){
            finString += strs.get(i);
            int len = strs.get(i).length();
            lengths.add(len);
        }
        return finString;
    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<String>();
        int j = 0;
        for(int l = 0; l < lengths.size(); l++){
            String curString = str.substring(j, j+ lengths.get(l));
            output.add(curString);
            j = j + lengths.get(l);
        }
        /*for(int i = 0; i < str.length(); i++){
            int len = lengths.get(j);
            String curString = "";
            j++;
            for(int k = i; k < i + len; k++){
                curString += str.charAt(k);
            }
            output.add(curString);
            i += len-1;
        }
        */
        return output;
    }
}
