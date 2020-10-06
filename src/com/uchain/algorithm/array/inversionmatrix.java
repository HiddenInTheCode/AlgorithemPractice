package com.uchain.algorithm.array;

import java.util.Arrays;

/**
 * 矩阵反转
 * 输入：[[1,2,3][4,5,6][7,8,9]]
 * 输出：[[1,4,7][2,5,8][3,6,9]]
 */
public class inversionmatrix {
    public static void main(String[] args) {
        int[][] A=new int[][]{
            {1,2,3},{4,5,6},{7,8,9}
        };
        System.out.println(Arrays.deepToString(new inversionmatrix().transpose(A)));
    }

        public int[][] transpose(int[][] A) {
            int n=A.length;
            int m=A[0].length;
            int[][] B=new int[m][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<A[i].length;j++){
                    B[i][j]=A[j][i];
                }
            }
            return B;
        }

}
