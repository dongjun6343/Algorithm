import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        
        Deque<Integer> deque = new ArrayDeque<>();
       
        for(int arrChk : arr){
            // 1. deque 사이즈 유무
            if(deque.size() == 0){
                deque.push(arrChk);
            } else {
                // 비교 후 없으면 추가
                if(deque.peek() != arrChk){
                    deque.push(arrChk);
                }
            }
        }
        
        int[] answer = new int[deque.size()];
        int index = 0;
        while (!deque.isEmpty()) {
            // 마지막부터 꺼내기
            answer[index++] = deque.pollLast();
        }

        return answer;
    }
}