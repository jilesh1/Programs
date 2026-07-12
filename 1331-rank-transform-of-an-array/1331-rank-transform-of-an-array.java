class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int nums[] = arr.clone();
        int arry[] = new int[arr.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        int count =1;
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
           
                continue;
            }
            map.put(nums[i],count);
            count++;
        }
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                arry[i]=map.get(arr[i]);
            }
        }
    return arry;
    }
}