package com.fxq.datastructure.day1;

/**
 * 最大子列和
 */
public class MaxSubSequence {
    public static void main(String[] args) {
        int[] number = {3,-1,4,-2,5,4,-5,3};
        int thisNum = 0;
        int maxNum = 0;
        for (int i = 0; i < number.length; i++) {
            thisNum += number[i];
            if(thisNum > maxNum){
                maxNum = thisNum;
            }else if(thisNum < 0){
                thisNum = 0;
            }
        }
        System.out.println(maxNum);
    }
}
