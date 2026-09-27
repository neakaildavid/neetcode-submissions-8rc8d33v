class Solution {

    HashMap<Character, String> encodings = new HashMap<>();
    public String encode(List<String> strs) {
        char ascii = 0;
        String output = "";
        for(String str : strs){
            encodings.put(ascii, str);
            output = output + ascii;
            ascii++;
        }

        return output;
    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<>();
        for(char c : str.toCharArray()){
            output.add(encodings.get(c));
        }

        return output;
    }
}
