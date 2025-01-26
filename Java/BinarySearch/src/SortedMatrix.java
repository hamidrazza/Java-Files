import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int arr[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(search(arr,3)));
    }

    // Search in the row and col provided.
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row,mid};
            }
            else if(matrix[row][mid] < target){
                cStart = mid + 1;
            }
            else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1 , -1};
    }
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1){
            binarySearch(matrix,0,0,cols-1,target);
        }
        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols/2;

        while(rStart < (rEnd-1)){
            int mid = rStart+(rEnd-rStart)/2;

            if(matrix[mid][cMid] == target){
                return new int[]{mid,cMid};
            }
            else if(matrix[mid][cMid] < target){
                rStart = mid;
            }
            else{
                rEnd = mid;
            }
        }
        // Now we have only 2 rows remaining.
        // Searching if the target in available in the Column mid.
        if(target == matrix[rStart][cMid]){
            return new int[]{rStart,cMid};
        }
        if(target == matrix[rStart+1][cMid]){
            return new int[]{rStart+1,cMid};
        }

        // Now search in the 1st part
        if(target <= matrix[rStart][cMid-1]){
            return binarySearch(matrix,rStart,0,cMid-1,target);
        }
        // Now search in the 2nd part
        if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols-1]){
            return binarySearch(matrix,rStart,cMid+1,cols-1,target);
        }
        // Now search in the 3rd part
        if(target <= matrix[rStart+1][cMid-1]){
            return binarySearch(matrix,rStart+1,0,cMid-1,target);
        }
        // Now search in the 4th part
        else{
            return binarySearch(matrix,rStart+1,cMid+1,cols-1,target);
        }
    }
}
