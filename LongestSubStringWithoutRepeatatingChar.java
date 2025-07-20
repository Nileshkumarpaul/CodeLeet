class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set <Character> set = new HashSet<>();
        int start=0,end=0,result=Integer.MIN_VALUE;
        for(end=0;end<s.length();end++){
            char ch = s.charAt(end);
            while(set.contains(ch)){
                set.remove(s.charAt(start));
                start+=1;
            }
            set.add(ch);
            result = Math.max(result,set.size());
        }
        return result == Integer.MIN_VALUE ? 0 : result;
        
    }
}