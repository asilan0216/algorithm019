

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
            if (nums == null || nums.length <= 0) {
                return null;
            }
            Map<Integer, Integer> map = new HashMap();
            for (int i = 0; i < nums.length; i++) {
                int other = target - nums[i];
                if (map.containsKey(other)){
                    int index = map.get(other);
                    return new int[]{index, i};
                }
                map.put(nums[i], i);
            }
            return null;
        }

}