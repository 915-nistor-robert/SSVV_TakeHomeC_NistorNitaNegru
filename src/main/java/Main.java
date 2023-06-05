import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] feelings = new int[]{-1,-1,0,0,1,1,-1,1,0,-1,1,0,1,1,-1,0,1,1};
        FeelingsArray feelingObj = new FeelingsArray(feelings);
        System.out.println(Arrays.toString(feelingObj.getFeelings()));
        feelingObj.beHappy();
        System.out.println(Arrays.toString(feelingObj.getFeelings()));

    }
}