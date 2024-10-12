import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int chk = commands[i][2];
            
            // 1. 배열 잘라서 복사 
            int[] subArray = Arrays.copyOfRange(array, start - 1, end);
            // 2. 오름차순 정렬 
            Arrays.sort(subArray);
            // chk값을 꺼내서 answer에 저장
            answer[i] = subArray[chk - 1];
        }
        return answer;
    }
}