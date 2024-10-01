import java.util.HashMap;

public class PrefixSum {
	
	public static int subarraySum(int[]nums,int k) {
		HashMap <Integer,Integer>prefixSumMap=new HashMap<>();
		
		prefixSumMap.put(0,1);
		
		int currentSum=0;
		int count=0;
		for(int num:nums) {
			currentSum+=num;
			
			if(prefixSumMap.containsKey(currentSum-k)) {
				count+=prefixSumMap.get(currentSum-k);
			}
			
			prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0)+1);
		}
		return count;
	}
	
	

	 public static void main(String[] args) {
	        int[] nums1 = {1, 1, 1};
	        System.out.println("Number of Subarrays: " + subarraySum(nums1, 2));  // Output: 2
	        
	        int[] nums2 = {1, 2, 3};
	        System.out.println("Number of Subarrays: " + subarraySum(nums2, 3));  // Output: 2
	    }
}
