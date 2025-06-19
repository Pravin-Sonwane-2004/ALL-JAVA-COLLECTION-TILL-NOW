package revision_everything;
public class Water {
    public static int waterp(int height[]) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int currarea = Math.min(height[left], height[right])*(right-left);
            maxArea = Math.max(maxArea, currarea);
            if(height[left]<height[right]) {
                left ++;
            } 
            else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Maximum water container area: " + waterp(height));
    }
}
