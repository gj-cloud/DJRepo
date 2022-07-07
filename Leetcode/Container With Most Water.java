class Solution {
    public int maxArea(int[] height) {
    
       int max_area = 0;
        int a = 0;
        int b = height.length-1;
        
        while(a < b){
            if(height[a] < height[b]){
                max_area = Math.max(max_area, height[a] * (b-a));
                a += 1;
                
            }else{
                 max_area = Math.max(max_area, height[b] * (b-a));
                b -= 1;
            }
        }
        
        return max_area;
    }
    }