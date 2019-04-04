/**
 * 类作用:
 * 项目名称: microservicecloud
 * 包: PACKAGE_NAME
 * 类名称: Solution
 * 类描述: 类功能详细描述
 * 创建人: wuguang
 * 创建时间: 2019/04/03 17:53
 */
public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] returnVal;
        if(nums[0] + nums[nums.length/2-1] <= target){
            for(int i=0;i<nums.length/2;i++){
                for(int j=(i+1);j<=nums.length/2;j++){
                    if(nums[i]+nums[j] == target){
                        returnVal = new int[2];
                        returnVal[0] = i;
                        returnVal[1] = j;
                    }
                }
            }
        }else{
            for(int i=nums.length/2;i<nums.length;i++){
                for(int j=(i+1);j<nums.length;j++){
                    if(nums[i]+nums[j] == target){
                        returnVal = new int[2];
                        returnVal[0] = i;
                        returnVal[1] = j;
                    }
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        twoSum(new int[]{2,7,1,15},9);
    }
}