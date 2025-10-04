/**
 * LeetCode POTD: 11. Container With Most Water
 * * Solution using the Two-Pointer technique.
 */
class Solution {
    /**
     * Finds the maximum amount of water a container can store.
     * * @param height An array of non-negative integers representing the heights of vertical lines.
     * @return The maximum area of water that can be contained.
     */
    public int maxArea(int[] height) {
        // Handle edge case where the array is null or has fewer than 2 elements.
        if (height == null || height.length < 2) {
            return 0;
        }

        // Initialize pointers at the beginning and end of the array.
        int left = 0;
        int right = height.length - 1;

        // Initialize a variable to store the maximum area found so far.
        int maxArea = 0;

        // Loop until the two pointers meet.
        while (left < right) {
            // The height of the container is limited by the shorter of the two lines.
            int currentHeight = Math.min(height[left], height[right]);
            
            // The width of the container is the distance between the pointers.
            int currentWidth = right - left;
            
            // Calculate the area for the current container.
            int currentArea = currentHeight * currentWidth;
            
            // Update the maximum area if the current area is larger.
            maxArea = Math.max(maxArea, currentArea);

            // --- The Core Logic ---
            // To maximize the area, we need to increase either width or height.
            // Since we are moving pointers inward, the width will always decrease.
            // Therefore, our only chance to find a larger area is to find a taller line.
            // We move the pointer that points to the shorter line, as it is the limiting factor.
            if (height[left] < height[right]) {
                left++; // Move the left pointer to the right.
            } else {
                right--; // Move the right pointer to the left.
            }
        }

        // Return the maximum area found.
        return maxArea;
    }
}
