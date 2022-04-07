package com.company.array;

public class InsertionSort {
    public static void main(String[] args) {
        int [] a = {5,1,6,2,4,3};
        int temp;

        for(int i =1;i<a.length;i++){

            temp = a[i];
            int j=i;

            while(j>0 && a[j-1] > temp)
            {
                a[j] = a[j-1];
                j--;
            }
            a[j] = temp;
        }
        for(int i : a){
            System.out.print(i + " ");
        }
    }
}
