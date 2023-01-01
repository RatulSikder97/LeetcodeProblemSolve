class Solution {
    public int finalValueAfterOperations(String[] operations) {
       int x = 0;
       for(int i = 0; i < operations.length; i++ ) {
          x = (operations[i].charAt(0) == '+' || operations[i].charAt(2) == '+') == true ? ++x : --x;
       } 
       return x;
    }
}
