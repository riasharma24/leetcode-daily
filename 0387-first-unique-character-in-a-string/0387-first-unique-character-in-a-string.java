class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> s1=new HashMap<>();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s1.containsKey(s.charAt(i)))
            {
                count=s1.get(s.charAt(i));
                count++;
                s1.remove(s.charAt(i));
                s1.put(s.charAt(i),count);
            }
            else
            {
                s1.put(s.charAt(i),1);
            }
        }
       
        for(int i=0;i<s.length();i++)
        {
            if(s1.get(s.charAt(i))==1)
            {
                return i;
            }
        }
            return -1;
    }
}