import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    ArrayList<Integer> printSumAndReturnArr (int [] arr){
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if( arr[i] > 10){
                list.add(arr[i]); 
            }
        }
        System.out.println("Sum of the Array : "+sum);
        return list;
    }

	public ArrayList<String> shuffleAndPrint(ArrayList<String> arrName) {
        ArrayList<String> result = new ArrayList<>();
        Collections.shuffle(arrName);
        System.out.println(arrName); 
        for( String name : arrName){
            if(name.length() > 5){
                result.add(name);
            }
        }
        return result;
    }
    
    void shuffleAplha(ArrayList<Character> alpha){

        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        Collections.shuffle(alpha);
        Character first = alpha.get(0);
        Character last = alpha.get(alpha.size()-1);
        System.out.println(alpha.get(0));
        System.out.println(alpha.get(alpha.size()-1));
        if(vowels.contains(first) && vowels.contains(last)){
            System.out.println("Very Special!!!");
        }
    }
    int [] generateRandomNum(){
        Random r = new Random();
        int [] randomArr = new int[10];
        for(int i=0;i<10;i++){
            int num = r.nextInt(100 - 55) + 55; // with bounds 0 to 5
            randomArr[i]=num;
        }
        System.out.println(Arrays.toString(randomArr));
        return randomArr;          
    }

    void sortRandArr() {
        int [] randomArr = generateRandomNum();
        Integer[] randomArrInt = Arrays.stream( randomArr ).boxed().toArray( Integer[]::new );
        ArrayList<Integer> arrList = new ArrayList<>();
        Collections.addAll(arrList, randomArrInt); 
        Collections.sort(arrList);
        System.out.println("min : "+arrList.get(0));
        System.out.println("max : "+arrList.get(arrList.size()-1));
        System.out.println("Print all elements : "+arrList.toString());
    }

    String randomString(){
        Random r = new Random();
        Character [] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        ArrayList<Character> listOfChar = new ArrayList<>();
        Collections.addAll(listOfChar,alpha); 
        String randomStr = "";
        for(int i=0;i<5;i++){       
        int num = r.nextInt(25);
        Character randChar = alpha[num];
        randomStr = randomStr.concat(randChar.toString());
        }
        return randomStr; 
    }

    String [] tenRandomStrArr(){
        String [] randomStrArr = new String[10];
        for(int i=0;i<10;i++){
            String str = randomString();
            randomStrArr[i] = str;
        }
        return randomStrArr;
    }

}
