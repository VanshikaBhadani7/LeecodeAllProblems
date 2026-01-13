class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        //Arrays.sort(nums);
        int belowTCount = 0 ; 
        int tCount  = 0 ; 
        
        for(int n:nums) {
            if(n < target) 
                belowTCount++;

            else  if(n == target)
                tCount++;
        }
        List <Integer> res = new ArrayList<>();
        for(int t = 0 ; t < tCount ; t++) 
            res.add(belowTCount++);
        
        
        return res;
        
    }
}