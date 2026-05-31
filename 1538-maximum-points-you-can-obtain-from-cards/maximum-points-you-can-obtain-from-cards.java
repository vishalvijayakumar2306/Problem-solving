class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0;
        int rsum=0;
        int maxlen=0;
        int n=cardPoints.length;
        for(int i=0;i<k;i++){
            lsum=lsum+cardPoints[i];
            maxlen=lsum;
        }
        int rindex=n-1;
        for(int i=k-1;i>=0;i--){
            lsum=lsum-cardPoints[i];
            rsum=rsum+cardPoints[rindex];
            rindex--;
            maxlen=Math.max(maxlen,lsum+rsum);
        }
        return maxlen;
    }
}