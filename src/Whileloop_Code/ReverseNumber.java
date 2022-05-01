package Whileloop_Code;

public class ReverseNumber {
    public void reverseint() {
        int number = 231;
        int remainder = 0;
        int reverse=0;

        while (number != 0) {
            remainder = number % 10;
            reverse=(reverse*10)+remainder;
            number = number / 10;

        }
        System.out.println(reverse);
    }
    public static void main(String[] args) {

        ReverseNumber reverseobj = new ReverseNumber();
        reverseobj.reverseint();
    }
}
