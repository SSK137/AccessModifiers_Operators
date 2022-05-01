package Whileloop_Code;

public class SumofNnaturalNumber {

    public void sumofnumbers(){
        int N=1;
        int sum=0;

        while (N <= 5){
            sum=sum+N;
            N++;
        }
        System.out.println("Sum = "+sum);
    }

    public static void main(String[] args) {
        SumofNnaturalNumber sumofNnaturalNumber=new SumofNnaturalNumber();
        sumofNnaturalNumber.sumofnumbers();
    }
}
