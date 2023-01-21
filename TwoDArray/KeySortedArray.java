package TwoDArray;
//staircase search
public class KeySortedArray {
    public static boolean searchKey(int matrix[][], int key) {
        int n = matrix.length;
        int m = matrix[0].length;
        //top right started the search
        // int row = 0;
        // int col = n-1;
        
        // while(row < n && col >=0) {

        //     if(matrix[row][col] == key) {
        //         System.out.print("key is found at (" + row + "," + col + ")");
        //         break;
        //     }
        //     else if(key < matrix[row][col]) {
        //         col--;
        //     }
        //     else if (key > matrix[row][col]){
        //         row++;
        //     }
            //    else{
            //     System.out.print("key is not found");
            //    }
        // }

        //bottom left started the search
        int row = n-1;
        int col = 0;
        while(row >=0 && col < m) {
            if(matrix[row][col] == key){
                System.out.print("key is found at (" + row + "," + col + ")");
                return true;
            }
            else if(key < matrix[row][col]) {
                row--;
            }
            else if ( key > matrix[row][col]) {
                col++;
            }
        }
        
        System.out.print("key is not found");
        return false;
        
    }
    public static void main(String args[]) {

        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16,17}};
        int key = 7;
        
        searchKey(matrix, key);
    }
}
