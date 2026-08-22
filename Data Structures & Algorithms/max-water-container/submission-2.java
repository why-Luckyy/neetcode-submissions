class Solution {
    public int maxArea(int[] heights) {
        int maxA = 0;
        int left = 0;
        int right = heights.length - 1;
        while(left < right) {
            int height = Math.min(heights[left], heights[right]);
            int width = Math.abs(left - right);
            int area = height * width;
            maxA = Math.max(area, maxA);
            if(heights[left] <heights[right]) left++;
            else right--;
        }
        return maxA;
    }
}
