class Solution {
    public int solution(int[] array) {
        int answer = 0; // 최빈값을 담을 변수
        int[] index = new int[1000]; // 0~999까지 인덱스의 카운터
        int max = Integer.MIN_VALUE; // 최대값 저장


        for(int i=0; i<array.length; i++){
            index[array[i]]++; // 배열에 담긴 정수의 인덱스 카운터
        }

        for(int i=0; i<index.length; i++){
            if(max < index[i]){
                max = index[i]; // 인덱스 안에 든 값 중 가장 큰 값을  max 변수에 저장
                answer = i; // 
            }
        }

        int count = 0; // 최빈값이 2개이상인 경우를 찾기 위한 count 변수
        for(int i=0; i<index.length; i++){
            if(index[answer] == index[i]){ // index 배열을 순차적으로 탐색하면서 최빈값의 빈도가 동일한 경우가 존재하는 경우 count
                count++;
            }
        }

        if(count > 1){
            return -1;
        }
  

        return answer;
    }
}