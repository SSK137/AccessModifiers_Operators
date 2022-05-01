package For_Loop_Code;

import java.beans.PropertyEditorManager;

public class Palindrom_Number {
    int number=121;
    int num=number;
    int reverse=0;
    public void reverseint(){
        int remainder = 0;
        for (int i = 1; i <= 3; i++) {
            remainder = number % 10;
            reverse = (reverse * 10) + remainder;
            number = number / 10;
        }

    }

    public void checkpalindrom(){
        if (num == reverse) {
            System.out.println("Number Is Palindrom");
        } else {
            System.out.println("Number is not Palindrom");
        }
    }

    public static void main(String[] args) {

        Palindrom_Number palindromnumber=new Palindrom_Number();
        palindromnumber.reverseint();
        palindromnumber.checkpalindrom();

    }
}
