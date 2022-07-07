class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        
       while(end < s.length()) {
           char c = s.charAt(end);
           if(!set.contains(c)) {
               set.add(c);
               end++;
               max = Math.max(max, set.size());
           } else {
               char x = s.charAt(start);
               set.remove(x);
               start++;
           }
       }
      return max;
    }
}