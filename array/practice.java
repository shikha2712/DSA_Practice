package com.company.array;




public class practice {
    public static void main(String[] args) {

        int n = 5;
        int i, j;


        for (i = 0; i < n; i++) {
            for (j = 1; j <= i+1; j++) {
                System.out.print(j);
            }
            for (j=i; j >=1; j--) {
                System.out.print(j);
            }
            System.out.println(" ");


        }
    }
}
