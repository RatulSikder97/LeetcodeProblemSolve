class main {
    public static void main(String args[]) {
        int n = 25;
        int i =0;
        int sum=0;
        int temp=0;
        int sum1=0, sum2=0;
        while(n>0) {
            temp=n%10;
            n /=10;
            if(i %2==0) {
                sum1 += temp;
            } else {
                sum2 += temp;
            }
            
            i++;
        }

        int ans = (sum1 > sum2) ? (sum1 - sum2) : (sum2 - sum1);
        
        System.out.println(ans);
    }
}