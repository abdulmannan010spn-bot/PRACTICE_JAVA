class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i=0; i<piles.length; i++){
            max = Math.max(piles[i],max);
        }

        int low = 1;
        int high = max;
        int ans = max;

        while(low<=high){
            int mid = low + (high - low) / 2;

            long hours = 0;

            for(int i = 0; i < piles.length; i++) {
                hours += ((long)piles[i] + mid - 1) / mid;
            }

            if(hours<=h){
                ans = mid;
                high = mid-1;
            }

            else{
                low = mid+1;
            }
        }
        return ans;
    }
}