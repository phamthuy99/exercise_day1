package java_exercises_day2;

import java.util.Random;
import java.util.Scanner;

public class exercise_134 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("In put n: ");
        int n = scanner.nextInt();
        scanner.close();

        double[] arr = new double[n];
        Random random  = new Random();

        for (int i = 0; i < n; i++){
            arr[i] = random.nextFloat();
        }

        System.out.print("Array: ");


        double max = arr[0];
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + "\t");
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println();
        System.out.printf("Max array: " + max);

    }
}
