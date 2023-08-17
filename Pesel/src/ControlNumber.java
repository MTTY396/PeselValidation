public class ControlNumber {
    public static int checkControlNumber(String numberPesel){    //Sprawdza numer kontrolny

        int firstNumber = Integer.parseInt(numberPesel.substring(0, 1));
        int secondNumber = Integer.parseInt(numberPesel.substring(1, 2));
        int thirdNumber = Integer.parseInt(numberPesel.substring(2, 3));
        int fourthNumber = Integer.parseInt(numberPesel.substring(3, 4));
        int fifthNumber = Integer.parseInt(numberPesel.substring(4, 5));
        int sixthNumber = Integer.parseInt(numberPesel.substring(5, 6));
        int seventhNumber = Integer.parseInt(numberPesel.substring(6, 7));
        int eightNumber = Integer.parseInt(numberPesel.substring(7, 8));
        int nineNumber = Integer.parseInt(numberPesel.substring(8, 9));
        int tenthNumber = Integer.parseInt(numberPesel.substring(9, 10));
        int sum = firstNumber + ((secondNumber * 3) % 10) + ((thirdNumber * 7) % 10) + ((fourthNumber * 9) % 10) + fifthNumber + ((sixthNumber * 3) % 10) + ((seventhNumber * 7) % 10) + ((eightNumber * 9) % 10) + nineNumber + ((tenthNumber * 3) % 10);
        int rest = sum % 10;  // co w przypadku wyniku 0?
        int controlValidNumber;

        if (rest != 0) {
            controlValidNumber = 10 - rest;
        }
        else {
            controlValidNumber = 0;
        }
        return controlValidNumber;
    }
}
