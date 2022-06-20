package Arrays_and_strings;
import java.util.*;
public class reshapeTheMatrix_566 {
    public static void main(String args[]){
        int[][] mat = {{1,2},{3,4}};
        int[][] result;
        result = matrixReshape(mat,1,4);
        for(int[]a: result){
            System.out.println(Arrays.toString(a));
        }
    }

    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int c1 = 0, r1 = 0; //index number of res matrix
        int[][] res = new int[r][c];
        if(m*n == r*c) {//reshape is possible
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    if(c1 == c){ //means col of a row of res reached it max, now increase row and start col again
                        c1 = 0;
                        r1++;
                    }
                    res[r1][c1] = mat[i][j];
                    c1++; //increase the col of a row of res until it reaches it max
                }
            }
            return res; //return new reshaped matrix
        }
        return mat; //else return old matrix
    }
}
