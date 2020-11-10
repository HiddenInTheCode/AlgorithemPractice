package com.uchain.algorithm.array;

/**
 * @description  调整数组顺序使奇数位于偶数前面
 * 思路：①数组中如果是奇数就向前移动偶数向后移动
 * ②创建两个list，将奇数和偶数分别存到这两个list里，然后再赋值给array
 */
public class reOrderArray {

    //①
    public void reOrder(int[] array){
        if(array.length<=1){
            return ;
        }
        int i=0;
        while(i<array.length){
            int j=i+1;
            while(array[i]%2==0){ //偶数,j前进
                if(j==array.length-1){
                    return;
                }
              j++;
            }
            int count=j-i;
            int temp=array[i];
            array[i]=array[j];
            while(count>1){
                array[i+count]=array[i+count-1];
                count--;
            }
            array[i+1]=temp;
        }
        i++;
    }

}
