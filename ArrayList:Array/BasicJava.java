public class BasicJava{
    //Print 1-255
    public void print1To255(){
        for(int i=1;i<=255;i++){
            System.out.println("print1To255 : "+i);
        }
    }
    //Print odd numbers between 1-255
    public void printOddNum1To255(){
    for(int i=1;i<=255;i++){
        if(i%2 == 1){
            System.out.println("printOddNum1To255 : "+i);
        }
    }
}

    //Print Sum 0-255
    public void printSumOfNums0To255(){
        int sum=0;
        for(int i=0;i<=255;i++){
            sum += i;
            System.out.println(sum);
        } 
    }
}