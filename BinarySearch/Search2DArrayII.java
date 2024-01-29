

package BinarySearch;
import java.util.*;

public class Search2DArrayII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0, col = matrix[0].length-1;

       while(row<=matrix.length-1 && col>=0 ){
           if(matrix[row][col]==target){
               return true;
           } else if(matrix[row][col]<target) {
               row++;
           } else {
               col--;
           }
       }
       return false;
    }

    // call the function for any value 
    public static void main(String[] args) {
        
    }
}
