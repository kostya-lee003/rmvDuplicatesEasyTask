package com.company;

public class Main {

    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 3, 4, 5, 5, 6, 6, 7, 7, 7};
        int numOfElements = 0;
        for (int i = 0, sequence = 1; i < nums.length; i++) {
            if (sequence == nums[i]) {
                numOfElements++;
                sequence++;
            }
        }
        int[] dupNums = new int[numOfElements];
        for (int i = 0, a = 0, sequence = 1; i < nums.length; i++) {
            if (sequence == nums[i]) {
                dupNums[a] = nums[i];
                a++;
                sequence++;
            }
        }
        nums = dupNums;
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
