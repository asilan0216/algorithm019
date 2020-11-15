/**
 * 26.
 * 首先必须是排序好的数组
 * 思路：双指针
 * 定义i,j 前后两个指针，用i 指针来存放不重复的元素
 * 如果i,j两个指针位置的元素不相等，则 i+1 位置的元素 放入j指针的元素, 同时i指针移动到下一个位置，j指针保持移动下个位置
 * 如果j,j两个指针位置的元素相等，说明j位置的是重复元素，也就没必要存放到i位置，则j继续移动到下一个位置
 * j循环直到数据的长度，最后返回i指针扫描的索引位置，即不重复的元素的最大下标，返回i+1个元素
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length <= 0){
            return 0;
        }
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                nums[i+1] = nums[j];
                i++;
            }
            j++;
        }
        return i + 1;

    }

}