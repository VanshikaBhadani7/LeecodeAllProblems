class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int [] ans = new int [num_people];
        int i = 1; // amount of candies in the current turn
        int pos = 0 ; //position from where we start
        
        while(candies > 0) {
            ans[pos++] += candies >= i ? i:candies;
            candies -= i;
            i++;
            pos %= num_people;

        }
        return ans;
        
    }
}