
public class SearchInRotatedSortedArray {
	public static int search(int []nums, int target) {
		int left=0;
		int right=nums.length-1;
		
		while(left<=right) {
			int mid=(left+right)/2;
			
			// Check if the mid element is the target
            if (nums[mid] == target) {
                return mid;  // Target found
            }

            // Determine which side is sorted
            if (nums[left] <= nums[mid]) { // Left side is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;  // Target is in the left side
                } else {
                    left = mid + 1;   // Target is in the right side
                }
            } else { // Right side is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;   // Target is in the right side
                } else {
                    right = mid - 1;  // Target is in the left side
                }
            }
        }

        return -1;  // Target not found
	}

	public static void main(String[] args) {

		  int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
	        System.out.println("Target Index: " + search(nums1, 0));  // Output: 4
	        
	        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
	        System.out.println("Target Index: " + search(nums2, 3));  // Output: -1
	}

}
