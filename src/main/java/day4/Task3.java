package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        int mas [][]  = new int [12][8];
        int maxSum = 0;
        int index = 0;
        Random rand = new Random();

        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 8; j++){
                mas[i][j] = rand.nextInt(51);
            }
        }
//        int count = 0;
//        for (int[] x : mas) {
//            count++;
//            System.out.println(Arrays.toString(x));
//            if(Arrays.stream(x).max().getAsInt() > maxSum){
//                maxSum = Arrays.stream(x).max().getAsInt();
//                index = count;
//            }
//
//        }


        int temp = 0;
        for(int i = 0; i < 12; i++){

            temp = 0;

            for(int j = 0; j < 8; j++){
                temp += mas[i][j];
            }

            if(temp > maxSum){
                maxSum = temp;
                index = i + 1;
            }
        }
        System.out.println(index);
    }
}
