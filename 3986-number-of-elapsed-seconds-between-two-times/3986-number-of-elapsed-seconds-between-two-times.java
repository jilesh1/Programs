class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {

       int s=time(startTime);
        int e=time(endTime);
        return Math.abs(s-e);
        
    }
    public int time(String t){
        String arr[]=t.split(":");

        int h=Integer.parseInt(arr[0]);
         int m=Integer.parseInt(arr[1]);
         int s=Integer.parseInt(arr[2]);

        return s=(h*3600)+(m*60)+s;
    }
}