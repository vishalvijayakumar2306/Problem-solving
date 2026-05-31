class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        int n=height.length;
        int l=0;int r=n-1;
        while(l<r){
            int width=r-l;
            int h=Math.min(height[l],height[r]);
            int area=width*h;
            maxarea=Math.max(maxarea,area);
            if(height[l]<=height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxarea;
    }
}