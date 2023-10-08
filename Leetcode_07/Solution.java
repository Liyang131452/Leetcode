package Leetcode_07;

/*给你一个升序排列的数组nums,请你原地删除重复出现的元素,使每个元素只出现一次,返回删除后数组的新长度。元素的相对顺序应该保持一致。
然后返回 nums中唯一元素的个数。
考虑 nums 的唯一元素的数量为 k,你需要做以下事情确保你的题解可以被通过：
更改数组nums,使nums的前k个元素包含唯一元素,并按照它们最初在nums中出现的顺序排列。nums的其余元素与nums的大小不重要。
判题标准:
系统会用下面的代码来测试你的题解:
int[] nums = [...]; // 输入数组
int[] expectedNums = [...]; // 长度正确的期望答案
int k = removeDuplicates(nums); // 调用
assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
如果所有断言都通过，那么您的题解将被通过。

示例 1：
输入：nums = [1,1,2]
输出：2, nums = [1,2,_]
解释：函数应该返回新的长度 2 ,并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。
leetcode官方题解:
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int fast = 1, slow = 1;
        while (fast < n) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }
}

*/
public class Solution {
    public static void main(String[] args) {
        // 输入数组
        int[] nums = {1, 1, 2};
        // 长度正确的期望答案
        int[] expectedNums = {1, 2,};
        // 调用
        int k = removeDuplicates(nums);
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
        }

    }

    static int removeDuplicates(int[] nums) {
        int temp = nums[0];
        int j = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == temp) {
                continue;
            } else {
                nums[j] = nums[i];
                temp = nums[j];
                j++;
            }
        }
        return j;
    }
}
