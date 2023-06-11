package dinamic.dinamicprogram.removeElement;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int x = 2;

        int[] nums1 = {2, 3, 3, 2};
        int[] nums2 = {2, 2, 3};

        RemoveElement rm = new RemoveElement();
        System.out.println(rm.removeElement(nums, x));
        System.out.println(rm.removeElement(nums1, x));
        System.out.println(rm.removeElement(nums2, x));

        



    }

    private int removeElement(int[] nums, int val) {

        if (nums.length == 0) return 0;
        if (nums.length == 1) {
            return (nums[0] == val) ? 0 : 1;
        }
        int l = 0;
        while ( l < nums.length -1 && nums[l + 1] != val){
            l++;
        }




        int count = nums.length;
        for (int i = nums.length - 1; i >= l ; i++) {
            if (nums[i] == val){
                count--;
            }else {

            }


        }




        System.out.println(Arrays.toString(nums));
        return count;
    }
}


