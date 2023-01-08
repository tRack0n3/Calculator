import java.util.Scanner;


public class MainCalculator {
    public static void main(String[] args) {
        String [] operation1 = {"\\+","-","/","\\*"};
        String [] operation = {"+","-","/","*"};
        Scanner scann = new Scanner(System.in);
        int answer = 0;


        System.out.println("Введите арифметическую операцию с целыми числами: ");
        String mathEx = scann.nextLine().replaceAll("\\s","");


        int operationIndex = 0;
        for (int i = 0; i < operation.length; i++){
            if (mathEx.contains(operation[i])){
                operationIndex = i;
                break;
            }
            else{
                operationIndex -= 1;
                return;
            }
        }
        String [] digits = mathEx.split(operation1[operationIndex]);

        int digit1, digit2;
        digit1 = Integer.parseInt(digits[0]);
        digit2 = Integer.parseInt(digits[1]);


        switch (operation[operationIndex]) {
            case "+":
                answer = digit1 + digit2;
                break;
            case "-":
                answer = digit1 - digit2;
                break;
            case "/":
                answer = digit1 / digit2;
                break;
            case "*":
                answer = digit1 * digit2;
                break;
            }
        System.out.println(answer);




        //RomanNumerals roman = RomanNumerals.I;
        //System.out.println(roman.getArabicNumeral());


    }

    enum RomanNumeral {
        I(1), IV(4), V(5), IX(9), X(10),
        XL(40), L(50), XC(90), C(100),
        CD(400), D(500), CM(900), M(1000);

        private int arabicNum;

        RomanNumeral(int arabicNum) {
            this.arabicNum = arabicNum;
        }

        public int getArabicNum() {
            return arabicNum;
        }


    }

}
