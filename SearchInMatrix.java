
public class SearchInMatrix {
	public static boolean searchMatrix(int[][] m, int target) {
		if(m==null || m.length==0 ||m[0].length==0) {
			return false;
		}
		
		int rows=m.length;
		int cols=m[0].length;
		
		//start from top-right corner
		//when current element is less than the target element move left
		//when current element is greater than the target element move right

		int row=0;
		int col=cols-1;
		
		while(row<rows && col>=0) {
			
			if(m[row][col]==target) {
				return true;
			}else if(m[row][col] > target ) {
				col--;
			}else {
				row++;
			}
		}
		
		return false;
	}

	

	public static void main(String[] args) {

		int[][] matrix = {
	            {1, 4, 7, 11, 15},
	            {2, 5, 8, 12, 19},
	            {3, 6, 9, 16, 22},
	            {10, 13, 14, 17, 24},
	            {18, 21, 23, 26, 30}
	        };
	        int target = 100;
	        System.out.println("Is target present: " + searchMatrix(matrix, target));
	}

}
