package java_exercises_day2;

public class exercise_135 {
    public static void main(String[] args) {

        int[] arr = {1,-2,3,-6,5};

        boolean isCheck = false;
        for (int i : arr) {
            if (i > 0) {
                isCheck = true;
                System.out.printf("số dương đầu tiên: " + i);
                break;
            }
        }
        if (!isCheck){
            System.out.print("\n-1");
        }

    }
}
