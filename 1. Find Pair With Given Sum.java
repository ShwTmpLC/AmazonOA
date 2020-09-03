https://leetcode.com/discuss/interview-question/356960

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        int largestPariNum = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i] - 30;
            if (map.containsKey(need) && i + map.get(need) > largestPariNum) {
                largestPariNum = i + map.get(need);
                result[0] = mmap.get(need);
                result[1] = i;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
