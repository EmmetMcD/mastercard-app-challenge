public class modeFinder{
    public static void main(String[] args){
        int[] testArray = generateArray(20, 0, 10);
        System.out.print("Test Array = [");
        for(int i = 0; i < testArray.length; i++){
            System.out.print(testArray[i] + ", ");
        }
        System.out.println("]");
        System.out.println("Mode = " + findMode(testArray));
    }
    private static int[] generateArray(int len, int min, int max) {
        int[] result = new int[len];
        for(int i = 0; i < len; i++){
            result[i] = min + (int) Math.round((Math.random() * (max-min)));
        }
        return result;
    }


    private static int findMode(int[] array) {
        int len = array.length;
        int[] maxMin = extremes(array);
        int min = maxMin[1];
        int[] count = new int[maxMin[0] - (min-1)]; //count is of individual int counts
        for(int i = 0; i < len; i++){ //populating count[]
            count[array[i]-(min)]++;
        }
        int mode = 0;
        int result = 0;
        for(int i = 0; i < count.length; i++){ //finding the mode
            if(count[i] > mode){
                mode = count[i];
                result = i + (min);
            }
        }
        return result;
    }

    private static int[] extremes(int[] array) { //quick finder for max and min
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            int num = array[i];
            if(num > max) {max = num;}
            if(num < min) {min = num;}
        }
        int[] result = {max, min};
        return result;
    }
}