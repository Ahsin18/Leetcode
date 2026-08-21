class Solution {
    public int lengthOfLastWord(String s) {
        int num=0;
        for(int i=s.length()-1;i>=0;i--)
        {
           
            if(s.charAt(i)==' ' && num==0)
            { 
                continue;
            }
            if (s.charAt(i) == ' ') {
                break;
            }

            num++;
        }
        return num;
    }
}