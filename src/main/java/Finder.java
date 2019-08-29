public class Finder {

    public static Integer findMax(int[] intArray) {
        if(intArray == null || intArray.length == 0) {
            return null;  // return null in case the input array is null or empty.
        }
        else {
            int max = intArray[0];
            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] > max) {
                    max = intArray[i];
                }
            }
            return max; //return max
        }
    }


    public static Integer findMin(int[] intArray) {
        if(intArray == null || intArray.length == 0) {
            return null;  // return null in case the input array is null or empty.
        }
        else {
            int min = intArray[0];
            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] < min) {
                    min = intArray[i];
                }
            }
            return min; //return min
        }
    }
}
