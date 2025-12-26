class Solution {
    public int bestClosingTime(String customers) {
        char[] ch = customers.toCharArray();
        int currpenalty = 0,best_penalty = 0 , ans = 0;

        for(int i =  0 ; i < customers.length(); i++) {

            if(ch[i]== 'Y'){
                currpenalty--;
                if(currpenalty < best_penalty) {
                    best_penalty = currpenalty;
                    ans = i+1;
                }
            }
            else currpenalty++;
        }
        return ans;
        
    }
}