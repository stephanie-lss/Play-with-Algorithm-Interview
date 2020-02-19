/**
 * @author LiSheng
 * @date 2020/2/18 9:37
 */
public class SortColors {
    /**
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     * @param nums
     */
    public void sortColors(int[] nums) {
        int zero = -1;
        int two = nums.length;
        for (int i = 0; i < two; ) {
            if (nums[i++] == 1) {
            } else if (nums[i] == 2) {
                swap(nums, i, --two);
            } else if (nums[i] == 0) {
                swap(nums, i++, ++zero);
            } else {
                throw new IllegalArgumentException("Error");
            }
        }

    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
