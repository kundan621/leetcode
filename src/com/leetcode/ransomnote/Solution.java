package com.leetcode.ransomnote;

public class Solution {
    public static void main(String[] args) {
        String ransomNote="aac";
        String magazine="aab";
        int[] count=new int[26];
        char[] ransomArray=ransomNote.toCharArray();
        char[] magazineArray=magazine.toCharArray();

        for(int i=0;i<magazineArray.length;i++){
            count[magazineArray[i]-'a']++;
        }
        boolean result=true;
        for(int i=0;i<ransomArray.length;i++){
            if(count[ransomArray[i]-'a']==0)
                result=false;
            count[ransomArray[i]-'a']--;

        }
        if(result)
            System.out.println("yes");
        else
            System.out.println("no");

    }

}
