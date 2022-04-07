package com.company.stack;

import java.util.Stack;

public class ReverseString {
    public static String reverse(String str) {
        Stack<Character> st = new Stack<>();
        char [] chars = str.toCharArray();
        for(char c : chars){
            st.push(c);
        }
        for(int i = 0; i < str.length();i++){
            chars[i] = st.pop();
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "SHINNY";
        System.out.println("Before reverse - " +str);
        System.out.println("After reverse - " +reverse(str));
    }
}
