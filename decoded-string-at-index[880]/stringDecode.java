class Solution {
    public String decodeAtIndex(String s, int k) {
        long size = 0;
        for(int i = 0 ; i < s.length() ; i++ ) {
            if(Character.isDigit(s.charAt(i))) {
                size *= (s.charAt(i) - '0');
            } else {
                size++;
            }
        }
        

        for(int j = s.length() - 1 ; j >=0 ; --j) {
            char posChar = s.charAt(j);
            
            if(Character.isDigit(posChar)) {
                size /= posChar - '0';
                k %=size;
            } else {
                if(k==0 || k == size) {
                    return Character.toString(posChar);
                }
                size--;
            }
        }

        return null;
    }
}