import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        int [] arr = {3,5,1,2,7,9,8,13,25,32};
        PuzzleJava p1 = new PuzzleJava();
        System.out.println(p1.printSumAndReturnArr(arr).toString());
        String [] arrName = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,arrName);
        System.out.println(p1.shuffleAndPrint(list).toString());

        Character [] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        ArrayList<Character> listOfChar = new ArrayList<>();
        Collections.addAll(listOfChar,alpha);        
        p1.shuffleAplha(listOfChar);

        System.out.println("Random String : "+p1.randomString());

        System.out.println(Arrays.toString(p1.tenRandomStrArr()));
    }
}