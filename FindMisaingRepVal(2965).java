class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n*n;

        int [] freq = new int [size+1];
        int rep = -1;
        int miss = -1;

        for (int[] row : grid){
            for (int num : row){
                freq [num]++;
            }
        }
        for (int i = 1 ; i <= size ; i++){
            if (freq[i] == 2){
                rep = i;
            }
            if (freq[i] == 0){
                miss = i;
            }

        }
        return new int[] { rep, miss };
    }
}