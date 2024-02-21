class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] num_arr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        for (int i = 0; i < num_arr.length; i++) {
            numbers = numbers.replaceAll(num_arr[i], "" + i);
        }

        return answer = Long.parseLong(numbers);
    }
}