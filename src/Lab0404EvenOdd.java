public class Lab0404EvenOdd
{
    public static void main(String[] args) {
        int numToExamine = 4;
        int numMod = 0;

        numMod = numToExamine % 2;

        if (numMod == 1) {
            System.out.println("The number " + numToExamine + " is odd.");
        } else {
            System.out.println("The number " + numToExamine + " is even.");
        }
    }
}