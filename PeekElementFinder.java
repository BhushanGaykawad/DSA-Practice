/*
 Problem: Find Peak Element in an Array
Description: A peak element in an array is an element that is strictly greater than its neighbors. Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any one of them.

You may imagine that nums[-1] = -∞ and nums[n] = -∞ (where n is the length of the array). In other words, an element is always considered greater than a non-existent neighbor.
Input:
An array of integers nums.
Output:
Return the index of any peak element.
Constraints:
The array nums will always contain at least one peak element.
You should solve it in O(log n) time complexity.
 * */


public class PeekElementFinder {
	
	public static int findPeakElement(int[] a) {
		int left =0;
		int right=a.length-1;
		
		while(left<right) {
			int mid=(left+right)/2;
			
            // If mid is greater than the next element
			if(a[mid]>a[mid+1]) {
				right=mid;
                // Potential peak on the left side (or mid)
			}
			else {
                // Potential peak on the right side
				left=mid+1;
			}
				
			
		}
		
        // When left == right, we've found a peak index
		return left;
	}

	public static void main(String[] args) {
		int[] nums1 = {1, 2, 3, 1};
        System.out.println("Peak Index: " + findPeakElement(nums1));  // Output: 2

        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};
        System.out.println("Peak Index: " + findPeakElement(nums2));  // Output: 5

	}

}
