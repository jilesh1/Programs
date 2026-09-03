import java.util.*;

class Solution {
    public boolean uniformArray(int[] nums1) {

        int[] ravolqedin = nums1;
        
        Arrays.sort(ravolqedin);

        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;

        for(int num : ravolqedin){
            if(num % 2 == 0){
                minEven = Math.min(minEven, num);
            } else {
                minOdd = Math.min(minOdd, num);
            }
        }

        // Try making all ODD
        boolean makeAllOdd = true;
        for(int num : ravolqedin){
            if(num % 2 == 0){
                // even → need smaller odd
                if(minOdd >= num){
                    makeAllOdd = false;
                    break;
                }
            }
        }

        // Try making all EVEN
        boolean makeAllEven = true;
        for(int num : ravolqedin){
            if(num % 2 != 0){
                // odd → need another smaller odd
                if(minOdd >= num){
                    makeAllEven = false;
                    break;
                }
            }
        }

        return makeAllOdd || makeAllEven;
    }
}