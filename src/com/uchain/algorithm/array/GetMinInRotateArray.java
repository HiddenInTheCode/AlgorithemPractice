package com.uchain.algorithm.array;

/**
 * @description 求旋转数组的最小值  旋转数组：把一个数组的最开始的若干个元素搬到数组的末尾
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * note：给出的所有元素都大于0，若数组大小为0，请返回0
 *
 * 思路：二分法
 */
public class GetMinInRotateArray {
    public int minNumberInRotateArray(int[] array){
        if(array.length==0){
            return 0;
        }
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                return array[i+1];
            }
        }
        return array[0];
    }
}
