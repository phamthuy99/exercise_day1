package java_exercises_day2;

import java.util.Random;
import java.util.Scanner;

public class exersice_141 {
    public static void main(String[] args) {
        int n;
        System.out.print("Nhập n: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        in.close();

        double min = -1;
        int firstIn = 0;
        boolean isCheck = false;


        double[] arr = new double[n];
        Random random = new Random();
        for (int k =0; k< n; k++){
            arr[k] = random.nextDouble(200)-100;
            System.out.printf("%.1f ",arr[k]);
        }
        int i;
        for (i = 0; i < n; i++){
            if ( arr[i] > 0 ){
                isCheck = true;
                if (firstIn == 0){
                    min = arr[i];
                    firstIn ++;
                }else if (arr[i] < min){
                    min = arr[i];
                }
            }
        }

        int viTri = 0;
        for (i = 0; i < n; i++){
            if(arr[i] == min){
                viTri = i;
            }
        }
        System.out.println();


        if (isCheck){
            System.out.printf("vị trí giá trị dương nhỏ nhất là : %d" , viTri);
        }else {
            System.out.printf("\n không có giá trị nào thỏa mãn");
        }

    }
}
