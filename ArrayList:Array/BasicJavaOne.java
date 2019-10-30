import java.util.ArrayList;
import java.lang.Math;

public class BasicJavaOne{
    void printArr(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("printArr: "+arr[i]);
        }
    }

    int printMaxValArr(int [] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("max value is : "+max);
        return max;
    }

    ArrayList<Integer> oddNumsFrom1To255(){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<=255;i++){
            if(i%2==1){
                list.add(i); 
            }
        }
        return list;
    }
    public int greaterThanY(int [] arr,int y){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>y){
                count++;
            }
        }
        return count;
    }

    int [] SqValInArr(int [] arr){
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]*arr[i];
        }
        return arr;
    }

    int [] replcNegNumInArr(int [] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i] < 0){
                arr[i] = 0;
            }
        }
        return arr;
    }

    int [] minMaxAvgArr(int [] arr){
        int sum = 0;
        int [] result= new int[3];
        int min = arr[0];
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
            sum += arr[i];
        }
        int avg = sum/arr.length;
        result[0] = min;
        result[1] = max;
        result[2] = avg;
        return result;
    }

    int [] shiftArr(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        return arr;
    }
}