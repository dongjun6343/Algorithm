import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> map = new HashMap<>();
        
        // 참가자 세팅 : 1 , 동명이인이면 2 .. 
        for (String n : participant) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        
        // 완주자면 -1을 해서 0으로 세팅한다.
        for (String n : completion) {
            map.put(n, map.get(n) - 1);
        }
        
        // value 값이 0이 아닌것만 뽑는다.
        for (String name : map.keySet()) {
            if(map.get(name) != 0){
                answer = name; 
                break;
            }
        }
        return answer;
    }
}