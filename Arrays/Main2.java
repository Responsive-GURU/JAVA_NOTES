package Arrays;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int arr[][] = new int[3][5];

        for(int i = 0 ; i<3; i++){
            for(int j = 0; j<5; j++){
                arr[i][j] = i+j;
            }
        }
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(arr[0].length);
    }
}
