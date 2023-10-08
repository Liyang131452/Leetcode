package Leetcode_17;

/*给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，
另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。

请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。

注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。
为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，
后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。

示例 1：
输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
输出：[1,2,2,3,5,6]
解释：需要合并 [1,2,3] 和 [2,5,6] 。
合并结果是 [一,二,2,三,5,6] ，其中斜体加粗标注的为 nums1 中的元素。*/
public class Solution {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + "\t");
        }
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (0 == n) {
            return;
        }
        if(m==0&n!=0){
            for (int i = 0; i < n; i++) {
                nums1[i]=nums2[i];
            }
            return;
        }
        int length=nums1.length-1;
        m--;
        n--;
        //nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        for (int i = length; i >=0; i--) {
            if(nums1[m]<=nums2[n]){
                nums1[i]=nums2[n];
                n--;
            }else{
                nums1[i]=nums1[m];
                m--;
            }
            if(n==-1){
                break;
            }
        }
        if(n!=-1){
            //注意，此时必须为i<=n,因为n可能等于0，如果i<n,则可能无法将n=0的元素放进去
            for (int i = 0; i <=n; i++) {
                nums1[i]=nums2[i];
            }
        }
    }
}
