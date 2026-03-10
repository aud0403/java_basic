package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        // 생성자를 막을수 있다.
    }

    public static int sum(int[] values) {
        int totalSum = 0;
        for (int value : values) {
            totalSum += value;
        }
        return totalSum;
    }


    public static double average(int[] values) {
        int totalSum = 0;
        for (int value : values) {
            totalSum += value;
        }
        return  totalSum/values.length;
    }

    public static int min(int[] values) {
        int min = values[0];
         for (int i = 0; values.length > i; i++){
            if (values[i] < min){
                min = values[i];
            }
         }
         return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for (int value : values) {
            if(value > max){
                max = value;
            }
        }
        return max;
    }
}
