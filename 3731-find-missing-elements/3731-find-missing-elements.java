class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set =new HashSet<>();
        List<Integer> list=new ArrayList<>();

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        
        while(min<=max){
            if(!set.contains(min)){
                list.add(min);
            }
            min++;
        }
        return list;
    }
}