package com.pah.learnings;

import java.util.Arrays;
/*
 Reversing String using recursion
 */
public class ReversingString {
    public static void main(String[] args){
        ReversingString sol = new ReversingString();
        char[] s = {'h','e','l','l','o'};
        sol.reverseString(s);
        for (char c : s) {
            System.out.print(c+"\t");
        }
    }
    public void reverseString(char[] s) {
        char[] c = Arrays.copyOf(s,s.length);
        reverse(s,0,s.length-1,c);
    }

    /*
    P as pointer
     */
    private void reverse(char[] s,int next,int p,char[] c){
        if(next >= s.length){
            return;
        }
        reverse(s,next+1,p-1,c);
        s[p] = c[next];
    }
}
