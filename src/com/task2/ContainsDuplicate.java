package com.task2;

import java.util.Arrays;

public class ContainsDuplicate {
   public static boolean isDuplicate (int[] nums) {

      Arrays.sort(nums);
      for (int i = 0; i < nums.length - 1; i++) {
         if (nums[i] == nums[i+1]) {
            return true;
         }
      }
      return false;   }
}
