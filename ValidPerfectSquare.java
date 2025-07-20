class Solution {
    public boolean isPerfectSquare(int n) {
        if(n==1) return true;
        for(int i=n/2;i>=1;i--){
            if(i*i==n) return true;
        }
           return false;
    }
}