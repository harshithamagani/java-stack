import java.util.ArrayList;
import java.util.Arrays;

public class BasicJavaOneTest{
    public static void main(String[] args) {
        BasicJavaOne b1=new BasicJavaOne();
        int [] arr= {1,3,4,5};
        int [] arr1 = b1.SqValInArr(arr);
        b1.printArr(arr1);

        System.out.println( b1.printMaxValArr(arr1));
        ArrayList<Integer> a1 = b1.oddNumsFrom1To255();
        System.out.println(a1.toString());

        System.out.println(b1.greaterThanY(arr, 4));

        int [] summary = b1.minMaxAvgArr(arr1);
        System.out.println(Arrays.toString(summary));

        int [] shifted = b1.shiftArr(arr1);
        System.out.println(Arrays.toString(shifted));
    }
}