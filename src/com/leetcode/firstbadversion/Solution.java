package com.leetcode.firstbadversion;

public class Solution extends VersionControl {
    boolean result;
    int start;
    int end;
    int mid;
    long temp;

    public int firstBadVersion(int n) {

        start = 1;
        end = n;
        mid = (start + end) / 2;
        while (end - start > 1) {
            result = isBadVersion(mid);
            if (!result) {
                start = mid;


            } else {
                end = mid;


            }
            temp=(long) start+end;
            mid = (int) (temp / 2);

        }//loop ends
        if (isBadVersion(start))
            return start;
        else
            return end;

    }
}