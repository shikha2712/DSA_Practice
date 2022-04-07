package com.company;

public class sorting_array {

    public static void main(String[] args)
    {
        //bubble sort
        
//        int a[] = {2,3,-1,0,5,7,1};
//        int n = a.length;
//        int temp = 0;
//
//        for(int i = 0; i<n-1;i++){
//            boolean sorted = true;
//
//            for(int j = 0;j<n-i-1;j++){
//
//                if(a[j+1]< a[j]){
//                    temp = a[j];
//                    a[j] = a[j+1];
//                    a[j+1] = temp;
//                    sorted = false;
//                }
//            }
//            if(sorted) break;
//        }
//        for(int e : a){
//            System.out.print(e + " ");
//        }


        //Selection sort

        int a[] = {2,3,-1,0,5,7,1};
        int n = a.length;
        int temp;

        for(int i=0;i<n-1;i++)
        {
            int minInd = i;

            for (int j = i;j<n;j++)
            {
                if(a[j]<a[minInd])
                {
                    minInd = j;
                }
            }
            temp = a[i];
            a[i] = a[minInd];
            a[minInd]=temp;

        }

        for(int e: a)
        {
            System.out.print(e+" ");
        }
	
    }
}
