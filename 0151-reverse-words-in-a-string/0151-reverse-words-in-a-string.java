class Solution {
    public String reverseWords(String s) {
        s = s.trim(); // to remove the extra spaces from stand and end
        String[] words = s.split("\\s+");// split method = to divide words diff diffly
        StringBuilder ans = new StringBuilder();
        for(int i = words.length - 1 ; i >= 0 ; i--){
            ans.append(words[i]);
            if(i != 0) ans.append(" ");
        }
        return ans.toString();
    }
}