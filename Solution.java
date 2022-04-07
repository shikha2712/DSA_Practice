package com.company;

public class Solution {

        public int finalValueAfterOperations(String[] operations) {
            int X = 0;
            for(int i =0; i < operations.length;i++){
                if(operations[i] == "++X")
                    X = X + 1;
                else if(operations[i] == "X++")
                    X = X + 1;
                else if(operations[i] == "--X")
                    X = X - 1;
                else if(operations[i] == "X--")
                    X = X - 1;
            }
            return X;
        }



}
