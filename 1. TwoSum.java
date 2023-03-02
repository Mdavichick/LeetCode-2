class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
   
        for (int x = 0; x < nums.length; x++){
            for (int y = nums.length-1; y > x; y--){
                if(nums[x]+nums[y]==target){
                    int[] myIntArray = new int[]{x,y};
                    return myIntArray;
                }
            }
        }
    
        return null;
    }

     public static void main(String[] args) {
        int[] myIntArray = new int[]{1,2,3,4};
        myIntArray = twoSum(myIntArray,6);
        System.out.print(myIntArray[0]+"," + myIntArray[1]);
    }
}


