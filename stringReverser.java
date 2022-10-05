public class stringReverser {
    public static void main(String[] args){
        String[] testStrings = {"racecar", "db", "testWord", "go hang a salami im a lasagna hog"};
        System.out.println("Iterative:");
        for(int i = 0; i < testStrings.length; i++){
            System.out.println("Starter: " + testStrings[i] + ", Reversed: " + reverseIterative(testStrings[i]));
        }
        System.out.println("\nRecursive:");
        for(int i = 0; i < testStrings.length; i++){
            System.out.println("Starter: " + testStrings[i] + ", Reversed: " + reverseRecursive(testStrings[i]));
        }
    }

    private static String reverseRecursive(String string) { //base step - convert String to and from char[]
        char[] orig = string.toCharArray();
        return new String(recursiveStep(orig));
    }

    private static char[] recursiveStep(char[] array) { //recursive step - length 1 and 2 are hardcoded, otherwise swap extremes
        int len = array.length;
        if (len == 1) {return array;};
        if (len == 2) {
            char[] result = {array[1], array[0]};
            return result; }
        char temp = array[0];
        array[0] = array[len-1];
        array[len-1] = temp;
        char[] middle = new char[len - 2];
        System.arraycopy(array, 1, middle, 0, (len-2));
        middle = recursiveStep(middle);
        System.arraycopy(middle, 0, array, 1, (len-2));
        return array;
    }

    private static String reverseIterative(String string) {
        char[] orig = string.toCharArray();
        int len = orig.length;
        char[] rev = new char[len];
        for(int i = 0; i < len; i++){
            rev[(len-1)-i] = orig[i];
        }
        return new String(rev);

    }
}