class Solution {
    public String solution(String bin1, String bin2) {
        return intToBinary(binaryToInt(bin1) + binaryToInt(bin2));
    }

    public int binaryToInt(String binaryString) {
        return Integer.parseInt(binaryString, 2);
    }

    public String intToBinary(int num) {
        return Integer.toBinaryString(num);
    }
}