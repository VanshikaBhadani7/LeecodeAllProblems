class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n = matrix.length;

        int leastElement = 100001;
        long sum = 0L;
        int negitiveCount = 0;

        for(int []rows : matrix) {
            for(int value : rows) {
                if(value < 0) {
                negitiveCount++;
                value = -value;

                }
                sum += value ;
                if(value < leastElement){ 
                    leastElement = value;
                }

                

            }
            

        }
        return (negitiveCount %2 == 0) ? sum:(sum-2*leastElement);

        
    }
   
}