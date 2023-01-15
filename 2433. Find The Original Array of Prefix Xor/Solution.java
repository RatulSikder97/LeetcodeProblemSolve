class Solution {
    public int[] findArray(int[] pref) {
        int prevAns = pref[0];
        int n = pref.length;
        for (int i = 1; i < n; i++) {
            pref[i] = prevAns ^ pref[i];
            prevAns ^= pref[i];
        }
        return pref;
    }
}

class main {
    public static void main(String args[]) {
        int[][] matrix = {
                { 0, 0, 0, 0, 0 },
                { 7, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 7, 0, 6, 0, 0 },
                { 0, 0, 0, 0, 0 }
        };

        int r = matrix.length;
        int c = matrix[0].length;
        int rc = 0;

        int[][] rendered;
        
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(matrix[i][j] > 0) {
                   System.out.println(i);
                }
            }
        }
    }
}