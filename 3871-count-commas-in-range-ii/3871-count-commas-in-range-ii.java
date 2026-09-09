class Solution {
    public long countCommas(long n) {
        long totalCommas = 0;
        
       
        if (n >= 1000) {
            totalCommas += (n - 1000 + 1);
        }
        
       
        if (n >= 1000000) {
            totalCommas += (n - 1000000 + 1);
        }
        
        
        if (n >= 1000000000) {
            totalCommas += (n - 1000000000 + 1);
        }
        
        
        if (n >= 1000000000000L) {
            totalCommas += (n - 1000000000000L + 1);
        }
        
        if (n >= 1000000000000000L) {
            totalCommas += (n - 1000000000000000L + 1);
        }

        return totalCommas;
    }
}
