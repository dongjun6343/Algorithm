import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int max = nums.length / 2;
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int num : nums){
            hs.add(num); // 3 , 1 , 2
        }
        
        if(max < hs.size()) {
            answer = max;
        } else {
            answer = hs.size();
        }
        
        return answer;
    }
}