package java_exercises_day2;

public class exercise_137 {
    public static void main(String[] args) {
        int[] arr = {23,5,9,3,51,1,37,0};

        int i;
        int min = arr[0];
        for ( i = 0 ; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.printf("Vị trí = %d, có giá trị = %d là nhỏ nhất",i, min);
    }
}
