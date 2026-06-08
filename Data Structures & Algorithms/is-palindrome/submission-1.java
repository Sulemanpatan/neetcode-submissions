class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.toLowerCase();
        String news=s1.replaceAll("[^a-zA-Z0-9]","");
        char[] a=news.toCharArray();
        int i=0;
        int j=a.length-1;
        while(i<j){
            if(a[i]!=a[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

