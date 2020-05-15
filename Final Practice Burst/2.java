public class checkDigit {

    private static int countIncorrectCall = 0; 
    public static int getCheck(int num) {

    }

    public static boolean isValid(int numWithCheckDigit) {

        int checkDig = numWithCheckDigit % 10; 
        numWithCheckDigit = Integer(numWithCheckDigit / 10); 
        if(checkDig == getCheck(numWithCheckDigit)) {
            return true;
        }
        else {
            countIncorrectCall ++; 
            return false; 
        }


    }
}