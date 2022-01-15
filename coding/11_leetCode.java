class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i=0;i < height.length;i++) {
            
           for (int j= height.length-1;j>i;j--) {
                  if(height[i]>=height[j]){
                      if(max < height[j]*(j-i)) {
                         max = height[j]*(j-i);
                      }
                     
                  }
                  else{
                      if(max < height[i]*(j-i)) {
                         max = height[i]*(j-i);
                      }
                      
                  }
           }   
        }
        return max;
    }
}