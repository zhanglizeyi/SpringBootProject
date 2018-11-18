/**
 * 300 LeetsCode Longest Increase sub-sequence
 */


public class LongestIncreaseSubsequence {


    public static int lisWithNSquareSolution(int[] nums) {
        //init
        int[] store = new int[nums.length];
        int max = 0;

        if(nums.length == 0) {
            return 0;
        }

        for(int i = 0; i < nums.length; i++) {
            //init each index of store as itself 1
            store[i] = 1;
            for(int j = 0; j < i; j++) {
                if(nums[j] < nums[i]) {
                    //update if current index of store smaller than previous contains
                    store[i] = store[i] > store[j] + 1 ? store[i] : store[j] + 1;
                }
            }
            max = Integer.max(max, store[i]);
        }
        return max;
    }

    /**
     *
     * @param nums
     * @return
     */
    public static int listWithNLogNSolution(int[] nums) {
        //init
        int[] store = new int[nums.length + 1];
        store[0] = Integer.MIN_VALUE;

        //create a int array [min, max, max, max...]
        for(int i = 1; i < store.length; i++) {
            store[i] = Integer.MAX_VALUE;
        }

        for (int num : nums) {
            int start = 0;
            int end = store.length - 1;
            while (start + 1 < end) {
                int mid = start + (end - start) / 2;
                if (store[mid] < num) {
                    start = mid;
                } else {
                    end = mid;
                }
            }
            store[end] = num;
        }

        for(int i = nums.length; i >= 1; i--) {
            if(store[i] != Integer.MAX_VALUE) {
                return i;
            }
        }

        return 0;
    }
}


