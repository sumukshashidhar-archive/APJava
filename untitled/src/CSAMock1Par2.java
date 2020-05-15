public class Hailstone
{
    public static int hailstoneLength(int n) {
        int length = 1;
        int tempVar = n;
        while(tempVar != 1) {
            if(tempVar %2 == 0) {
                tempVar = tempVar/2;
                length++;
            }
            else {
                tempVar = (tempVar*3) + 1;
                length++;
            }
        }

        return length;
    }


    public static boolean isLongSeq(int n) {
        int len = hailstoneLength(n);
        if(len > n ) {
            return true;
        }
        return false;
    }

    public static double propLong(int n) {
        //passing in the n is enough here
        // we could use both the hailstone sequence length and the isLongseq to develop
        // we would need an array to store both the values of n and the boolean values of isLong
    }
}