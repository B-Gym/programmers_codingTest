import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        char[] aArray = a.toCharArray();

        for(int i =0; i<aArray.length; i++){
            if(Character.isUpperCase(aArray[i])){
                aArray[i] = Character.toLowerCase(aArray[i]);
            }else {
                 aArray[i] = Character.toUpperCase(aArray[i]);
            }
            System.out.print(aArray[i]);
        }

    }
}