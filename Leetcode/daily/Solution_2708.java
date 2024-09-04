class Solution_2708 {
    public static long maxStrength(int[] nums){
        if(nums.length == 1) return nums[0];
        else{
            int temp,s=0,t=0;
            for(int i = 0;i < nums.length - 1; i++){
                for(int j = i + 1; j <=nums.length - 1; j++){
                    if(nums[j] < nums[i]){
                        temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
            long sum = 1;
            for (int i = 0; i< nums.length; i++){
                s += (nums[i] < 0) ? 1 : 0;
                t += (nums[i] > 0) ? 1 : 0;
            }
            if(s % 2 == 1){
                for(int i = 0; i < s-1; i++){
                    sum *= nums[i];
                }
            }
            else {
                for(int i = 0; i < s; i++){
                    sum *= nums[i];
                }
            }
            if(t > 0){
                for(int i = nums.length - 1; i > nums.length - t - 1; i--){
                    sum *= nums[i];
                }
            }
            if(t == 0 && s <= 1){
                sum = 0;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution_2708 solution = new Solution_2708();

        int[] nums1 = {3,-1,-5,2,5,-9};
        System.out.println(solution.maxStrength(nums1)); // 输出: 2        
        int[] nums2 = {-4,-5,-4};
        System.out.println(solution.maxStrength(nums2)); // 输出: 2

    }
}