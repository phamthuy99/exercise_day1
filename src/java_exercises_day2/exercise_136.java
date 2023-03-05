package java_exercises_day2;

public class exercise_136 {
    public static void main(String[] args) {

        int[] arr = {8,2,5,6,1,7,2,4,3,3,8,-2,-8};

        boolean isCheck = false;

        for (int i = arr.length - 1; i < arr.length; i --){
            if ( arr[i] % 2 == 0){
                isCheck = true;
                System.out.printf("Phần tử chẵn cuối cùng " + arr[i]);
                break;

            }
        }

        if (!isCheck){
            System.out.print("\n-1");
        }
    }
}
