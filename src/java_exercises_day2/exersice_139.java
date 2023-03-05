package java_exercises_day2;

import java.util.Random;
import java.util.Scanner;

public class exersice_139 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập số lượng phần tử n = ");
        int n = scanner.nextInt();

        if (n < 0){
            System.out.printf("Không hợp lệ");
        }

        System.out.print("Nhập các phần tử của mảng: \n");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("a[%d] = ", i);
            // nhập các giá trị của mảng
            arr[i] = scanner.nextInt();
        }
        System.out.print("\nCác phần tử vừa nhập là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        if(n < 1){
            System.out.print("Vui lòng nhập lại");
        }else{
            exersice_139 perfect = new exersice_139();
            int pos = perfect.posPerfecrNumber(arr, n);
            System.out.printf("\nVị trí số hoàn thiện cuối cùng là: %d",pos);
        }
    }

    private boolean perfectNumber(int n)
    {
        int sum = 0;
        for (int i = 1 ; i < n; i++){
            if( n % i == 0){
                sum += i;
            }
        }
        if (sum == n){
            return true;
        }
        return false;
    }
    private int posPerfecrNumber(int arr[],int n)
    {
        for(int i = n-1 ; i >= 0; i--){
            if(perfectNumber(arr[i])){
                System.out.printf("\nSố hoàn thiện cuối cùng: %d",arr[i]);
                return i;
            }
        }
        return -1;
    }
}
