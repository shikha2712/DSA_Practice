package com.company.stack;

import java.util.Stack;

public class MaxElementInEverykWindow {
    public static int[] MaxElement(int [] arr,int k){
        int [] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            for(int j= i;j<i+k;j++){
                if(arr[j] > max)
                    max = arr[j];
            }

        }
        return result;
    }

}
